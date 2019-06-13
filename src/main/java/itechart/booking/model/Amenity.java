package itechart.booking.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "amenities")
@Getter
@Setter
public class Amenity {
    @Id
    @Column(name = "amenity_id")
    private Long id;
    private boolean wifi;
    private boolean parking;
    private boolean kitchen;
    @Column(name = "air_conditioning")
    private boolean airConditioning;
    @Column(name = "washing_machine")
    private boolean washingMachine;
    private boolean iron;
    private boolean tv;
    @Column(name = "hair_dryer")
    private boolean hairDryer;
    @Column(name = "electric_kettle")
    private boolean electrickettle;
    @Column(name = "clothes_dryer")
    private boolean clothesDryer;
    @Column(name = "private_bathroom")
    private boolean privateBathroom;
    private boolean heating;
    private boolean soundproofing;
    @Column(name = "fire_alarms")
    private boolean fireAlarms;
    private boolean balcony;
    @Column(name = "wheelchair_accessible")
    private boolean wheelchairAccessible;
    @Column(name = "upper_floors_accessible_by_lift")
    private boolean upperFloorsAccessibleByLift;
    @Column(name = "laptop_friendly_workspace")
    private boolean laptopFriendlyWorkspace;
    @Column(name = "pets_allowed")
    private boolean petsAllowed;
    private boolean view;
    private boolean fireplace;
    private boolean shampoo;
}
