package com.rocketseat.datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataTs {

	public static void main(String[] args) {
		LocalDate dataAtual = LocalDate.now();
		LocalDate dataAniversario = LocalDate.of(2001, 8, 20);
		
		//LocalDate dataDos30 = dataAniversario.plusYears(30);
		
		//System.out.println(dataDos30);
		
		//System.out.println(dataAtual);
		//System.out.println(dataAniversario);
		
		//String stringDataBr = "19/04/2026";
		
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		//LocalDate dataConcreta = LocalDate.parse(stringDataBr, formatter);
		
		//System.out.println(dataConcreta);
		
	}

}
