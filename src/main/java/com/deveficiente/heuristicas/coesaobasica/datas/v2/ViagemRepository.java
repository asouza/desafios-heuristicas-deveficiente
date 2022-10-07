package com.deveficiente.heuristicas.coesaobasica.datas.v2;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class ViagemRepository {

	public ViagemV2 buscaViagem(Long id) {
		return new ViagemV2(LocalDate.now().plusDays(10));
	}

	
}
