package com.testsoftware.demo.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.testsoftware.demo.models.Persona;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Integer> {
    public abstract Optional<Persona> findByIdentificacion(String identificacion);
    public abstract long deleteByIdentificacion(String identificacion);
}
