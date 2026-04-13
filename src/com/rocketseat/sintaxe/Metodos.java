package com.rocketseat.sintaxe;

public class Metodos {
	
	//Os metodos são ferramentas que criamos para executar alguma tarefa e que pode ser chamados por outras classe.
	
	/*Declaramos o metodo seguindo um padrão, primeiro o modificador de acesso, Depois o tipo do valor que esse 
	metodo retorna, e depois o nome do metodo que é usado para chamar ele e por fim entre parenteses colocamos
	o tipo do valor recebido e o nome do parametro nesse caso a e b. */
	public static int somar(int a, int b) {
		return a + b;
	}
	
	// Criando o Metodo Main e Declarando as Variaveis.
	public static void main(String[] args) {
		int valorA = 10;
		int valorB = 20;
	
	/* Aqui estamos chamando o metodo somar e fazendo com que ele retorne o valor das variaveis declaradas usando
		o metodo System.out.println que é um metodo que já vem com o pacote java*/
		
		int resultado = somar (valorA, valorB);
		System.out.println("A soma é: " + resultado);
	}
}
