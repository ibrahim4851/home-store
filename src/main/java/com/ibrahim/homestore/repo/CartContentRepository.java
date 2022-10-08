package com.ibrahim.homestore.repo;

import com.ibrahim.homestore.entity.CartContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartContentRepository extends JpaRepository<CartContent, Long> {
}
