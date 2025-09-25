package com.legalbreeze.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "status")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "status_id", nullable = false)
    private int statusId;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "status", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Case> cases;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "status", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Bid> bids;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "status", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<HiredBidApplicant> hiredBidApplicants;

    Status(int statusId, String name) {
        this.statusId = statusId;
        this.name = name;
    }

    // public static Status fromId(int id) {
    // for (Status status : Status.values()) {
    // if (status.id == id) {
    // return status;
    // }
    // }
    // throw new IllegalArgumentException("Invalid status id: " + id);
    // }
}

// done