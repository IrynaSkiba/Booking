package itechart.booking.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "images")
@Getter
@Setter
public class Image {
    @Id
    @Column(name = "image_id")
    private Long id;
}
