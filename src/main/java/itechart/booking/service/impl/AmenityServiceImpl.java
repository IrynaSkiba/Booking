package itechart.booking.service.impl;

import itechart.booking.dto.AmenityDto;
import itechart.booking.model.Amenity;
import itechart.booking.repository.AmenityRepository;
import itechart.booking.service.AmenityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AmenityServiceImpl implements AmenityService {
    @Autowired
    private AmenityRepository amenityRepository;

    @Override
    public Amenity saveAmenity(AmenityDto amenityDto) {
        Amenity amenity = new Amenity(amenityDto);
        amenityRepository.save(amenity);
        return amenity;
    }
}
