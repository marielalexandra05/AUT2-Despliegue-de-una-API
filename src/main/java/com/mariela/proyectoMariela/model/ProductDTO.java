package com.mariela.proyectoMariela.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document
public class ProductDTO {
        @Id
        private String _id;

        private String name;

        private Double price;

        private LocalDate expiry_date;


}
