package com.usjt.sce;

import com.usjt.sce.model.Usuario;

public class ObtemUsuario {

	public static Usuario comDadosValidos() {
		Usuario usuario = new Usuario();
		usuario.setNome("Danilo");
		usuario.setRa("121212");
		return usuario;
		
	}
	
	
	public static Usuario comRaInvalido_Branco() {
		Usuario usuario = new Usuario();
		usuario.setNome("Danilo");
		usuario.setRa("");
		return usuario;
		
	}
	
	
	public static Usuario comRaInvalido_Nulo() {
		Usuario usuario = new Usuario();
		usuario.setNome("Danilo");
		usuario.setRa(null);
		return usuario;
		
	}
}
