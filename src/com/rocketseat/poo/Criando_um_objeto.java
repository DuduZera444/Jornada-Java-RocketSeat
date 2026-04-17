package com.rocketseat.poo;

public class Criando_um_objeto {
	
	private String nome;
	private Integer idade;
	private String escola;
	
	
	public Criando_um_objeto(String nome, Integer idade, String escola){
		this.nome = nome;
		this.idade = idade;
		this.escola = escola;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getEscola() {
		return escola;
	}
	public void setEscola(String escola) {
		this.escola = escola;
	}
	
	public void exibir() {
		System.out.println("---Dados do Objeto---");
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Escola: " + this.escola);
	}
	
}
