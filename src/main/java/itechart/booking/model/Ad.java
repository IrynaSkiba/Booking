package itechart.booking.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

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

}
