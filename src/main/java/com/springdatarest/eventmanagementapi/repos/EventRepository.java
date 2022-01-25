package com.springdatarest.eventmanagementapi.repos;

import com.springdatarest.eventmanagementapi.entities.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {
}
