package com.ibrahim.homestore.repo;

import com.ibrahim.homestore.entity.SellerProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerProductRepository extends JpaRepository<SellerProduct, Long> {

}
