package com.legalbreeze.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "user_details")
public class UserDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_detail_id")
    private int userDetailId;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "pin")
    private int pin;

    @Column(name = "cases_fought")
    private int casesFought;

    @Column(name = "casesWon")
    private int casesWon;

    @Column(name = "success_ratio")
    private double successRatio;

    @Column(name = "twitter")
    private String twitter;

    @Column(name = "linkedIn")
    private String linkedIn;

    @Column(name = "profile_pic")
    private String profilePic;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "district_id", referencedColumnName = "district_id")
    private District district;

    // bi-directional mapping
    @OneToOne(mappedBy = "userDetail", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private User user;

}

// done