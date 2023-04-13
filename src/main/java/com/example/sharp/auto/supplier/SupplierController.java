package com.example.sharp.auto.supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/v1/supplier/")
public class SupplierController {

    @Autowired
    SupplierService supplierService;

    @PostMapping("/add")
    public SupplierDTO addSupplierInfo(@RequestBody SupplierDTO supplierDTO) {
        return supplierService.add(supplierDTO);
    }

    @PutMapping("/update")
    public SupplierDTO updateSupplierInfo(@RequestBody SupplierDTO supplierDTO) {
        return supplierService.update(supplierDTO);
    }

    @DeleteMapping("/delete")
    public Integer deleteSupplierInfo(@RequestParam Integer id) {
        return supplierService.delete(id);
    }

    @GetMapping("/get")
    public SupplierDTO getSupplierInfo(@RequestParam Integer id) {
        return supplierService.getById(id);
    }

}
