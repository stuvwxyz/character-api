package org.gordianknots.charactersapi.controllers;

import org.gordianknots.charactersapi.models.Organization;
import org.gordianknots.charactersapi.repositories.OrganizationRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/organization")
public class OrganizationController {
    @Autowired
    private OrganizationRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Organization> getAllOrganizations() {
        return repository.findAllByOrderByOrganizationNameAsc();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Organization get(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Organization create(@RequestBody Organization organization) {
        return repository.save(organization);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Organization update(@PathVariable Long id, @RequestBody Organization organization) {
        Organization existingOrganization = repository.findById(id).orElse(null);
        if (existingOrganization != null) {
            BeanUtils.copyProperties(organization, existingOrganization);
            existingOrganization = repository.save(existingOrganization);
        }
        return existingOrganization;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        repository.delete(repository.findById(id).orElse(null));
    }
}

