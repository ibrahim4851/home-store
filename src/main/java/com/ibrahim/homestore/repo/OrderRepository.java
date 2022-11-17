package com.ibrahim.homestore.repo;

import com.ibrahim.homestore.entity.ShopOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<ShopOrder, Long> {
}
