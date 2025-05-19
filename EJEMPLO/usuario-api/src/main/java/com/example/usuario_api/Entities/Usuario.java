package com.example.usuario_api.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/*
jakarta.persistence.*: Anotaciones JPA para mapear esta clase a una tabla en la base de datos.
lombok.Data: Genera automáticamente getters, setters, toString, equals, hashCode, y un constructor vacío.

@Entity: indica que esta clase es una entidad JPA,
es decir, una clase que será persistida en una tabla de base de datos
 (Spring Data JPA lo reconoce automáticamente)

@Data: de Lombok, evita escribir código repetitivo.
 */
@Data
@Entity
public class Usuario {

    /*
    @Id: este campo es la clave primaria de la tabla.
    @GeneratedValue(strategy = GenerationType.IDENTITY):
    Indica que la base de datos se encargará de generar el valor automáticamente,
    por ejemplo, un AUTO_INCREMENT en MySQL o H2.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String nombre;
    private String email;

}
