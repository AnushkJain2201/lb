package com.lb.entities;

import lombok.Getter;

@Getter
public enum ProfessionalQualification {
    LICENSED_ATTORNEY(1, "Licensed Attorneys/Lawyers"),
    PARALEGAL(2, "Paralegals"),
    LEGAL_DOCUMENT_PREPARER(3, "Legal Document Preparers"),
    NOTARY(4, "Notaries");

    private final int id;

    private final String name;

    ProfessionalQualification(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static ProfessionalQualification fromId(int id) {
        for (ProfessionalQualification professionalQualification : ProfessionalQualification.values()) {
            if (professionalQualification.id == id) return professionalQualification;
        }
        throw new IllegalArgumentException("Invalid professionalQualification id: " + id);
    }
}
