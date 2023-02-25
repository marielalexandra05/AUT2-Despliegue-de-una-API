package com.mariela.proyectoMariela.repository;

import com.mariela.proyectoMariela.model.ProductDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductDAO extends MongoRepository<ProductDTO, String> {


}
