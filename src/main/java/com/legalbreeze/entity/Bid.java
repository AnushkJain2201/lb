package com.legalbreeze.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "bids")
@Getter @Setter
public class Bid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bid_id")
    private int bidId;

    @Column(name = "issue")
    private String issue;

    @Column(name = "description")
    private String description;

    @Column(name = "budget")
    private int budget;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "status_id", referencedColumnName = "status_id")
    private Status status;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "deadline")
    private Date deadline;

    @Column(name = "no_of_applicants")
    private int noOfApplicants;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "client_id", referencedColumnName = "user_id")
    private User client;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "bid", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<BidApplicant> bidApplicants;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "bid", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<HiredBidApplicant> hiredBidApplicants;


}
