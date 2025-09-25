package com.legalbreeze.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Case> clientCases;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "lawyer", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Case> lawyerCases;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Bid> bids;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "applicant", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<BidApplicant> bidApplicants;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "lawyer", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<HiredBidApplicant> hiredBidApplicantsLawyer;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<HiredBidApplicant> hiredBidApplicantsClient;

    // create constructors
    // create toString() method
}

// done