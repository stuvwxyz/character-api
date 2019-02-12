package org.gordianknots.charactersapi.repositories;

import org.gordianknots.charactersapi.models.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, Long> {

}
