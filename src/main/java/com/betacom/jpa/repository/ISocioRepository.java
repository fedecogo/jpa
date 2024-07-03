package com.betacom.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.betacom.jpa.pojo.Socio;

@Repository
public interface ISocioRepository extends JpaRepository<Socio, Integer>{

}
