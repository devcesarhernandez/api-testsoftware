package com.testsoftware.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testsoftware.demo.models.Persona;
import com.testsoftware.demo.services.Directorio;

@RestController
@RequestMapping("/personas")
public class DirectorioRestService {
    @Autowired
    Directorio directorio;

    @GetMapping()
    public ArrayList<Persona> findPersonas() {
        return directorio.findPersonas();
    }

    @PostMapping()
    public Persona storePersona(@RequestBody Persona persona) {
        return this.directorio.storePersona(persona);
    }

    @GetMapping(path = "/{identificacion}")
    public Optional<Persona> findPersonaByIdentificacion(@PathVariable("identificacion") String identificacion) {
        return this.directorio.findPersonaByIdentificacion(identificacion);
    }

    @DeleteMapping(path = "/{identificacion}")
    public Boolean deletePersonaByIdentificacion(@PathVariable("identificacion") String identificacion) {
        boolean ok = this.directorio.deletePersonaByIdentificacion(identificacion);
        return ok;
    }
}
