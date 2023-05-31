package com.example.demo.services;

import com.example.demo.entities.Aluno;
import com.example.demo.repositories.AlunoRepository;
import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;

public class AlunoServicesImp implements AlunoServices {
  private AlunoRepository alunoRepository;

  @Inject
  public AlunoServicesImp(AlunoRepository alunoRepository) {
    this.alunoRepository = alunoRepository;
  }

  @Override
  public Aluno save(Aluno aluno) {
    return alunoRepository.save(aluno);
  }

  @Override
  public Aluno update(Aluno aluno) {
    return alunoRepository.save(aluno);
  }

  @Override
  public void deleteById(Long id) {
      alunoRepository.deleteById(id);
  }

  @Override
  public List<Aluno> findAll() {
    return alunoRepository.findAll();
  }
}
