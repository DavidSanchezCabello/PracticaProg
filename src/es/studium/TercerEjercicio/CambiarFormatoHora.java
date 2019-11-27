package es.studium.TercerEjercicio;

import java.util.Scanner;

public class CambiarFormatoHora
{

	public static void main(String[] args)
	{
		// Declaración de variables
		int num1, num2;
		int respuesta = 0;
		// Llamamos a la clase Scanner, la importamos y creamos el objeto teclado
		Scanner teclado = new Scanner(System.in);
		// Pedimos al usuario que introduzca la hora y los minutos en formato am y
		// guardamos los resultados en dos variables
		System.out.println("Introduzca una hora en formato am ");
		num1 = teclado.nextInt();
		System.out.println("introduzca los minutos ");
		num2 = teclado.nextInt();
		//Una vez que tenemos los valores de num1 y num2, declaramos una variable tipo String para solucionar los digitos de menos de 10 
		String num3 = "0"+num2;
		// Creamos una instrucción condicional compuesta, para los minutos que terminan
		// en '0n'
		if (num2 < 10)
		{
			num3 = ("0"+num2 );
			System.out.println("A introducido las " + num1 + ":" + num3);
		} else
		{
			System.out.println("A introducido las " + num1 + ":" + num3);
		}
		/* Preguntamos al usuario si desea cambiar al formato am a traves de un menu con
		   tres opciones y la guardamos en la variable "respuesta" para mas adelante*/
		System.out.println(
				"¿ Desea cambiar la hora a formato pm ? Indique el número correspondiente a su respuesta: \n     ##OPCIONES##    \n     1.YES (si)     \n     2.NO      \n     3.Salir     \n");
		respuesta = teclado.nextInt();
		// Creamos una instrucción condicional multiple para la variable "respuesta"
		switch (respuesta)
		{
		/* Volvemos a crear la misma instruccion compuesta para la respuesta afirmativa,
		   para que en caso de tener una hora en punto nos devuelva por ej.'12:00pm'*/
		case 1:
			if (num2 < 10)
			{

				num3 = ( "0"+ num2 );
				System.out.println("A introducido las " + (num1 - 12) + ":" + num3);
			} else
			{
				System.out.println("Son las " + (num1 - 12) + ":" + num3 + "pm");
			}
			break;
		case 2:
			System.out.println("Hasta la proxima...!!!");
			break;
		default:
			System.out.println("!!!...Adiós...!!!");
			break;
		}

		teclado.close();
	}

}
