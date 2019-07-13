package org.gordianknots.charactersapi.models;

import org.springframework.data.annotation.ReadOnlyProperty;

import javax.persistence.*;
import java.util.List;

@Entity
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ReadOnlyProperty
    private Long characterId;
    private String characterName;
    private String characterAge;
    private String characterGender;
    private String characterRace;
    private String characterRelations;
    private String characterDescription;
    private String characterPurpose;
    private String characterBackground;
    private String characterNotes;
    private String characterAlive;

    @OneToMany
    @JoinTable(name = "character_to_location",
            joinColumns = @JoinColumn(name = "characterId", referencedColumnName = "characterId"),
            inverseJoinColumns = @JoinColumn(name = "locationId", referencedColumnName = "locationId"))
    private List<Location> characterLocations;


    public List<Location> getCharacterLocations() {
        return characterLocations;
    }

    public void setCharacterLocations(List<Location> characterLocations) {
        this.characterLocations = characterLocations;
    }

    public Long getCharacterId() {
        return characterId;
    }

    public String getcharacterName() {
        return characterName;
    }

    public void setcharacterName(String charName) {
        this.characterName = charName;
    }

    public String getCharacterAge() {
        return characterAge;
    }

    public void setCharacterAge(String characterAge) {
        this.characterAge = characterAge;
    }

    public String getCharacterGender() {
        return characterGender;
    }

    public void setCharacterGender(String characterGender) {
        this.characterGender = characterGender;
    }

    public String getCharacterRace() {
        return characterRace;
    }

    public void setCharacterRace(String characterRace) {
        this.characterRace = characterRace;
    }


    public String getCharacterRelations() {
        return characterRelations;
    }

    public void setCharacterRelations(String characterRelations) {
        this.characterRelations = characterRelations;
    }

    public String getcharacterDescription() {
        return characterDescription;
    }

    public void setcharacterDescription(String characterDescription) {
        this.characterDescription = characterDescription;
    }

    public String getCharacterPurpose() {
        return characterPurpose;
    }

    public void setCharacterPurpose(String characterPurpose) {
        this.characterPurpose = characterPurpose;
    }

    public String getCharacterBackground() {
        return characterBackground;
    }

    public void setCharacterBackground(String characterBackground) {
        this.characterBackground = characterBackground;
    }

    public String getCharacterNotes() {
        return characterNotes;
    }

    public void setCharacterNotes(String characterNotes) {
        this.characterNotes = characterNotes;
    }

    public String getCharacterAlive() {
        return characterAlive;
    }

    public void setCharacterAlive(String characterAlive) {
        this.characterAlive = characterAlive;
    }
}
