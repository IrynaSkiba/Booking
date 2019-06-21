package itechart.booking.model;

import itechart.booking.dto.AmenityDto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "amenities")
@Getter
@Setter
public class Amenity {
    @Id
    @Column(name = "amenity_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private boolean electricKettle;
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

    @OneToOne(mappedBy = "amenity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Ad ad;

    public Amenity(boolean wifi, boolean parking, boolean kitchen, boolean airConditioning,
                   boolean washingMachine, boolean iron, boolean tv, boolean hairDryer,
                   boolean electricKettle, boolean clothesDryer, boolean privateBathroom,
                   boolean heating, boolean soundproofing, boolean fireAlarms, boolean balcony,
                   boolean wheelchairAccessible, boolean upperFloorsAccessibleByLift, 
                   boolean laptopFriendlyWorkspace, boolean petsAllowed, boolean view, 
                   boolean fireplace, boolean shampoo) {
        this.wifi = wifi;
        this.parking = parking;
        this.kitchen = kitchen;
        this.airConditioning = airConditioning;
        this.washingMachine = washingMachine;
        this.iron = iron;
        this.tv = tv;
        this.hairDryer = hairDryer;
        this.electricKettle = electricKettle;
        this.clothesDryer = clothesDryer;
        this.privateBathroom = privateBathroom;
        this.heating = heating;
        this.soundproofing = soundproofing;
        this.fireAlarms = fireAlarms;
        this.balcony = balcony;
        this.wheelchairAccessible = wheelchairAccessible;
        this.upperFloorsAccessibleByLift = upperFloorsAccessibleByLift;
        this.laptopFriendlyWorkspace = laptopFriendlyWorkspace;
        this.petsAllowed = petsAllowed;
        this.view = view;
        this.fireplace = fireplace;
        this.shampoo = shampoo;
    }
    public Amenity(){}

    public Amenity(AmenityDto amenityDto){
        this.wifi = amenityDto.isWifi();
        this.parking = amenityDto.isParking();
        this.kitchen = amenityDto.isKitchen();
        this.airConditioning = amenityDto.isAirConditioning();
        this.washingMachine = amenityDto.isWashingMachine();
        this.iron = amenityDto.isIron();
        this.tv = amenityDto.isTv();
        this.hairDryer = amenityDto.isHairDryer();
        this.electricKettle = amenityDto.isElectricKettle();
        this.clothesDryer = amenityDto.isClothesDryer();
        this.privateBathroom = amenityDto.isPrivateBathroom();
        this.heating = amenityDto.isHeating();
        this.soundproofing = amenityDto.isSoundproofing();
        this.fireAlarms = amenityDto.isFireAlarms();
        this.balcony = amenityDto.isBalcony();
        this.wheelchairAccessible = amenityDto.isWheelchairAccessible();
        this.upperFloorsAccessibleByLift = amenityDto.isUpperFloorsAccessibleByLift();
        this.laptopFriendlyWorkspace = amenityDto.isLaptopFriendlyWorkspace();
        this.petsAllowed = amenityDto.isPetsAllowed();
        this.view = amenityDto.isView();
        this.fireplace = amenityDto.isFireplace();
        this.shampoo = amenityDto.isShampoo();
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id +
                ", \"wifi\":" + wifi +
                ", \"parking\":" + parking +
                ", \"kitchen\":" + kitchen +
                ", \"airConditioning\":" + airConditioning +
                ", \"washingMachine\":" + washingMachine +
                ", \"iron\":" + iron +
                ", \"tv\":" + tv +
                ", \"hairDryer\":" + hairDryer +
                ", \"electricKettle\":" + electricKettle +
                ", \"clothesDryer\":" + clothesDryer +
                ", \"privateBathroom\":" + privateBathroom +
                ", \"heating\":" + heating +
                ", \"soundproofing\":" + soundproofing +
                ", \"fireAlarms\":" + fireAlarms +
                ", \"balcony\":" + balcony +
                ", \"wheelchairAccessible\":" + wheelchairAccessible +
                ", \"upperFloorsAccessibleByLift\":" + upperFloorsAccessibleByLift +
                ", \"laptopFriendlyWorkspace\":" + laptopFriendlyWorkspace +
                ", \"petsAllowed\":" + petsAllowed +
                ", \"view\":" + view +
                ", \"fireplace\":" + fireplace +
                ", \"shampoo\":" + shampoo +
                '}';
    }
}
