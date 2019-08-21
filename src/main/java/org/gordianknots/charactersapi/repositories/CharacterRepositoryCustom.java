package org.gordianknots.charactersapi.repositories;

import org.gordianknots.charactersapi.models.Location;

import java.util.List;

public interface CharacterRepositoryCustom{
    public List<Location> listAllLocationsFromCharacterId(Long id, CharacterRepository characterRepository);  
}