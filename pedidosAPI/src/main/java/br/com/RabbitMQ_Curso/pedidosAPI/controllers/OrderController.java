package br.com.RabbitMQ_Curso.pedidosAPI.controllers;

import br.com.RabbitMQ_Curso.pedidosAPI.models.OrderEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Orders", description = "Feature to create a new request")
@RestController
@RequestMapping("api/orders")
public class OrderController {
    private final Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Operation(summary = "Create a order", description = "Contains the operations create a new request",
    responses = @ApiResponse(responseCode = "201", description = "Recourse created with success",
    content = @Content(mediaType = "application/json", schema = @Schema(implementation = OrderEntity.class)))
    )
    @PostMapping
    public ResponseEntity <OrderEntity> createOrder(@RequestBody OrderEntity order){
        logger.info("Order received: {}", order.toString());
        return ResponseEntity.status(HttpStatus.CREATED).body(order);
    }
}
