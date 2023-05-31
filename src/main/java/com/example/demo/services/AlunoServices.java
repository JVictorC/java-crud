package com.example.demo.services;

import com.example.demo.entities.Aluno;
import java.util.List;

public interface AlunoServices {
  Aluno save(Aluno aluno);

  Aluno update(Aluno aluno);

  void deleteById(Long id);

  List<Aluno> findAll();
}
