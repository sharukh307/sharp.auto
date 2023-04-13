package com.example.sharp.auto.stock;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<StockDTO,Long>{
    
    
}
