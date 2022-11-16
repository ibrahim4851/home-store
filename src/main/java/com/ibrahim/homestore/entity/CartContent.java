package com.ibrahim.homestore.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.FetchType.EAGER;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartContent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne
    private AppUser user;

    @ManyToMany(fetch = EAGER)
    @JoinColumn(name = "sellerproductid", referencedColumnName = "id")
    private List<Product> sellerProduct;

    private int quantity;
}
