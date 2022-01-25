package com.springdatarest.eventmanagementapi.repos;

import com.springdatarest.eventmanagementapi.entities.Event;
import com.springdatarest.eventmanagementapi.entities.Venue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VenueRepository extends CrudRepository<Venue, Long> {
}
