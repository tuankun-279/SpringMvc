package com.example.DBConnectTest.service;

import com.example.DBConnectTest.model.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productService implements IproductService{
    @Autowired
    private IproductService iproductService;
    @Override
    public List<product> findAll() {
        return (List<product>) iproductService.findAll();
    }

}
