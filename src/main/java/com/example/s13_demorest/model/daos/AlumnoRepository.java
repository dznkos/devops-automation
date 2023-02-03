package com.example.s13_demorest.model.daos;

import com.example.s13_demorest.model.entidades.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {
}
