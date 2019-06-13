package itechart.booking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "tariffs")
public class Tariff {
    @Id
    @Column(name = "tariff_id")
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private int rate;
}
