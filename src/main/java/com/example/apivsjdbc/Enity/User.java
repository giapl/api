package com.example.apivsjdbc.Enity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class User {
  private int id;
  private String name;
  private String email;
  private String sex;
  private String address;
}
