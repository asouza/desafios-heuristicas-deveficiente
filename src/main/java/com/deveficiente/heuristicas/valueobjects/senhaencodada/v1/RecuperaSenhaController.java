package com.deveficiente.heuristicas.valueobjects.senhaencodada.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecuperaSenhaController {

	private UsuarioRepository usuarioRepository;

	public RecuperaSenhaController(UsuarioRepository usuarioRepository) {
		super();
		this.usuarioRepository = usuarioRepository;
	}

	@GetMapping("/usuario-encodado/recupera-senha")
	public String executa(Long idUsuario) {
		//simulando pegar um usuário
		
		UsuarioV1 usuarioV1 = usuarioRepository.busca(idUsuario);
		
		/*
		 * Sem olhar na classe usuário, como você sabe que aqui você 
		 * tem uma senha limpa ou encodada? 
		 */
		return usuarioV1.getSenha(); 
	}
}
