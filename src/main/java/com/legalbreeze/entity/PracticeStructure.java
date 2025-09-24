package com.legalbreeze.entity;

import lombok.Getter;

@Getter
public enum PracticeStructure {
    SOLO_PRACTITIONER(1, "Solo Practitioners"),
    SMALL_LAW_FIRM(2, "Small Law Firms"),
    LARGE_LAW_FIRM(3, "Large Law Firms"),
    CORPORATE_LEGAL_DEPARTMENT(4, "Corporate Legal Departments"),
    GOVERNMENT_ATTORNEY(5, "Government Attorneys"),
    LEGAL_AID_ORGANIZATION(6, "Legal Aid Organizations");

    private final int id;

    private final String name;

    PracticeStructure(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static PracticeStructure fromId(int id) {
        for (PracticeStructure practiceStructure : PracticeStructure.values()) {
            if (practiceStructure.id == id) {
                return practiceStructure;
            }
        }
        throw new IllegalArgumentException("Invalid practise structure id: " + id);
    }
}