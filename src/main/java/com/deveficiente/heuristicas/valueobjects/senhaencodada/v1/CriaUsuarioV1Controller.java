package com.deveficiente.heuristicas.valueobjects.senhaencodada.v1;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CriaUsuarioV1Controller {


	@PostMapping("/senha-encodada/usuariov1")
	public void executa(String senha) {
		
		/*
		 * Como você sabe se a senha esperada é limpa ou precisa ser 
		 * aplicada algum algoritmo de Hash?
		 */
		new UsuarioV1(senha);
	}
}
