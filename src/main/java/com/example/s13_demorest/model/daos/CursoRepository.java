package com.example.s13_demorest.model.daos;

import com.example.s13_demorest.model.entidades.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
