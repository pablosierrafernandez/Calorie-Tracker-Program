
/**						PRÁCTICA 1 - PROGRAMACIÓN  - 13/10/2019
 *							Alumno: PABLO SIERRA FERNANDEZ
 * 
 *									ARCHIVOS
 * 
 * 				'clase1.java'--> Archivo con todos los metodos definidos
 * 				  'Main_T.java'--> Archivo Test principal del programa
 * --------------------------------------------------------------------------------------------------------
 * --------------------------------------------------------------------------------------------------------
 */

import java.util.Scanner;

public class Main_T {
	/*
	 * Se trata del 'main' que testea el programa, declaramos los objetos con los
	 * datos que consideremos
	 */
	public static void main(String[] args) {
		float media, pasos, cal, pes;
		float ritmo;
		boolean satisfactorio;
		char letra;
		String cadena;
		Scanner entrada = new Scanner(System.in);
		clase1 ruta1 = new clase1("Madrid a Coslada", 18.6f, 30, 40, 8);
		clase1 ruta2 = new clase1("Sitges a Cádiz", 15f, 200, 133, 88);
		clase1 ruta3 = new clase1("Sevilla a Murcia", 9.4f, 50, 203, 63);
		clase1 ruta4 = new clase1("Tarragona a Altafulla", 21.5f, 99, 26, 65);
		clase1 ruta5 = new clase1("Barcelona a Reus", 29.3f, 635, 324, 21);
		/*
		 * Calculamos la media.
		 */
		media = ruta1.cal_media();

		/*
		 * Calculamos si dos rutas son o no iguales e imprimimos el resultado
		 */
		System.out.println("\nLas rutas de " + ruta1.get_nom_ruta() + " y " + ruta2.get_nom_ruta() + " ");
		if (ruta1.iguales(ruta2)) {
			System.out.println("son rutas iguales");
		} else {
			System.out.println("son rutas diferentes");
		}

		/*
		 * Calculamos el ritmo de la carrera.
		 */
		ritmo = ruta5.ritCarr();
		System.out.println("\nEl ritmo de " + ruta5.get_nom_ruta() + " es: " + ritmo);
		/*
		 * Copiamos un objeto en otro objeto creado nuevo '_ruta1'
		 */
		clase1 _ruta1 = ruta1.copy();

		/*
		 * Calculamos la media de pasos efectuado a partir del objeto copiado e
		 * imprimimos el resultado.
		 */
		pasos = _ruta1.num_pasos(media);
		System.out.println(ruta1.tostring());
		System.out.println(
				"La media de pasos por minuto es de " + media + " pasos y los efectuados en total son " + pasos);
		/*
		 * Calculamos las calorias quemadas en la ruta efectuada, para ello nos haremos
		 * servir de pedirle al usuario su peso en Kg. Imprimimos el resultado.
		 */
		System.out.println("¿Cúal es su peso(Kg)?: \n");
		pes = entrada.nextFloat();
		cal = ruta1.cal_quemadas(media, pes);
		System.out.printf("Las calorias quemadas son: %.2f ", cal);

		System.out.println("\nLa ruta de mayor altitud desde " + ruta3.get_nom_ruta() + " y " + ruta4.get_nom_ruta()
				+ " es: " + ruta3.mayor_alt(ruta4));
		/*
		 * Preguntamos al usuario si quiere modificar el umbral; el umbral
		 * preestablecido es 14. Calculamos si es satisfactorio el recorrido e
		 * imprimimos el resultado en booleano.
		 */
		System.out.println("\n¿Quiere modificar el umbral--> S ó N");
		letra = entrada.next().charAt(0);

		switch (letra) {

		case 'S':
		case 's':

			cadena = ruta1.fijarUmbral(); // Fijamos el umbral
			System.out.println(cadena);
			satisfactorio = ruta1.Satisfactorio(ritmo);
			System.out.println("\nSATISFACTORIEDAD: " + satisfactorio);
			break;

		case 'N':
		case 'n':
			satisfactorio = ruta1.Satisfactorio(ritmo);
			System.out.println("\nSATISFACTORIEDAD: " + satisfactorio);
			break;

		default:
			System.out.println("\nEl valor introducido es erroneo ");

		}
		entrada.close();

	}

}