package com.zdravkov.SelBy20.Controllers;

import com.zdravkov.SelBy20.Models.User;
import com.zdravkov.SelBy20.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value="/")
    public String getPage(){
        return "Welcome!";
    }

    @GetMapping(value="/users")
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    @PostMapping(value="/save")
    public String saveUser(@RequestBody User user){
        userRepository.save(user);
        return "User saved!";
    }

    //TODO Fix the updateUser method
    @PutMapping(value="/update/{id}")
    public String updateUser(@PathVariable long id, @RequestBody User user){
        User updatedUser = userRepository.findById(id).get();
        updatedUser.setFirstName(user.getFirstName());
        updatedUser.setLastName(user.getLastName());
        updatedUser.setBirthday(user.getBirthday());
        updatedUser.setEmail(user.getEmail());
        updatedUser.setUsername(user.getUsername());
        updatedUser.setPassword(user.getPassword());
        userRepository.save(updatedUser);
        return "User updated!";
    }

    @DeleteMapping(value="/delete/{id}")
    public String deleteUser(@PathVariable long id){
        User deletedUser = userRepository.findById(id).get();
        userRepository.delete(deletedUser);
        return "User deleted!";
    }


}
