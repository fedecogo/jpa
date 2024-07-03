package com.betacom.jpa.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="socio")
public class Socio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length=50)
	private String cognome;
	
	@Column(length=50)
	private String nome;
	
	@Column(name="codice_fiscale",
			nullable = false,
			length = 17,
			unique = true
			)
	private String cFiscale;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getcFiscale() {
		return cFiscale;
	}

	public void setcFiscale(String cFiscale) {
		this.cFiscale = cFiscale;
	}

}
