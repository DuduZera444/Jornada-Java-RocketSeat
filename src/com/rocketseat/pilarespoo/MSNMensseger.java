package com.rocketseat.pilarespoo;

public class MSNMensseger {
	
	public void enviarMensagem() {
		if (validarConectadoInternet()) 
			System.out.println("Enviando Mensagem");
		else 
			System.out.println("Computado Off-Line");
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo Mensagem");
	}
	
	private boolean validarConectadoInternet() {
		System.out.println("Validando se esta conectado a internet");
		return true;
	}
	
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando Historico de Mensagem");
	}
}
