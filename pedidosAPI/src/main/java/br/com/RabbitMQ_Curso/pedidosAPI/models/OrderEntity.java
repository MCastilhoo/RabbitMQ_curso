package br.com.RabbitMQ_Curso.pedidosAPI.models;


import br.com.RabbitMQ_Curso.pedidosAPI.models.enums.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class OrderEntity {
    private Long id;
    private String customer;
    private List<OrderedItemsEntity> Items = new ArrayList<>();
    private Double totalValue;
    private String emailNotification;
    private Status status = Status.Processing;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dateHour = LocalDateTime.now();
}