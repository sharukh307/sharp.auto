package com.example.sharp.auto.stock;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional
public class StockDao {
    
    @PersistenceContext
    EntityManager entityManager;

    public StockDTO addStock(StockDTO stockDTO){
        return entityManager.merge(stockDTO);
    }
}
