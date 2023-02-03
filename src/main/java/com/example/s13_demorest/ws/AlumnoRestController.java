package com.example.s13_demorest.ws;

import com.example.s13_demorest.model.daos.AlumnoRepository;
import com.example.s13_demorest.model.entidades.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AlumnoRestController {

    @Autowired
    private AlumnoRepository dao;

    @GetMapping("/alumnos")
    public Iterable<Alumno> getAlumnos(){
        return dao.findAll();
    }

    @GetMapping("/alumnos/{id}")
    public Alumno getAlumnos(@PathVariable Integer id){
        return dao.findById(id).get();
    }

    @PostMapping("/alumnos")
    public Alumno addAlumnos(@RequestBody Alumno alumno){
        return dao.save(alumno);
    }

    @DeleteMapping("/alumnos/{id}")
    public void removeAlumnos(@PathVariable Integer id){
        dao.deleteById(id);
    }
    @PutMapping("/alumnos/{id}")
    public Alumno updateAlumnos(@RequestBody Alumno alumno,@PathVariable Integer id){

        return dao.save(alumno);
    }

}
