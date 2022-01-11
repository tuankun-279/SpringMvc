package com.example.DBConnectTest.repository;

import com.example.DBConnectTest.model.product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Iproduct extends CrudRepository<product,Long> {
}
