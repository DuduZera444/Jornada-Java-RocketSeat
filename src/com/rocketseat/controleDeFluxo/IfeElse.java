package com.rocketseat.controleDeFluxo;

public class IfeElse {

	public static void main(String[] args) {
		
		int nota = 6;
		String status;
		
		if (nota >=7) {
			status = "aprovado";
		}else {
			status = "reprovado";
		}
		
		System.out.println(status);
	}
	
	/* O if e else são controles de fluxo que verificam uma condição como no exemplo acima o programa verifica se nota
	 * é maior ou igual a 7 se sim a variavel status recebe ("aprovado") se não codigo continua e status recebe a outra
	 * condição que é reprovado, por fim o codigo imprime na tela o resultado.
	 * */
	

}
