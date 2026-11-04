package com.seduc2.escola.Services;

import com.seduc2.escola.Entityes.Sala;
import com.seduc2.escola.Repositoryes.SalaRepository;
import org.hibernate.annotations.SecondaryRow;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaService {

    private final SalaRepository repository;
    public SalaService(SalaRepository repository) {
        this.repository = repository;
    }
    public List<Sala> buscarTodos() {
        return repository.findAll();
    }
    public void criarSala(Sala s){
        Sala sala = new Sala( s.getNome(), s.getMesas(), s.getCadeiras(), s.getAlunos());
        repository.save(sala);
    }
}
