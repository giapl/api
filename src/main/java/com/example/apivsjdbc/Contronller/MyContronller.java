package com.example.apivsjdbc.Contronller;

import com.example.apivsjdbc.Enity.User;
import com.example.apivsjdbc.Service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class MyContronller {
  @Autowired
  private UserService userService;
  @GetMapping("")
  public ResponseEntity<?> getUser(){
    List<User> user=userService.getUser();
    return ResponseEntity.ok(user);
  }
  /*@PostMapping("/create")
  public ResponseEntity<?> createUser (@RequestBody User newUser1) {
    User user=userService.createUser(newUser1);
    return ResponseEntity.ok(user);
  }
   */
  @PostMapping("")
  public ResponseEntity<String> save (@RequestBody User newUser1) {
    try {
      // Lưu trữ dữ liệu vào cơ sở dữ liệu MySQL bằng JDBC
      userService.save(newUser1);

      return ResponseEntity.ok("Dữ liệu đã được lưu trữ thành công");
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Lỗi khi lưu trữ dữ liệu");
    }
  }
  @DeleteMapping("/id")
  public ResponseEntity<?> deletUser(@RequestParam int id){
    User user=userService.deletUser(id);
    return ResponseEntity.ok(user);
  }
  @PutMapping("/update")
  public ResponseEntity<?> updateUser(@RequestBody User user1){
    User user=userService.updateUser(user1);
    return ResponseEntity.ok(user);
  }
}
