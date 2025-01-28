package br.com.RabbitMQ_Curso.pedidosAPI.controllers;

import br.com.RabbitMQ_Curso.pedidosAPI.models.OrderEntity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/orders")
public class OrderController {
    private final Logger logger = LoggerFactory.getLogger(OrderController.class);
    @PostMapping
    public ResponseEntity <OrderEntity> createOrder(@RequestBody OrderEntity order){
        logger.info("Order received: {}", order.toString());
        return ResponseEntity.status(HttpStatus.CREATED).body(order);
    }
}
