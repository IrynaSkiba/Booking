package itechart.booking.service;

import itechart.booking.dto.UserDto;
import itechart.booking.model.Contact;
import itechart.booking.model.Tariff;
import itechart.booking.model.User;

public interface UserService {
    User saveUser(UserDto user, Contact contact, Tariff tariff);
    User findByLogin(String login);
}
