package com.usjt.sce;

import static org.junit.Assert.*;

import org.junit.Test;

import com.usjt.sce.model.Livro;

public class UC01CadastrarLivro {

	@Test
	public void CT01CadastrarLivroComDadosValidos() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro = ObtemLivro.comDadosValidos();
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}
	
	
	@Test
	public void CT02CadastrarLivroComISBNBranco() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro = ObtemLivro.comISBNInvalido_branco();
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN invalido",e.getMessage());
		}
	}
	
	@Test
	public void CT03CadastrarLivroComISBNNulo() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro = ObtemLivro.comISBNInvalido_nulo();
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN invalido",e.getMessage());
		}
	}
	
	
	@Test
	public void CT04CadastrarLivroComTituloNulo() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro = ObtemLivro.comTituloInvalido_nulo();
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Titulo invalido",e.getMessage());
		}
	}

	
	@Test
	public void CT05CadastrarLivroComAutorNulo() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro = ObtemLivro.comAutorInvalido_nulo();
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Autor invalido",e.getMessage());
		}
	}
	
	@Test
	public void CT06getLivro() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro = ObtemLivro.getcomDadosValidos();
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Autor invalido",e.getMessage());
		}
	}
	
	
	@Test
	public void CT07CadastrarLivroComTituloBranco() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro = ObtemLivro.comTituloInvalido_branco();
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Titulo invalido",e.getMessage());
		}
	}
	
	@Test
	public void CT08CadastrarLivroComAutorBranco() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro = ObtemLivro.comAutorInvalido_branco();
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Autor invalido",e.getMessage());
		}
	}

}
