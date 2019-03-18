package org.gordianknots.charactersapi.models;

import org.springframework.data.annotation.ReadOnlyProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ReadOnlyProperty
    private Long locationId;
    private String locationName;
    private String locationSize;
    private String locationLocation;
    private String locationTerrain;
    private String locationFactions;
    private String locationNotes;

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationSize() {
        return locationSize;
    }

    public void setLocationSize(String locationSize) {
        this.locationSize = locationSize;
    }

    public String getLocationLocation() {
        return locationLocation;
    }

    public void setLocationLocation(String locationLocation) {
        this.locationLocation = locationLocation;
    }

    public String getLocationTerrain() {
        return locationTerrain;
    }

    public void setLocationTerrain(String locationTerrain) {
        this.locationTerrain = locationTerrain;
    }

    public String getLocationFactions() {
        return locationFactions;
    }

    public void setLocationFactions(String locationFactions) {
        this.locationFactions = locationFactions;
    }

    public String getLocationNotes() {
        return locationNotes;
    }

    public void setLocationNotes(String locationNotes) {
        this.locationNotes = locationNotes;
    }
}