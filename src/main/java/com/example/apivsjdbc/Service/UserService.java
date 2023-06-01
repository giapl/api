package com.example.apivsjdbc.Service;

import com.example.apivsjdbc.Enity.User;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface UserService {


  public List<User> getUser();// get lay ra danh sach
  public User createUser(User newUser1);// post them du lieu
  public User deletUser(int id); // delete xoa du lieu dua vao id
  public User updateUser(User user1); // put update du lieu treen du lieu da co

  public void save(User newUser1);
}