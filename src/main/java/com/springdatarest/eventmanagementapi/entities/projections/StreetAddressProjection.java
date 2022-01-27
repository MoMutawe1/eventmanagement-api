package com.springdatarest.eventmanagementapi.entities.projections;

import com.springdatarest.eventmanagementapi.entities.Venue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "streetAddress", types = {Venue.class})
public interface StreetAddressProjection {
    @Value("#{target.streetAddress} #{target.streetAddress2}")
    String getCompleteStreetAddress();
}
