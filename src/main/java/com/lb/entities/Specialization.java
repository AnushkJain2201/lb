package com.lb.entities;

import lombok.Getter;

@Getter
public enum Specialization {
    GENERAL_PRACTICE(1, "General Practice"),
    FAMILY_LAW(2, "Family Law"),
    CRIMINAL_DEFENSE(3, "Criminal Defense"),
    CORPORATE_LAW(4, "Corporate Law"),
    IMMIGRATION_LAW(5, "Immigration Law"),
    PERSONAL_INJURY(6, "Personal Injury"),
    REAL_ESTATE(7, "Real Estate"),
    EMPLOYMENT_LAW(8, "Employment Law"),
    INTELLECTUAL_PROPERTY(9, "Intellectual Property"),
    TAX_LAW(10, "Tax Law");

    private final int id;

    private final String name;

    Specialization(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Specialization fromId(int id) {
        for (Specialization specialization : Specialization.values()) {
            if (specialization.id == id) {
                return specialization;
            }
        }
        throw new IllegalArgumentException("Invalid specialization id: " + id);
    }
}