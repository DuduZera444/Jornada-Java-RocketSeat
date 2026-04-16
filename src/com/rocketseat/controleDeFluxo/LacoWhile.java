package com.rocketseat.controleDeFluxo;

import java.util.Scanner;

public class LacoWhile {

	public static void main(String[] args) {
		
		int bateria = 100;
		
		//Iniciando o laço de repetição.
		while (bateria > 0) {
			System.out.println("Dispositivo ligado... carga: " + bateria + "%");
			
			//Alterando o valor da "bateria.
			bateria -=25;
			
		}
		
		System.out.println("Bateria Descarregada!");
		
		//O Laço o while Verifica uma condição e se for verdadeira se for falsa o codigo não é executado.
		
		
		
		
	}

}
