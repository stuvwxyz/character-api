package org.gordianknots.charactersapi.controllers;

import org.gordianknots.charactersapi.models.Character;
import org.gordianknots.charactersapi.repositories.CharacterRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/character")
public class CharacterController {
    @Autowired
    private CharacterRepository characterRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Character> getAllCharacters() {
        return characterRepository.findAllByOrderByCharacterNameAsc();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Character get(@PathVariable Long id) {
        return characterRepository.findById(id).orElse(null);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Character create(@RequestBody Character character) {
        return characterRepository.save(character);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Character update(@PathVariable Long id, @RequestBody Character character) {
        Character existingCharacter = characterRepository.findById(id).orElse(null);
        if (existingCharacter != null) {
            BeanUtils.copyProperties(character, existingCharacter);
            existingCharacter = characterRepository.save(existingCharacter);
        }
        return existingCharacter;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        characterRepository.delete(characterRepository.findById(id).orElse(null));
    }
}
