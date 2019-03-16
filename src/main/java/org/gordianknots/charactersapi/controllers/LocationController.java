package org.gordianknots.charactersapi.controllers;

import org.gordianknots.charactersapi.models.Location;
import org.gordianknots.charactersapi.repositories.LocationRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/location")
public class LocationController {
    @Autowired
    private LocationRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Location> getAllLocations() {
        return repository.findAllByOrderByLocationNameAsc();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Location get(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Location create(@RequestBody Location location) {
        return repository.save(location);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Location update(@PathVariable Long id, @RequestBody Location location){
        Location existingLocation = repository.findById(id).orElse(null);
        if (existingLocation != null) {
            BeanUtils.copyProperties(location, existingLocation);
            existingLocation = repository.save(existingLocation);
        }
        return existingLocation;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        repository.delete(repository.findById(id).orElse(null));
    }
}
