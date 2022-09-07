package com.testsoftware.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testsoftware.demo.models.Factura;
import com.testsoftware.demo.repositories.FacturaRepository;

@Service
public class Ventas {
	@Autowired
	FacturaRepository facturaRepository;

	public Optional<Factura> findFacturasByPesona(String identificacion) {
		return facturaRepository.findByIdentificacion(identificacion);
	}

	public Factura storeFactura(Factura factura) {
		try {
			return facturaRepository.save(factura);
		} catch (Exception e) {
			return factura;
		}
	}
}