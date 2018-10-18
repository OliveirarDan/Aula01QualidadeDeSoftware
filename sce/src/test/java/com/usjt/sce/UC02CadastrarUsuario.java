package com.usjt.sce;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.usjt.sce.model.Usuario;

public class UC02CadastrarUsuario {
	
	@Test
	public void CT01CadastrarUsuarioComDadosValidos() {
		try {
			// cenario
			Usuario umUsuario = new Usuario();
			// acao
			umUsuario = ObtemUsuario.comDadosValidos();
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}
	

}
