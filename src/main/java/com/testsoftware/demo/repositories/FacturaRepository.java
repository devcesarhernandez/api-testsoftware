package com.testsoftware.demo.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.testsoftware.demo.models.Factura;

@Repository
public interface FacturaRepository extends CrudRepository<Factura, Integer> {
	public abstract Optional<Factura> findByIdentificacion(String identificacion);
	public abstract long deleteByIdentificacion(String identificacion);
}
