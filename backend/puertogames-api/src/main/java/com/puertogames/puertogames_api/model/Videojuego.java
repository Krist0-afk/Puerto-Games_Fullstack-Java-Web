package com.puertogames.puertogames_api.model;
import lombok.*;
import jakarta.persistence.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Videojuego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // long es el doble que int permite más caracteres
    private String titulo;
    private String genero;
    private String plataforma;
    private double precio;
    private int    stock;


}
