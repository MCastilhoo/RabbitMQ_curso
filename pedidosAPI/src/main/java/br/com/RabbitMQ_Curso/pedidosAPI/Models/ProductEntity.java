package br.com.RabbitMQ_Curso.pedidosAPI.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {
    private Long id;
    private String name;
    private Double price;
}