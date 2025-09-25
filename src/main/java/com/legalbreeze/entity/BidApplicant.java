package com.legalbreeze.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "bid_applicants")
@Getter @Setter
public class BidApplicant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bid_applicant_id")
    private int bidApplicantId;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "bid_id", referencedColumnName = "bid_id")
    private Bid bid;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "applicant_id", referencedColumnName = "user_id")
    private User applicant;

    @Column(name = "bid_amount")
    private int bidAmount;
}
