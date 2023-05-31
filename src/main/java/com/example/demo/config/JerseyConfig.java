package com.example.demo.config;

import com.example.demo.controller.AlunoController;
import com.example.demo.repositories.AlunoRepository;
import com.example.demo.services.AlunoServices;
import com.example.demo.services.AlunoServicesImp;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {
  public JerseyConfig() {
    register(AlunoController.class);

    register(new AbstractBinder() {
      @Override
      protected void configure() {
        bind(AlunoServicesImp.class).to(AlunoServices.class);
        bind(AlunoRepository.class);
      }
    });

    property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
  }
}
