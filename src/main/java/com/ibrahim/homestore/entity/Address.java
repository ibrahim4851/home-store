package com.ibrahim.homestore.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String title;

    private String street;

    private String neighborhood;

    private String province;

    private String city;

    private String apartmentNo;

    private String floor;

    private Boolean isDefault;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "appuserid", referencedColumnName = "id")
    private AppUser appUser;
}
