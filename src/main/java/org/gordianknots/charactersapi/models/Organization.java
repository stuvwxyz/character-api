package org.gordianknots.charactersapi.models;

import org.springframework.data.annotation.ReadOnlyProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ReadOnlyProperty
    private Long organizationId;
    private String organizationName;
    private String organizationNotes;
    private String organizationPurpose;

    public Long getOrganizationId() {
        return organizationId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationNotes() {
        return organizationNotes;
    }

    public void setOrganizationNotes(String organizationNotes) {
        this.organizationNotes = organizationNotes;
    }

    public String getOrganizationPurpose() {
        return organizationPurpose;
    }

    public void setOrganizationPurpose(String organizationPurpose) {
        this.organizationPurpose = organizationPurpose;
    }
}
