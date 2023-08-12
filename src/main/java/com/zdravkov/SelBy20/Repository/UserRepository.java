package com.zdravkov.SelBy20.Repository;

import com.zdravkov.SelBy20.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
