package org.gordianknots.charactersapi.repositories;

import java.util.List;

import org.gordianknots.charactersapi.models.Character;
import org.gordianknots.charactersapi.models.Location;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CharacterRepositoryImpl implements CharacterRepositoryCustom {
    
    @Override
	public List<Location> listAllLocationsFromCharacterId(Long id, CharacterRepository characterRepository) {

        Character character;
        character = characterRepository.findById(id).orElse(null);
        return character.getCharacterLocations();        
    }   
}