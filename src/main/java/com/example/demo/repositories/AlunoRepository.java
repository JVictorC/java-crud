package com.example.demo.repositories;

import com.example.demo.entities.Aluno;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {


}

