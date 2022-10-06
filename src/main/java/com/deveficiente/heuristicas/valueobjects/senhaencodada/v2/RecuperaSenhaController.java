package com.deveficiente.heuristicas.valueobjects.senhaencodada.v2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecuperaSenhaController {

	private UsuarioRepository usuarioRepository;

	public RecuperaSenhaController(UsuarioRepository usuarioRepository) {
		super();
		this.usuarioRepository = usuarioRepository;
	}

	@GetMapping("/usuario-encodado/recupera-senha-v2")
	public String executa(Long idUsuario) {
		//simulando pegar um usuário
		
		UsuarioV2 usuarioV1 = usuarioRepository.busca(idUsuario);
		return usuarioV1.getSenha().getEncodada(); 
	}
}
