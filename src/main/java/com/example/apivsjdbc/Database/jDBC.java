package com.example.apivsjdbc.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jDBC {

  public static Connection getJdbc(){
    final String url="jdbc:mysql://localhost:3307/noron1";
    final String user="giap";
    final String password="@Danggiap1704";
    try{
      Class.forName("com.mysql.jdbc.Driver");
      return DriverManager.getConnection(url,user,password);
    }catch (ClassNotFoundException e){
      e.printStackTrace();
    }catch(SQLException e) {
      e.printStackTrace();
    }
    return null;
  }
  public static void main(String[] args) {
    Connection connection= getJdbc();
      if(connection!=null){
        System.out.println("ket noi thanh cong");
      }else{
        System.out.println("ket noi that bai");
      }
    }
  }
