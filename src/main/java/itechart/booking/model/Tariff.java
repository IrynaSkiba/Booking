package itechart.booking.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tariffs")
@Getter
@Setter
public class Tariff {
    @Id
    @Column(name = "tariff_id")
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private int rate;

    @OneToMany(mappedBy = "tariff", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<User> users;

    public Tariff() {
    }

    public List<Long> getListUsersId() {
        List<Long> list = new ArrayList<>();
        for (User user : users
        ) {
            list.add(user.getId());
        }
        return list;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id +
                ", \"name\":\"" + name + '\"' +
                ", \"description\":\"" + description + '\"' +
                ", \"price\":" + price +
                ", \"rate\":" + rate +
                ", \"users\":" + getListUsersId() +
                '}';
    }
}
