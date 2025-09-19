package com.lb.entities;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class Lawyer {
    private int lawyerId;
    private User user;

    @Enumerated(EnumType.STRING)
    private ProfessionalQualification professionalQualification;

    @Enumerated(EnumType.STRING)
    private Specialization specialization;

    @Enumerated(EnumType.STRING)
    private ServiceType serviceType;

    @Enumerated(EnumType.STRING)
    private PracticeStructure practiceStructure;
}
