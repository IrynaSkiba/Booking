package itechart.booking.service.impl;

import itechart.booking.dto.UserDto;
import itechart.booking.model.Contact;
import itechart.booking.model.Tariff;
import itechart.booking.model.User;
import itechart.booking.repository.UserRepository;
import itechart.booking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserDetailsService, UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        User user = userRepository.findByLogin(login);
        if (user == null) {
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.User(user.getLogin(), user.getPassword(), getAuthority());
    }

    private List getAuthority() {
        return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
    }

    @Override
    public User saveUser(UserDto userDto, Contact contact, Tariff tariff) {
        User user = new User(
                userDto.getLogin(),
                passwordEncoder.encode(userDto.getPassword()),
                userDto.getName(),
                contact,
                tariff);
        userRepository.save(user);
        return user;
    }

    @Override
    public User findByLogin(String login) {
        return userRepository.findByLogin(login);
    }
}
