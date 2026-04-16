package com.rocketseat.controleDeFluxo;

import java.util.Scanner;

public class LacoDoWhile {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int senha;
		
		do {
			System.out.println("Digite sua senha númerica: ");
			senha = leitor.nextInt();
			
			if (senha != 1234) {
				System.out.println("Acesso negado! Tente novamente.");
			}
		} while (senha != 1234);
		
		System.out.println("Acesso liberado!");
		leitor.close();
		
		/*O Do while funciona da mesma forma porem com uma sutil diferença ele executa o codigo primeiro e 
		e depois faz a verificação fazendo com oq o codigo rode pelo menos uma vez
		
		Nesse exemplo também foi usado a classe Scanner que é uma classe propria do java que nos da
		a opção de ler informações digitadas pelo usuario.
		 */
		
		
		
		
		
		/*O Do while funciona da mesma forma que o while porem com uma sutil 
		 * diferença ele executa o codigo primeiro e 
		e depois faz a verificação fazendo com que o codigo rode pelo menos uma vez */
	}

}
