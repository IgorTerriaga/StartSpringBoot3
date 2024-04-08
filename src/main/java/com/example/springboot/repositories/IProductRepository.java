package com.example.springboot.repositories;

import org.springframework.data.domain.Pageable;
import com.example.springboot.models.ProductModel;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IProductRepository extends JpaRepository<ProductModel, UUID> {
//    Page<ProductModel> findAll(Pageable pageable);
}
