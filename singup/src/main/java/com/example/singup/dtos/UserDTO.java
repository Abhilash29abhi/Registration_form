package com.example.singup.dtos;



public class UserDTO {

  private Long id;
  private String username;
  private String password;
 

  public UserDTO() {
  }

  public UserDTO(Long id, String username, String password) {
    this.id = id;
    this.username = username;
    this.password = password;
  }

  
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getpassword() {
    return password;
  }

  public void setpassword(String password) {
    this.password = password;
  }


  
  
}
