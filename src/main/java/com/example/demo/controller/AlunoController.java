package com.example.demo.controller;

import com.example.demo.entities.Aluno;
import com.example.demo.services.AlunoServices;
import com.example.demo.services.AlunoServicesImp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseStatus;

@Path("alunos")
public class AlunoController {

  private final AlunoServices alunoServices;

  @Inject
  public AlunoController(AlunoServices alunoServices) {
    this.alunoServices = alunoServices;
  }

  @GET()
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public List<Aluno> getAlunosList() {
    return alunoServices.findAll();
  }

  @POST()
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  @ResponseStatus(HttpStatus.CREATED)
  public Aluno addAluno(
          Aluno aluno
  ) {
    return alunoServices.save(aluno);
  }

  @PUT()
  @Path("/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  @ResponseStatus(HttpStatus.CREATED)
  public Aluno updateAluno(
          Aluno aluno,
          @PathParam(value = "id") Long id
  ) {
    aluno.setId(id);

    return alunoServices.update(aluno);
  }

  @DELETE()
  @Path("/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  @ResponseStatus(HttpStatus.ACCEPTED)
  public void deleteAluno(
          @PathParam(value = "id") Long id
  ) {
    alunoServices.deleteById(id);
  }

}
