package com.ibrahim.homestore.repo;

import com.ibrahim.homestore.entity.OrderContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderContentRepo extends JpaRepository<OrderContent, Long> {
}
