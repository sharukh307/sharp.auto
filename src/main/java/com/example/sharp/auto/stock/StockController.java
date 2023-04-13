package com.example.sharp.auto.stock;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/stock")
public class StockController {

    @Autowired
    StockService stockService;

    @PostMapping("/add")
    public StockDTO addStock(@RequestBody StockDTO stockDTO){
        return stockService.addStock(stockDTO);
    }

    @GetMapping("/get")
    public StockDTO get(@RequestParam Long id){
        return stockService.findById(id);
    }

    @PutMapping("/update")
    public StockDTO updateStock(@RequestBody StockDTO stockDTO){
        return stockService.update(stockDTO);
    }

    @DeleteMapping("/delete")
    public Long delete(@RequestParam Long id){
        return stockService.delete(id);
    }

    @GetMapping("getAll")
    public List<StockDTO> getAllStock(){
        return stockService.getAll();
    }


    
    
}
