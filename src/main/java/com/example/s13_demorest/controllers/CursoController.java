package com.example.s13_demorest.controllers;

import com.example.s13_demorest.model.daos.CursoRepository;
import com.example.s13_demorest.model.entidades.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class CursoController {

    @Autowired
    private CursoRepository dao;

}
