package softuni.exam.models.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "apartments")
public class Apartment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "apartment_type",nullable = false)
    @Enumerated(EnumType.STRING)
    private ApartmentType apartmentType;


    //its BigDecimal because @Min does not support double and float
    @Column(nullable = false)
    private BigDecimal area;


    @ManyToOne(optional = false)
    private Town town;

    public Apartment(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ApartmentType getApartmentType() {
        return apartmentType;
    }

    public void setApartmentType(ApartmentType apartmentType) {
        this.apartmentType = apartmentType;
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    public Town getTown() {
        return town;
    }

    public void setTown(Town town) {
        this.town = town;
    }
}
