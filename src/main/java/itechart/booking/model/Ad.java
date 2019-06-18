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
}
