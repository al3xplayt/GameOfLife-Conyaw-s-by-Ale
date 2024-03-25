package PruebasTecnicas;

import java.util.Scanner;

import entrada.Teclado;

public class cadenaInversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		String cadenaADev = "";
		String cadenaOriginal;
		System.out.print("Ingrese una frase: ");
		cadenaOriginal = scanner.nextLine();
		for (int pos = cadenaOriginal.length() -1 ; pos >= 0; pos--) {
			cadenaADev += cadenaOriginal.charAt(pos);
		}
		System.out.println(cadenaADev);
	}

}
