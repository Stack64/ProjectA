package com.example.demo.dto;

import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;
import java.time.Instant;
import com.example.demo.model.OrderEntity;

@Data
@Builder
public class OrderResponse {

    private String orderId;
    private String userId;
    private String status;
    private BigDecimal amount;
    private Instant createdAt;

    public static OrderResponse from(OrderEntity entity) {
        return OrderResponse.builder()
                .orderId(entity.getOrderId())
                .userId(entity.getUserId())
                .status(entity.getStatus())
                .amount(entity.getAmount())
                .createdAt(entity.getCreatedAt())
                .build();
    }
}
