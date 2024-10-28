package com.nimapinfotech.product.repository;

import com.nimapinfotech.product.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
