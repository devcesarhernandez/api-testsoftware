package com.testsoftware.demo.repositories;

import java.util.Optional;

// import org.springframework.data.jpa.repository.Modifying;
// import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.testsoftware.demo.models.Persona;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Integer> {
	public abstract Optional<Persona> findByIdentificacion(String identificacion);

	public abstract Long deleteByIdentificacion(String identificacion);

	// @Modifying
	// @Query("delete from personas where identificacion = :identificacion")
	public abstract Long removeByIdentificacion(@Param("identificacion") String identificacion);
}
