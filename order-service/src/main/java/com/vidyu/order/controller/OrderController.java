package com.vidyu.order.controller;

import com.vidyu.base.dto.OrderEvent;
import com.vidyu.order.kafka.OrderProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderProducer orderProducer;

    @PostMapping
    public String placeOrder(@RequestBody OrderEvent orderEvent) {
        orderEvent.setOrderId(UUID.randomUUID().toString());
        orderEvent.setStatus("PENDING");

        orderProducer.sendMessage(orderEvent);

        return "Order placed successfully!";
    }
}

