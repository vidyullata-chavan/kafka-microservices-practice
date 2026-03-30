package com.vidyu.base.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEvent {
    private String orderId;
    private String productNames;
    private int quantity;
    private BigDecimal price;
    private String status; // e.g., PENDING, COMPLETED
}
