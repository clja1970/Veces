package es.studium.Veces;

import java.util.Scanner;

public class Veces {

	public static void main(String[] args) {
		int numero,veces,i;
		Scanner teclado = new Scanner (System.in);
		System.out.print("Dame el número de veces que quires que se repita un número: ");
		veces = teclado.nextInt();
		System.out.print("El número que quieres que se repita: ");
		numero = teclado.nextInt();
		teclado.close();
		for (i=1;i<=veces;i++)
					{
			System.out.println(numero);
		}
	}
}
