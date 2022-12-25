package SistemasDeControl;

import java.util.Iterator;

import org.w3c.dom.ls.LSOutput;

public class SistemasDeControl {

	public static void main(String[] args) {
		//------------------------------------------------------------
		System.out.println("Ejercicio IF");
		System.out.println("============================================");

		int numeroIf = -4;
		
		if (numeroIf > 0 ) {
			System.out.println("El valor de numeroIf es Positivo");
		}
		else if (numeroIf < 0 ){
			System.out.println("El valor de numeroIf es Negativo");
		}
		else {
			System.out.println("El valor de numeroIf es igual a 0");
		};
		
		System.out.println("============================================");
		//------------------------------------------------------------
		System.out.println("Ejercicio WHILE");
		System.out.println("============================================");

		int numeroWhile = 0;
		
		while(numeroWhile < 3) {
			numeroWhile = numeroWhile + 1;
			System.out.println("valor de numeroWhile : " + numeroWhile);
		};
		
		System.out.println("============================================");
		//------------------------------------------------------------
		System.out.println("Ejercicio DO WHILE");
		System.out.println("============================================");
		
		int numeroDoWhile = 3;
				
		do {
			numeroDoWhile++;
			System.out.println("valor de numeroDoWhile: " + numeroDoWhile);
		}while(numeroDoWhile<3);
		
		System.out.println("============================================");
		//------------------------------------------------------------
		//Bloque FOR
		System.out.println("Ejercicio FOR");
		System.out.println("============================================");
				
		int numeroFor = 0;
		for (; numeroFor <= 3; numeroFor++) {
			System.out.println("Valor de numeroFor: " + numeroFor);
		}

		System.out.println("============================================");
		//------------------------------------------------------------
		System.out.println("Ejercicio SWITCH");
		System.out.println("============================================");
		
		String estacion = "Primavera";
		
		switch (estacion) {
			case "Verano":
				System.out.println("Valor de estación es Verano");
				break;
			case "Otoño":
				System.out.println("Valor de estación es Otoño");
				break;
			case "Invierno":
				System.out.println("Valor de estación es Invierno");
				break;
			case "Primavera":
				System.out.println("Valor de estación es Primavera");
				break;				
			default:
				System.out.println("Valor no es una estación del año");
				break;
		}
	}
}