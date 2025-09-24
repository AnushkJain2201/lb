package com.legalbreeze.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "states")
@Setter
@Getter
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "state_id")
    private int stateId;

    @Column(name = "name")
    private String name;
}

// done