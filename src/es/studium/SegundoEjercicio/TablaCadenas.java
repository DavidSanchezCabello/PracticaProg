package es.studium.SegundoEjercicio;

import java.util.Scanner;

public class TablaCadenas
{

	public static void main(String[] args)
	{
		String tabla[] = new String[10];
		int i = 0;
		// Llamamos a la clase Scanner, la importamos y creamos el objeto teclado
		Scanner  teclado = new Scanner(System.in);
		/* Creamos un bucle para recorrer toda la tabla y le pedimos al usuario que
		   introduzca cadenas de caracteres que se insertarán en cada uno de los diez espacios de la matriz*/
		for (i = 0; i < 10; i++)
		{
			/* concatenamos el itinerante (i)con el texto y le sumamos 1 para que incremente
			 en cada vuelta dandole mas coherencia al mensaje del usuario*/
			System.out.println("Introduzca texto " + (i + 1) + ", por favor...");
			tabla[i] = teclado.nextLine();
			/*
			 * Generamos otro bucle que recorra toda la tabla para así poder, en cada vuelta
			 * imprimir la cadena que corresponda a esa posicion de la misma y lo
			 * concatenamos con el itinerante sumandole 1 para que quede con informacion de
			 * el orden de ingreso en la tabla.
			 */
		}
		for (i = 0; i < tabla.length; i++)
		{

			System.out.println("Cadena " + (i + 1) + " " + tabla[i]);

		}
			//Cerramos el objeto teclado ya que no lo necesitamos y así quitamos el warning
		teclado.close();
	}

}
