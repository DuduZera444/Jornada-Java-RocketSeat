package com.rocketseat.polimorfismo;

public class Cachorro extends Animal implements Acao{
	
	public void som() {
		System.out.println("Au Au!");
	}
	
	public void comer() {
		System.out.println("Cachorro esta comendo!");
	}
}
