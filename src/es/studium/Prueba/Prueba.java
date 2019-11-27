package es.studium.Prueba;

import java.util.Scanner;
import java.util.Vector;

public class Prueba
{

	public static void main(String[] args)
	{

		int i;
		Vector v = new Vector();
		for (i = 0; i < 10; i++)
		{
			v.addElement(i);
			System.out.println(v);
		}

		/*
		 * Scanner teclado = new Scanner(System.in); String tabla[][] = new
		 * String[4][5]; int i, j;
		 * 
		 * 
		 * for (i = 0; i < 4; i++) { for (j = 0; j < 5; j++) {
		 * System.out.println("Introduzca la cadena de texto ("+i+","+j+")");
		 * tabla[i][j] = teclado.next(); } } for (i=0;i<4;i++) { for (j=0;j<5;j++) {
		 * System.out.println("Introduzca la cadena de texto ["+i+"]["+j+"]="+tabla[i][j
		 * ]); } }
		 * 
		 * 
		 * for (i = 0; i < 10; i++) { System.out.println("Tabla["+i+"]="+tabla[i]);
		 * //System.out.println("Las cadenas de texto introducidas son " + tabla[i]); }
		 * 
		 * teclado.close();
		 */
	}

}
