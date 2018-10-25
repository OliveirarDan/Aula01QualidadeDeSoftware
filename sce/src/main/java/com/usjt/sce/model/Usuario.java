package com.usjt.sce.model;

public class Usuario {
	private String ra;
	private String nome;

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		if (ra == "" | ra == null) {
			this.ra = ra;
			throw new RuntimeException("RA invalido");
		}
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == "" | nome == null) {
			this.nome = nome;
			throw new RuntimeException("Nome invalido");
		}
		
	}

}