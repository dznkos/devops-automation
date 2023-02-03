package com.example.s13_demorest.model.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.Record;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "curso")
public final class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private  String nombre;
    private  Integer creditos;

}
