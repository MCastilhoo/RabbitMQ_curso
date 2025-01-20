package br.com.RabbitMQ_Curso.pedidosAPI.Models;

import com.example.PedidosAPI.Models.enums.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class OrderEntity {
    private Long id;
    private String customer;
    private List<OrderedItemsEntity> orderedItems = new ArrayList<>();
    private Double totalValue;
    private String emailNotification;
    private Status status;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dateHour;
}