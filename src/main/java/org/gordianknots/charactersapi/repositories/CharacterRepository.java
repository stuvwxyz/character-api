package org.gordianknots.charactersapi.repositories;

import org.gordianknots.charactersapi.models.Character;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CharacterRepository extends JpaRepository<Character, Long>, CharacterRepositoryCustom {
    public List<Character> findAllByOrderByCharacterNameAsc();    
}
