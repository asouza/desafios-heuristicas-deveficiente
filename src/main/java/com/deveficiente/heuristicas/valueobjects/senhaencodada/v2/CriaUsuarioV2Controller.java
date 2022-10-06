package com.deveficiente.heuristicas.valueobjects.senhaencodada.v2;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CriaUsuarioV2Controller {


	@PostMapping("/senha-encodada/usuariov2")
	public String executa(String senha) {
		
		UsuarioV2 usuarioV2 = new UsuarioV2(Senha.criaAPartirDeUmaSenhaLimpa(senha));
		return usuarioV2.getSenha().getEncodada();
	}
}
