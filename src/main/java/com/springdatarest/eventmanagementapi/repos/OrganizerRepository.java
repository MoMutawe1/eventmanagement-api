package com.springdatarest.eventmanagementapi.repos;

import com.springdatarest.eventmanagementapi.entities.Event;
import com.springdatarest.eventmanagementapi.entities.Organizer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizerRepository extends CrudRepository<Organizer, Long> {
}
