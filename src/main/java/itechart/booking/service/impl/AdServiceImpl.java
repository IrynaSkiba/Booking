package itechart.booking.service.impl;

import itechart.booking.dto.AdDto;
import itechart.booking.model.Ad;
import itechart.booking.model.Amenity;
import itechart.booking.model.User;
import itechart.booking.repository.AdRepository;
import itechart.booking.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdServiceImpl implements AdService {
    @Autowired
    private AdRepository adRepository;

    @Override
    public Ad createAd(AdDto adDto, Amenity amenity, User user) {
        Ad ad = new Ad(adDto.getRooms(),adDto.getCity(),adDto.getStreet(),adDto.getHouse(),
                adDto.getFloor(),adDto.getFlat(),adDto.getLongitude(),adDto.getLatitude(),
                adDto.getPrice(),user,amenity);
        adRepository.save(ad);
        return ad;
    }
}
