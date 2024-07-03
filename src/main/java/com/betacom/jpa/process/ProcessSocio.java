package com.betacom.jpa.process;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.betacom.jpa.dto.SocioDTO;
import com.betacom.jpa.service.interfaces.ISocioService;

@Service
public class ProcessSocio {

	@Autowired
	ISocioService socioS;
	
	public static Logger log = LoggerFactory.getLogger(ProcessSocio.class);
	
	public void execute() {
		log.debug("Begin create socio");
		
		SocioDTO input = new SocioDTO();
		input.setcFiscale("GS12223456789123");
		input.setCognome("Verde");
		input.setNome("Gianni");
		
		socioS.createSocio(input);
		
		input = new SocioDTO();
		input.setcFiscale("SM33333789123");
		input.setCognome("Rossi");
		input.setNome("Paolo");
		
		socioS.createSocio(input);
		
		log.debug("After create");
		
		List<SocioDTO> lS = socioS.listAllSocio();
		lS.forEach(s -> log.info(s.toString()));
		
		
	}
}
