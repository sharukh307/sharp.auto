package com.example.sharp.auto.supplier;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class SupplierDao {

    @Autowired
    @PersistenceContext
    EntityManager entityManager;

    public SupplierDTO add(SupplierDTO supplierDTO){
       return entityManager.merge(supplierDTO);
    }

    public SupplierDTO get(Integer id) {
        return entityManager.find(SupplierDTO.class,id);
    }

    public SupplierDTO update( SupplierDTO supplierDTO) {
        return entityManager.merge(supplierDTO);
    }

    public Integer remove(Integer id) {
        entityManager.remove(entityManager.find(SupplierDTO.class,id));
        return 1;
    }

    public SupplierDTO getAll() {
        //return entityManager.find(SupplierDTO.class);
        return null;
    }
}
