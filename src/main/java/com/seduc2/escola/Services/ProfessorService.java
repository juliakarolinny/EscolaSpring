package com.seduc2.escola.Services;

import com.seduc2.escola.Entityes.Professor;
import com.seduc2.escola.Repositoryes.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    private final ProfessorRepository repository;

    public ProfessorService(ProfessorRepository repository) {
        this.repository = repository;
    }

    public List<Professor> buscarProfessor() {
        return repository.findAll();
    }

    public void criarProfessor(Professor p) {
        repository.save(p);
    }
}