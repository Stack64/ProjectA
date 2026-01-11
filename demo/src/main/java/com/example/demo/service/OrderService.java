package com.example.demo.service;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import com.example.demo.repository.OrderRepository;
import com.example.demo.model.OrderEntity;
import com.example.demo.dto.OrderResponse;
import com.example.demo.exception.OrderNotFoundException;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderResponse getOrderById(String orderId) {
        OrderEntity order = orderRepository.findById(orderId)
                .orElseThrow(() -> new OrderNotFoundException(orderId));

        return OrderResponse.from(order);
    }
}
