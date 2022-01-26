package com.springdatarest.eventmanagementapi.entities.projections;

import com.springdatarest.eventmanagementapi.entities.Event;
import org.springframework.data.rest.core.config.Projection;

import java.time.ZonedDateTime;

@Projection(name="partial" ,types = {Event.class})
public interface partialEventProjection {
    String getName();
    ZonedDateTime getStartTime();
    ZonedDateTime getEndTime();
}
