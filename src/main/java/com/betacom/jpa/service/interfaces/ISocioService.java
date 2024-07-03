package com.betacom.jpa.service.interfaces;

import java.util.List;

import com.betacom.jpa.dto.SocioDTO;

public interface ISocioService {
	
	void createSocio(SocioDTO socio);
	List<SocioDTO> listAllSocio();

}
