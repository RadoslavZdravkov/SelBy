package com.zdravkov.SelBy20.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRegistrationDto {
    private String firstName;
    private String lastName;
    private String email;
    private String birthday;
    private String username;
    private String password;

    public UserRegistrationDto(){}

    public UserRegistrationDto(String firstName, String lastName, String email, String birthday,
                               String username, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthday = birthday;
        this.username = username;
        this.password = password;
    }
}