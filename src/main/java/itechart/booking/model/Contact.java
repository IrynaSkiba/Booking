package itechart.booking.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "contacts")
@Getter
@Setter
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

    @OneToOne(mappedBy = "contact", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private User user;
}
