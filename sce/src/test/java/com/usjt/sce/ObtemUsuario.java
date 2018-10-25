package com.usjt.sce;

import com.usjt.sce.model.Usuario;

public class ObtemUsuario {

	public static Usuario comDadosValidos() {
		Usuario usuario = new Usuario();
		usuario.setNome("Danilo");
		usuario.setRa("121212");
		usuario.getNome();
		usuario.getRa();
		return usuario;
		
	}
	
	
	public static Usuario comRaInvalido_Branco() {
		Usuario usuario = new Usuario();
		usuario.setRa("");
		usuario.setNome("Danilo");
		return usuario;
		
	}
	
	
	public static Usuario comRaInvalido_Nulo() {
		Usuario usuario = new Usuario();
		usuario.setRa(null);
		usuario.setNome("Danilo");
		
		return usuario;
		
	}
	
	public static Usuario comNomeInvalido_Nulo() {
		Usuario usuario = new Usuario();
		usuario.setNome(null);
		usuario.setRa("121212");
		return usuario;
		
	}
	
	
	public static Usuario comNomeInvalido_Branco() {
		Usuario usuario = new Usuario();
		usuario.setNome("");
		usuario.setRa("121212");
		return usuario;
		
	}
	
}
