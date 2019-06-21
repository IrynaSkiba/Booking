package itechart.booking.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "ads")
@Getter
@Setter
public class Ad {
    @Id
    @Column(name = "ad_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int rooms;
    private String city;
    private String street;
    private int house;
    private int floor;
    private int flat;
    private BigDecimal longitude;
    private BigDecimal latitude;
    private BigDecimal price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "amenity_id")
    private Amenity amenity;

    @OneToMany(mappedBy = "ad", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Image> images;

    public Ad(int rooms, String city, String street, int house, int floor,
              int flat, BigDecimal longitude, BigDecimal latitude, BigDecimal price,
              User user, Amenity amenity) {
        this.rooms = rooms;
        this.city = city;
        this.street = street;
        this.house = house;
        this.floor = floor;
        this.flat = flat;
        this.longitude = longitude;
        this.latitude = latitude;
        this.price = price;
        this.user = user;
        this.amenity = amenity;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id +
                ", \"rooms\":" + rooms +
                ", \"city\":\"" + city + '\"' +
                ", \"street\":\"" + street + '\"' +
                ", \"house\":" + house +
                ", \"floor\":" + floor +
                ", \"flat\":" + flat +
                ", \"longitude\":" + longitude +
                ", \"latitude\":" + latitude +
                ", \"price\":" + price +
                ", \"user\":" + user.getId() +
                ", \"amenity\":" + amenity +
               // ", \"images\":" + images +
                '}';
    }
}
