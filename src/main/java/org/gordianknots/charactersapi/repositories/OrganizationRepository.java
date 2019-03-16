package org.gordianknots.charactersapi.repositories;

import org.gordianknots.charactersapi.models.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
    public List<Organization> findAllByOrderByOrganizationNameAsc();

}
