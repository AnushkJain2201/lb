package com.legalbreeze.entity;

import lombok.Getter;

@Getter
public enum ServiceType {
    FULL_SERVICE_PROVIDERS(1, "Full-Service Providers"),
    LIMITED_SCOPE_PROVIDERS(2, "Limited Scope Providers"),
    ALTERNATIVE_LEGAL_SERVICE_PROVIDERS(3, "Alternative Legal Service Providers"),
    ONLINE_LEGAL_SERVICES(4, "Online Legal Services");

    private final int id;

    private final String name;

    ServiceType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static ServiceType fromId(int id) {
        for (ServiceType serviceType : ServiceType.values()) {
            if (serviceType.id == id) {
                return serviceType;
            }
        }
        throw new IllegalArgumentException("Invalid service type id: " + id);
    }
}
//('FULL_SERVICE_PROVIDERS','LIMITED_SCOPE_PROVIDERS','ALTERNATIVE_LEGAL_SERVICE_PROVIDERS','ONLINE_LEGAL_SERVICES')