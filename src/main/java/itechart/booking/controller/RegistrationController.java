package itechart.booking.controller;

import itechart.booking.dto.UserDto;
import itechart.booking.model.Contact;
import itechart.booking.model.Tariff;
import itechart.booking.service.impl.ContactServiceImpl;
import itechart.booking.service.impl.TariffServiceImpl;
import itechart.booking.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private ContactServiceImpl contactService;
    @Autowired
    private TariffServiceImpl tariffService;

    @PostMapping(value = "/registration")
    public String addUser(@RequestBody UserDto userDto) {
        if (userService.findByLogin(userDto.getLogin()) != null) return "registration";
        userService.saveUser(userDto, contactService.saveContact(userDto), tariffService.getTariffById(1L));
        return "redirect:/oauth/token";
    }
}
