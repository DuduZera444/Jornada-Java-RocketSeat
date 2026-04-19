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
	
	/* Nessa classe criei oque é chamado de objeto, no inicio declaramos os atibutos do objeto em questão nesse caso um aluno
	 * a palavra private é um modificador de acesso que faz com que apenas a propria classe possa alterar seus atributos.
	 * Logo abaixo declarei um construtor, ele é um bloco que codigo que serve para definir se quando o objeto for instaciado 
	 * ele ja iniciara com atributos basicamente, se nenhum construtor for declarado o java cria um construtor vazio que deixa
	 * os atributos da classe vazios.
	 * 
	 * apos isso temos os getters e setters, os getters servem para que outra classe consiga visualizar os atributos do objeto 
	 * instanciado. o setters conseguem "setar" um valor para o atributo do objeto em questão.
	 * como declarei os atributos como private as outras classes só conseguem acessa-los atraves dos getters e setters que 
	 * foram declarados.
	 * */
	
}
