package com.ibrahim.homestore.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seller extends AppUser {

    private String storeName;

    private String city;

    private String province;

    private String shippingCompany;

}
