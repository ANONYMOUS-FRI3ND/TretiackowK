package com.psuti.TretiackowK.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "cities")
public class City implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;
    @Column(nullable = false, length = 25,name = "CityName")
    private String cityname;
    @Column(nullable = false, length = 25, name = "Residents")
    private String residents;
    @Column(nullable = false, length = 25, name = "Capital")
    private String capital;
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "country")
    private Country country;
}

