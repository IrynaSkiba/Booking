package itechart.booking.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
    @Id
    @Column(name = "user_id")
    private Long id;
    private String name;
    private String login;
    private String password;
    private BigDecimal account;
    @Column(name = "bonus_account")
    private BigDecimal bonusAccount;


}
