package com.example.s13_demorest.ws;


import com.example.s13_demorest.model.daos.CursoRepository;
import com.example.s13_demorest.model.entidades.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CursoRestController {

    @Autowired
    private CursoRepository dao;

    @GetMapping("/cursos")
    public Iterable<Curso> getCursos(){
        return dao.findAll();
    }

    @GetMapping("/cursos/{id}")
    public Curso getCurso(@PathVariable Integer id){
        return dao.findById(id).get();
    }

    @PostMapping("/cursos")
    public Curso addCurso(@RequestBody Curso curso){
        return dao.save(curso);
    }

    @DeleteMapping("/cursos/{id}")
    public void removeCurso(@PathVariable Integer id){
        dao.deleteById(id);
    }
    @PutMapping("/cursos/{id}")
    public Curso updateCurso(@RequestBody Curso curso,@PathVariable Integer id){

        return dao.save(curso);
    }

}
