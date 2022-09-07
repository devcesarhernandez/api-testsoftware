package com.testsoftware.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testsoftware.demo.models.Persona;
import com.testsoftware.demo.repositories.PersonaRepository;
import com.testsoftware.demo.repositories.FacturaRepository;

@Service
public class Directorio {
	@Autowired
	PersonaRepository personaRepository;
	FacturaRepository facturaRepository;

	public Optional<Persona> findPersonaByIdentificacion(String identificacion) {
		return personaRepository.findByIdentificacion(identificacion);
	}

	public ArrayList<Persona> findPersonas() {
		return (ArrayList<Persona>) personaRepository.findAll();
	}

	public boolean deletePersonaByIdentificacion(String identificacion) {
		try {
			personaRepository.deleteByIdentificacion(identificacion);
			facturaRepository.deleteByIdentificacion(identificacion);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Persona storePersona(Persona persona) {
		try {
			return personaRepository.save(persona);
		} catch (Exception e) {
			return persona;
		}
	}
}
