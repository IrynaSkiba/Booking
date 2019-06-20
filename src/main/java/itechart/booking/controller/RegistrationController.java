package itechart.booking.controller;

import itechart.booking.MyResponse;
import itechart.booking.dto.UserDto;
import itechart.booking.model.User;
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
        if (userService.findByLogin(userDto.getLogin()) != null) {
            MyResponse<String> response = new MyResponse<>();
            response.setCode(1);
            response.setData("\"\"");
            response.setErrorContent("A user with this login already exists.");
            return response.toString();
        }
        MyResponse<User> response = new MyResponse<>();
        User user = userService.saveUser(userDto, contactService.saveContact(userDto), tariffService.getTariffById(1L));
        response.setCode(0);
        response.setData(user);
        return response.toString();
    }
}
