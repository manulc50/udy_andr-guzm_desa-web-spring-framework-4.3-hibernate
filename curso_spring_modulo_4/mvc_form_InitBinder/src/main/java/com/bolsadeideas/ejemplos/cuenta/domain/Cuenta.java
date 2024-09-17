package com.bolsadeideas.ejemplos.cuenta.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

public class Cuenta {

	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	private Long id;

	@NotEmpty
	@Size(min = 1, max = 25)
	private String nombre;

	@NotNull
	@NumberFormat(style = Style.CURRENCY)
	private BigDecimal saldo = new BigDecimal("5000");

	@NotNull
	@NumberFormat(style = Style.PERCENT)
	private BigDecimal nivelEndeudamiento = new BigDecimal(".05");

	@DateTimeFormat(style = "S-")
	@Future
	private Date fechaRenovacion = new Date(new Date().getTime() + 21425000000L);

	// @Email
	@Pattern(regexp = EMAIL_PATTERN, message = "El formato del email es inválido")
	private String email;

	public Long getId() {
		return id;
	}

	void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public BigDecimal getNivelEndeudamiento() {
		return nivelEndeudamiento;
	}

	public void setNivelEndeudamiento(BigDecimal nivelEndeudamiento) {
		this.nivelEndeudamiento = nivelEndeudamiento;
	}

	public Date getFechaRenovacion() {
		return fechaRenovacion;
	}

	public void setFechaRenovacion(Date fechaRenovacion) {
		this.fechaRenovacion = fechaRenovacion;
	}

	public Long asignarId() {
		this.id = idSequencia.incrementAndGet();
		return id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private static final AtomicLong idSequencia = new AtomicLong();

}