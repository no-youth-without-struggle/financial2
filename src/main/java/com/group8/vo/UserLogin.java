package com.group8.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserLogin {
    private int uid;
    private String username;
    private String telephone;
    private String password;
    private String passwordSalt;
    private int status;
}
