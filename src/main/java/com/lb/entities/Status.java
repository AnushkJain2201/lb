package com.lb.entities;

import lombok.Getter;

@Getter
public enum Status {
    ACTIVE(1, "Active"),
    INACTIVE(2, "Inactive"),
    OPEN(3, "Open"),
    CLOSED(4, "Closed"),
    BLOCKED(5, "Blocked"),
    DELETED(6, "Deleted"),
    ENGAGED(7, "Engaged"),
    REJECTED(8, "Rejected");

    private final int id;
    private final String name;

    Status(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Status fromId(int id) {
        for (Status status : Status.values()) {
            if (status.id == id) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid status id: " + id);
    }
}
