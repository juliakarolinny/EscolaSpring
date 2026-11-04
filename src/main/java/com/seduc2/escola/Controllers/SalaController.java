package com.seduc2.escola.Controllers;

import com.seduc2.escola.Entityes.Sala;
import com.seduc2.escola.Repositoryes.SalaRepository;
import com.seduc2.escola.Services.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SalaController {

    @Autowired
    private SalaService service;
    public SalaController(SalaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Sala> mostrarSala(){
        return service.buscarTodos();
    }

    @PostMapping
    public void criarSala(){
       service.criarSala();
    }
}
