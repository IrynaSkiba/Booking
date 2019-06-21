package itechart.booking.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class AdDto {
    private int rooms;
    private String city;
    private String street;
    private int house;
    private int floor;
    private int flat;
    private BigDecimal longitude;
    private BigDecimal latitude;
    private BigDecimal price;
    private AmenityDto amenityDto;
}
