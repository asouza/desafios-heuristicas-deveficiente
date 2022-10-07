package com.deveficiente.heuristicas.coesaobasica.datas.v1;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class ViagemRepository {

	public ViagemV1 buscaViagem(Long id) {
		return new ViagemV1(LocalDate.now().plusDays(10));
	}

	
}
