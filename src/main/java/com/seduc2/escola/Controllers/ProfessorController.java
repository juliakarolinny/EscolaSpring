package com.seduc2.escola.Controllers;


import com.seduc2.escola.Entityes.Professor;
import com.seduc2.escola.Services.ProfessorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professores") // Define a rota base /professores
public class ProfessorController {

    private final ProfessorService service;

    // Injeção por construtor sem necessidade do @Autowired
    public ProfessorController(ProfessorService service) {
        this.service = service;
    }

    @GetMapping
    public List<Professor> mostrarProfessor() {
        return service.buscarProfessor();
    }

    @PostMapping
    public void criarProfessor(@RequestBody Professor p) {
        service.criarProfessor(p);
    }
}