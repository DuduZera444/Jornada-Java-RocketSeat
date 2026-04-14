package com.rocketseat.sintaxe;

public class ExercicioContaCorrente {
	/*A atividade pede para fazer a declaração e variaveis de metodos que seriam usados em uma conta
	 * corrente.
	 */
	
	
	String nomeCliente;
	Integer numero;
	Integer agencia;
	String dataNasc;
	Double saldo;
	boolean ativo = true;
	
	
	Double consultarSaldo() {
		return saldo;
	}
	
	void cancelar (String justificativa) {
	}
	
	void tranferir (ExercicioContaCorrente contaDestino, Double valorTransferido) {
	}
	
	void sacar (Double valorSaque){
	}
	
	
	
	
}
