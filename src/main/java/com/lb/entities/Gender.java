package com.lb.entities;

public enum Gender {
    MALE(1, "Male"),
    FEMALE(2, "Female"),
    OTHER(3, "Other");

    private final int id;
    private final String displayName;

    Gender(int id, String displayName) {
        this.id = id;
        this.displayName = displayName;
    }

    public static Gender fromId(int id) {
        for (Gender gender : Gender.values()) {
            if (gender.id == id) return gender;
        }
        throw new IllegalArgumentException("Invalid gender id: " + id);
    }
}
