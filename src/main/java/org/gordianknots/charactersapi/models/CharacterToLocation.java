//package org.gordianknots.charactersapi.models;
//
//import org.springframework.data.annotation.ReadOnlyProperty;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class CharacterToLocation {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @ReadOnlyProperty
//    private Long id;
//    private Long characterId;
//    private Long locationId;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Long getCharacterId() {
//        return characterId;
//    }
//
//    public void setCharacterId(Long characterId) {
//        this.characterId = characterId;
//    }
//
//    public Long getLocationId() {
//        return locationId;
//    }
//
//    public void setLocationId(Long locationId) {
//        this.locationId = locationId;
//    }
//}
