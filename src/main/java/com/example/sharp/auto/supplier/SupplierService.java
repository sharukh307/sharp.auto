package com.example.sharp.auto.supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierService {

    @Autowired
    SupplierDao supplierDao;

    public SupplierDTO add(SupplierDTO supplierDTO){
        return supplierDao.add(supplierDTO);
    }

    public SupplierDTO getById(Integer id) {
        return supplierDao.get(id);
    }

    public SupplierDTO update( SupplierDTO supplierDTO) {
        return supplierDao.update(supplierDTO);
    }

    public Integer delete(Integer id) {
        return supplierDao.remove(id);
    }
}
