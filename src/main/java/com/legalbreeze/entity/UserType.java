package com.legalbreeze.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user_types")
@Getter
@Setter
public class UserType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_type_id", nullable = false)
    private final int userTypeId;

    @Column(name = "name", nullable = false)
    private final String name;

    UserType(int userTypeId, String name) {
        this.userTypeId = userTypeId;
        this.name = name;
    }

    // public static UserType fromId(int id) {
    // for (UserType userType : UserType.values()) {
    // if (userType.id == id) {
    // return userType;
    // }
    // }
    // throw new IllegalArgumentException("Invalid usertype id: " + id);
    // }
}

// done