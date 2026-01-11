package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "orders")
public class OrderEntity {

    @Id
    private String orderId;

    private String userId;
    private String status;
    private BigDecimal amount;

    private Instant createdAt;
}

