package com.example.sharp.auto.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "person")
public class SupplierDTO {

    @Id
    @GeneratedValue
    Integer id;
    @JsonProperty("company")
    String company;
    @JsonProperty("name")
    String name;
    @JsonProperty("contact")
    String mobileNumber;
    @JsonProperty("email")
    String email;

}
