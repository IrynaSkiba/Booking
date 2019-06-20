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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "phone_number")
    private int phoneNumber;
    private String skype;
    private int telegram;
    private String vk;
    private String email;

    @OneToOne(mappedBy = "contact", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private User user;

    public Contact(int phoneNumber, String skype, int telegram, String vk, String email) {
        this.setPhoneNumber(phoneNumber);
        this.setSkype(skype);
        this.setTelegram(telegram);
        this.setVk(vk);
        this.setEmail(email);
    }

    public Contact() {
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id +
                ", \"phoneNumber\":" + phoneNumber +
                ", \"skype\":\"" + skype + '\"' +
                ", \"telegram\":" + telegram +
                ", \"vk\":\"" + vk + '\"' +
                ", \"email\":\"" + email + '\"' +
                '}';
    }
}
