package itechart.booking.service.impl;

import itechart.booking.dto.UserDto;
import itechart.booking.model.Contact;
import itechart.booking.repository.ContactRepository;
import itechart.booking.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactRepository contactRepository;

    @Override
    public Contact saveContact(UserDto userDto) {
        Contact contact = new Contact(
                userDto.getPhoneNumber(),
                userDto.getSkype(),
                userDto.getTelegram(),
                userDto.getVk(),
                userDto.getEmail());
        contactRepository.save(contact);
        return contact;
    }
}
