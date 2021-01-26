package com.mennter.pruebaangular.repositorios;

import com.mennter.pruebaangular.dominio.Persona;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PersonaRepository extends CrudRepository<Persona, Long> {

    List<Persona> findAll();
    
    Persona findOneById(Long id);
    
}
