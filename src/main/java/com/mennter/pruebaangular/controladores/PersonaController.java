package com.mennter.pruebaangular.controladores;

import com.mennter.pruebaangular.repositorios.PersonaRepository;

import java.util.List;

import com.mennter.pruebaangular.dominio.Persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("persona")
public class PersonaController {
    
    @Autowired
    private PersonaRepository personaRepository;


    @GetMapping()
    public List<Persona> obtenerTodasLasPersonas() {
        return this.personaRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public Persona obtenerPersonaPorId(@PathVariable(value = "id") Long id) {
        return this.personaRepository.findOneById(id);
    }


    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public Persona guadarPersona(@Validated @RequestBody Persona persona) {
        return this.personaRepository.save(persona);
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void borrarPersona(@PathVariable(value = "id") Long id) {
        this.personaRepository.deleteById(id);
    }

}
