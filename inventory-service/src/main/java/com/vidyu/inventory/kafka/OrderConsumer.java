package com.vidyu.inventory.kafka;

import com.vidyu.base.dto.OrderEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderConsumer {

    @KafkaListener(
            topics = "order_topics",
            groupId = "inventory-group"
    )
    public void consume(OrderEvent event) {
        log.info("********** INVENTORY SERVICE RECEIVED EVENT **********");
        log.info("Order ID: {}", event.getOrderId());
        log.info("Processing product: {} with quantity: {}",
                event.getProductNames(), event.getQuantity());

        // This is where you would normally call a Database to update stock!
        log.info("Inventory updated successfully for Order: {}", event.getOrderId());
    }
}

