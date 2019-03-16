package org.gordianknots.charactersapi.repositories;

import org.gordianknots.charactersapi.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LocationRepository extends JpaRepository<Location, Long> {
    public List<Location> findAllByOrderByLocationNameAsc();

}
