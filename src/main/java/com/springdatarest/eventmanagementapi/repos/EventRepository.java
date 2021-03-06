package com.springdatarest.eventmanagementapi.repos;

import com.springdatarest.eventmanagementapi.entities.Event;
import com.springdatarest.eventmanagementapi.entities.projections.PartialEventProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Repository;

import java.time.ZoneId;

@RepositoryRestResource(excerptProjection = PartialEventProjection.class)
public interface EventRepository extends PagingAndSortingRepository<Event, Long> {

    Page<Event> findByName(@Param("name")String name, Pageable pageable);

    Page<Event> findByNameAndZoneId(@Param("name")String name, @Param("zoneId") ZoneId zoneId, Pageable pageable);

    @Override
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    void deleteById(Long id);
}
