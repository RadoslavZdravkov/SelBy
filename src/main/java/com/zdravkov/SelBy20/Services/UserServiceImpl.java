package com.zdravkov.SelBy20.Services;

import com.zdravkov.SelBy20.Models.Role;
import com.zdravkov.SelBy20.Models.User;
import com.zdravkov.SelBy20.Repository.UserRepository;
import com.zdravkov.SelBy20.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;


    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User(registrationDto.getFirstName(), registrationDto.getLastName(),
                registrationDto.getEmail(), registrationDto.getBirthday(), registrationDto.getUsername(),
                registrationDto.getPassword(), Arrays.asList(new Role("USER_ROLE")));
        return userRepository.save(user);
    }
}
