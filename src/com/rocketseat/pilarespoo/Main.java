package com.rocketseat.pilarespoo;

public class Main {

	public static void main(String[] args) {
		
		MSNMensseger msn = new MSNMensseger();
		msn.enviarMensagem();
		msn.receberMensagem();
		
		Facebook face = new Facebook();
		face.enviarMensagem();
		face.receberMensagem();
		
		Telegram tele = new Telegram();
		tele.enviarMensagem();
		tele.receberMensagem();
	}

}
