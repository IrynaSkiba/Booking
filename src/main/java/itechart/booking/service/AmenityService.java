package itechart.booking.service;

import itechart.booking.dto.AmenityDto;
import itechart.booking.model.Amenity;

public interface AmenityService {
    Amenity saveAmenity(AmenityDto amenityDto);
}
