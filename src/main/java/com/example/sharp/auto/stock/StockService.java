package com.example.sharp.auto.stock;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService {

    @Autowired
    StockDao stockDao;

    @Autowired
    StockRepository repository;

    public StockDTO addStock(StockDTO stockDTO){
        return repository.save(stockDTO);
        // stockDao.addStock(stockDTO);
    }
 
    public StockDTO findById(Long id){
        return repository.findById(id).get();
    }
    
    public long delete(Long id){
        repository.deleteById(id);
        return 1;
    }

    public StockDTO update(StockDTO stockDTO){
        return repository.save(stockDTO);
    }

    public List<StockDTO> getAll(){
        return repository.findAll();
    }

}
