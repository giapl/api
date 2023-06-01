package com.example.apivsjdbc.Service;

import com.example.apivsjdbc.Enity.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public class UserImlp implements UserService{
  public static List<User> user=new ArrayList<User>();
  static void update(String sql, int id, String name, String email, String sex, String address) {
  }

  @Override
  public List<User> getUser() {
    return user;
  }

  @Override
  public User createUser(User newUser1) {
    this.user.add(newUser1);
    return newUser1;
  }

  @Override
  public User deletUser(int id) {
    for(int i=0;i< user.size();i++){
      if(user.get(i).getId()==id){
        user.remove(i);
        break;
      }
    }
    return null;
  }

  @Override
  public User updateUser(User user1) {
    for(int i=0;i< user.size();i++){
      if(user.get(i).getId()==user1.getId()){
        user.set(i,user1);
      }
    }
    return null;
  }

  @Override
  public void save(User newUser1) {
    String sql = "INSERT INTO user (id,name, email,sex,address) VALUES (?, ?,?,?)";
    UserImlp.update(sql,newUser1.getId(), newUser1.getName(), newUser1.getEmail(),newUser1.getSex(),newUser1.getAddress());
  }
}
