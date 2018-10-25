package com.usjt.sce;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;
import com.usjt.sce.model.Usuario;

public class UC05CadastrarUsuario {
	
	
	/**
	 * Objetivo - Verificar o comportamento da aplicação na inclusão dos dados válidos
	 */
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
	

	
	
	/**
	 * Objetivo - Verificar o comportamento da aplicação na inclusão do RA em branco
	 */
	@Test
	public void CT02CadastrarUsuarioComRaBranco() {
		try {
			// cenario
			Usuario umUsuario = new Usuario();
			// acao
			umUsuario = ObtemUsuario.comRaInvalido_Branco();
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("RA invalido",e.getMessage());
		}
	}

	
	
	/**
	 * Objetivo - Verificar o comportamento da aplicação na inclusão do RA Nulo
	 */
	@Test
	public void CT03CadastrarUsuarioComRaNulo() {
		try {
			// cenario
			Usuario umUsuario = new Usuario();
			// acao
			umUsuario = ObtemUsuario.comRaInvalido_Branco();
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("RA invalido",e.getMessage());
		}
	}
	
	
	/**
	 * Objetivo - Verificar o comportamento da aplicação na inclusão do nome em branco
	 */
	@Test
	public void CT04CadastrarUsuarioComNomeBranco() {
		try {
			// cenario
			Usuario umUsuario = new Usuario();
			// acao
			umUsuario = ObtemUsuario.comNomeInvalido_Branco();
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Nome invalido",e.getMessage());
		}
	}
	
	
	

	/**
	 * Objetivo - Verificar o comportamento da aplicação na inclusão do nome nulo
	 */
	@Test
	public void CT05CadastrarUsuarioComNomeNulo() {
		try {
			// cenario
			Usuario umUsuario = new Usuario();
			// acao
			umUsuario = ObtemUsuario.comNomeInvalido_Nulo();
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Nome invalido",e.getMessage());
		}
	}
	
	
}
