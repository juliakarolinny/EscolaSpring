package com.seduc2.escola.Repositoryes;

import com.seduc2.escola.Entityes.Professor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
}