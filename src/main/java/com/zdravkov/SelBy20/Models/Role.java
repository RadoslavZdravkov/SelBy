package com.zdravkov.SelBy20.Models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "roles")
@Getter
@Setter
public class Role {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column
    private String roleType;

    public Role(){}
    public Role(String roleType){
        this.roleType = roleType;
    }

}
