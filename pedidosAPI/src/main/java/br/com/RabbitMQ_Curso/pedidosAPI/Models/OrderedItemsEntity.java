package br.com.RabbitMQ_Curso.pedidosAPI.Models;


import lombok.Data;

@Data
public class OrderedItemsEntity {
    private Long id;
    private ProductEntity product;
    private Integer quantity;
}