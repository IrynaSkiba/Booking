package itechart.booking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contacts")
public class Contact {
    @Id
    @Column(name = "contact_id")
    private Long id;
    @Column(name = "phoneNumber")
    private int phoneNumber;
    private String skype;
    private int telegram;
    private String vk;
    private String email;
}
