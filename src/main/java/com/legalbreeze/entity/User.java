package com.legalbreeze.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity  // annotating the class as an entity and map to the db table
@Table(name = "users")  // mapping the class to the db table
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_type_id", nullable = false)
    private UserType userType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "status_id", nullable = false)
    private Status status;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    // associating userDetail with user
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_detail_id", referencedColumnName = "user_detail_id")
    private UserDetail userDetail;

    @Column(name = "joined_on")
    private Date joinedOn;

    // create constructors
    // create toString() method
}

// done