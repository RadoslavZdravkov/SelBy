package com.zdravkov.SelBy20;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/demo")
public class MainController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addNewUser(){
        User user = new User();
        user.setFirstName("Radoslav");
        user.setLastName("Zdravkov");
        user.setEmail("rado.pet02@gmail.com");
        userRepository.save(user);
        return "Saved!";
    }

//    @GetMapping(path="/add")
//    public @ResponseBody Iterable<User> getAllUsers(){
//        return userRepository.findAll();
//    }

    @GetMapping(path="/add")
    public String getAllUsers(){
        userRepository.findAll();
        return "add";
    }

}
