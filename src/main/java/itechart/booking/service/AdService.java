package itechart.booking.service;

import itechart.booking.dto.AdDto;
import itechart.booking.model.Ad;
import itechart.booking.model.Amenity;
import itechart.booking.model.User;

public interface AdService {
    Ad createAd(AdDto adDto, Amenity amenity, User user);
}
