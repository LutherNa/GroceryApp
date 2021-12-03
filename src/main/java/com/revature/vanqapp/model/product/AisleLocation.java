package com.revature.vanqapp.model.product;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor

@Table(name = "aisleLocations")
public class AisleLocation {
    @Id @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int aisleLocationId;
    @Column
    private String bayNumber;
    @Column
    private String description;
    @Column
    private String AISLE;
    @Column
    private String number;
    @Column
    private String numberOfFacings;
    @Column
    private String side;
    @Column
    private String shelfNumber;
    @Column
    private String shelfPositionInBay;
}