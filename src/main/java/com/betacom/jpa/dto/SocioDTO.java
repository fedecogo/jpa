package com.betacom.jpa.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

public class SocioDTO {
	private Integer id;
	private String cognome;
	private String nome;
	private String cFiscale;

	public SocioDTO(Integer id, String cognome, String nome, String cFiscale) {
		super();
		this.id = id;
		this.cognome = cognome;
		this.nome = nome;
		this.cFiscale = cFiscale;
	}


	
	public SocioDTO() {
		super();
	}


	@Override
	public String toString() {
		return "SocioDTO [id=" + id + ", cognome=" + cognome + ", nome=" + nome + ", cFiscale=" + cFiscale + "]";
	}


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
