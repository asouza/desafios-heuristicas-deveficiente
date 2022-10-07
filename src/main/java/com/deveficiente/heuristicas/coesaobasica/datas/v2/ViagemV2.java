package com.deveficiente.heuristicas.coesaobasica.datas.v2;

import java.time.LocalDate;

public class ViagemV2 {

	private LocalDate partida;

	public ViagemV2(LocalDate partida) {
		super();
		this.partida = partida;
	}
	

	public int quantasDiasFaltam(LocalDate de) {
		return de.until(this.partida).getDays();
	}
	
	
}
