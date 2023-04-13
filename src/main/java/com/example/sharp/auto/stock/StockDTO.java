package com.example.sharp.auto.stock;

import com.example.sharp.auto.supplier.SupplierDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "stock")
public class StockDTO {
   
    @Id
    @GeneratedValue
    Integer id;

    String name;

    String model;

    Integer price;

    String modelNumber;

    @ManyToOne
    SupplierDTO supplierDTO;

}
