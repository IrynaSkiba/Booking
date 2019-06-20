package itechart.booking.service;

import itechart.booking.dto.UserDto;
import itechart.booking.model.Contact;

public interface ContactService {
    Contact saveContact(UserDto userDto);
}
