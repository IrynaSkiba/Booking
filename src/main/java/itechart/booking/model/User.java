package itechart.booking.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String login;
    private String password;
    private BigDecimal account;
    @Column(name = "bonus_account")
    private BigDecimal bonusAccount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tariff_id")
    private Tariff tariff;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contact_id")
    private Contact contact;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Ad> ads;

    public User(String login, String password, String name, Contact contact, Tariff tariff) {
        this.setLogin(login);
        this.setPassword(password);
        this.setName(name);
        this.setContact(contact);
        this.setTariff(tariff);
    }

    public User() {
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id +
                ", \"name\":\"" + name + '\"' +
                ", \"login\":\"" + login + '\"' +
                ", \"password\":\"" + password + '\"' +
                ", \"account\":" + account +
                ", \"bonusAccount\":" + bonusAccount +
                ", \"tariff\":" + tariff.getId() +
                ", \"contact\":" + contact.getId() +
//                ", ads=" + ads +
                '}';
    }
}
