package com.imous.project1.services.impl;

import com.imous.project1.entities.Order;
import com.imous.project1.repositories.OrderRepository;
import com.imous.project1.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    public List<Order> findAllOrder(){
        return orderRepository.findAll();
    }

}
