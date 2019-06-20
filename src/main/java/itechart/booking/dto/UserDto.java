package itechart.booking.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private String name;
    private String login;
    private String password;
    private int phoneNumber;
    private String skype;
    private int telegram;
    private String vk;
    private String email;
}
