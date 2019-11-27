package es.studium.PrimerEjercicio;
import java.util.Random;
public class PreguntasRespuestas
{

	public static void main(String[] args)
	{
		
		String randomPreguntas="";
		int x=4;
		int y=5;
		
		
		String preguntas[][] = new String[x][y];
		String seleccion[][]=new String [2][3];
		
		preguntas[0][0] = "¿Cuál es la capital de España?";
		preguntas[0][1] = "¿De que color es el mar?";
		preguntas[0][2] = "¿Cuántas vidas tiene un gato?";
		preguntas[0][3] = "¿Cuál es la capital de Francia?";
		preguntas[0][4] = "¿Cuál es la capital de Inglaterra?";
		
		preguntas[1][0] = "¿De que color es el cesped?";
		preguntas[1][1] = "¿Que equipos son grandes rivales en Sevilla?";
		preguntas[1][2]= "¿Que equipos son grandes rivales en Madrid?";
		preguntas[1][3] = "¿Quién escribió El Quijote?";
		preguntas[1][4] = "¿Cuál es el libro mas famoso de todos los tiempos?";
		
		preguntas[2][0] = "Madrid";
		preguntas[2][1] = "azul";
		preguntas[2][2] = "siete";
		preguntas[2][3] = "París";
		preguntas[2][4] = "Londres";
		
		preguntas[3][0] = "verde";
		preguntas[3][1] = "Sevilla y Betis";
		preguntas[3][2] = "Real Madrid y Atletico de Madrid";
		preguntas[3][3] = "Miguel de Cervantes Saavedra";
		preguntas[3][4] = "La Biblia";
		
		for (int i = 0; i < x; i++)
		{
			//System.out.println(pregunta[i].length);
			for(int j =0; j<y;j++) {
				seleccion[i][j]= randomPreguntas;
			}
			
		}
		/*for (int i = 0; i < Math.random(); i++)
		{
			for(int j =0; j<preguntas.length;j++) {
				
			}
			
		}*/
		/*
		 * switch (preguntas) { case 1:
		 * System.out.println("¿Cuál es la capital de España?"); break; case 2:
		 * System.out.println("¿De que color es el mar?"); break; case 3:
		 * System.out.println("¿Cuántas vidas tiene un gato?"); break; case 4:
		 * System.out.println("¿Cuál es la capital de Francia?"); break; case 5:
		 * System.out.println("¿Cuál es la capital de Inglaterra?"); break; case 6:
		 * System.out.println("¿De que color es el cesped?"); break; case 7:
		 * System.out.println("¿Que equipos son grandes rivales en Sevilla?"); break;
		 * case 8: System.out.println("¿Que equipos son grandes rivales en Madrid?");
		 * break; case 9: System.out.println("¿Quién escribió El Quijote?"); break; case
		 * 10: System.out.println("¿Cuál es el libro mas famoso de todos los tiempos?");
		 * break; default: System.out.println("El número introducido no es correcto");
		 * break; }
		 */

	}

}
