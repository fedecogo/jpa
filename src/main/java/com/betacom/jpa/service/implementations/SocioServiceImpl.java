package com.betacom.jpa.service.implementations;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.betacom.jpa.dto.SocioDTO;
import com.betacom.jpa.pojo.Socio;
import com.betacom.jpa.repository.ISocioRepository;
import com.betacom.jpa.service.interfaces.ISocioService;

@Service
public class SocioServiceImpl implements ISocioService{
	
	@Autowired
	ISocioRepository socioR;
	
	@Override
	public void createSocio(SocioDTO socioI) {
		Socio socio = new Socio();
		socio.setcFiscale(socioI.getcFiscale());
		socio.setCognome(socioI.getCognome());
		socio.setNome(socioI.getNome());
		
		socioR.save(socio);
		
	}

	@Override
	public List<SocioDTO> listAllSocio() {
		List<Socio> resp = socioR.findAll();
		
		return resp.stream()
				.map(s -> new SocioDTO(
						s.getId(),
						s.getCognome(),
						s.getNome(),
						s.getcFiscale()
						)) 
				.collect(Collectors.toList());
		
		
		
	}

}
