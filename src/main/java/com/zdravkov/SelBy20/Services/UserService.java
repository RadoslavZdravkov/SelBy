package com.zdravkov.SelBy20.Services;

import com.zdravkov.SelBy20.Models.User;
import com.zdravkov.SelBy20.dto.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto registrationDto);
}
