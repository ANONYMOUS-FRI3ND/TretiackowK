package com.psuti.TretiackowK.entities;


import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "countries")
public class Country implements Serializable {
    @Id
    @Column(name = "name", nullable = false)
    private String name;
}

