package com.testsoftware.demo.models;
import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name = "facturas")

public class Factura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	
	private Date fecha;
	private Double monto;

	public Long getId() {
		return id;
	}

	public void setId(Long id)  {
		this.id = id;
	}

	public Date getDate() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}
}