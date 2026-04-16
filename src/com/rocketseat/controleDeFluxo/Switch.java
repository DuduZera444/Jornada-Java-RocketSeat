package com.rocketseat.controleDeFluxo;

public class Switch {

	public static void main(String[] args) {
		
		int mes = 3;
		
		String mesDoAno = switch (mes) {
		case 1 -> "Janeiro";
		case 2 -> "Fevereiro";
		case 3 -> "Março";
		case 4 -> "Abril";
		case 5 -> "Maio";
		case 6 -> "Junho";
		case 7 -> "Julho";
		default -> "Mes invalido";
		};
		
		System.out.println(mesDoAno);
		
		/*O switch case tambem é uma forma de controle de fluxo,que executa bloco de código a partir de um valor
		 * de uma variavel, como no exemplo acima a variavel mes recebe o valor 3, quando o switch case é executado
		 * ele verifica esse valor e executa o "case". Caso nenhum valor correspondente seja dado pela variavel
		 * o case default é executado.
		 * */

	}

}
