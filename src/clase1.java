
/**						PRÁCTICA 1 - PROGRAMACIÓN  - 13/10/2019
 *							Alumno: PABLO SIERRA FERNANDEZ
 * 
 *									ARCHIVOS
 * 
 * 				·  'clase1.java'--> Archivo con todos los metodos definidos
 * 				·  'Main_T.java'--> Archivo Test principal del programa
 * 
 * --------------------------------------------------------------------------------------------------------------
 * --------------------------------------------------------------------------------------------------------------
 */

import java.util.Scanner;

/*
 * Declaramos las variables de la clase principal 'clase1'
 */

public class clase1 {
	private String ruta;
	private float distancia;
	private int duracion;
	private int maxAlt;
	private int minAlt;
	public int umbral = 14;
	public String cadena = "El rango esta fuera del establecido";
	public String cadenabien = "Umbral fijado";
	Scanner entrada = new Scanner(System.in);

	/*
	 * Creamos el método constructor, aplicamos 'this.' para referirnos a las
	 * variables principales declaradas
	 */
	public clase1(String ruta, float distancia, int duracion, int maxAlt, int minAlt) {
		this.ruta = ruta;
		this.distancia = distancia;
		this.duracion = duracion;
		this.maxAlt = maxAlt;
		this.minAlt = minAlt;
	}

	/*
	 * Método que calcula la velocidad media, no devuelve nada, almacena el valor de
	 * 'media'.
	 */
	public float cal_media() {
		float media;
		media = distancia / duracion;
		media = media * 60;
		return (media);
	}

	/*
	 * Método para copiar una clase y crear un nuevo objeto, metemos los argumentos
	 * en orden.
	 */
	public clase1 copy() {
		return (new clase1(ruta, distancia, duracion, maxAlt, minAlt));
	}

	/*
	 * Método para coger la distancia, devuelve la misma.
	 */
	public float get_distancia() {
		return distancia;
	}

	/*
	 * Método para coger la altitud máxima, devuelve la misma.
	 */
	public int get_alt_max() {
		return maxAlt;
	}

	/*
	 * Método para coger la altitud mínima, devuelve la misma.
	 */
	public int get_alt_min() {
		return minAlt;
	}

	/*
	 * Método para coger el tiempo, devuelve el mismo.
	 */
	public int get_temps() {
		return duracion;
	}

	/*
	 * Método para coger el nombre de la ruta, devuelve el mismo.
	 */
	public String get_nom_ruta() {
		return ruta;
	}

	/*
	 * Método para fijar el nombre de la ruta en la variable.
	 */
	public void set_nom_ruta(String nom) {
		ruta = nom;
	}

	/*
	 * Método para calcular el número de pasos de media por minuto, se inserta como
	 * argumento 'media'
	 */
	public float num_pasos(float media) {
		media = media * 1000;
		media = media / 60;
		return (media / 0.8f);
	}

	/*
	 * Método para calcular la diferencia entre la altitud máxima y la mínima,
	 * devuelve un entero con la diferencia.
	 */
	public int dif_alt() {
		return (maxAlt - minAlt);
	}
	/*
	 * Método que calcula si 2 distancias de dos objetos diferentes son iguales, nos
	 * devuelve booleano si es cierto que son o no iguales
	 */

	public boolean iguales(clase1 comp) {
		if (dif_alt() == comp.dif_alt())
			if (distancia == comp.distancia)
				return true;
			else {
				return false;
			}
		else
			return false;
	}

	/*
	 * Método que resuelve que altitud es mayor entre dos rutas y devuelve su String
	 * (nombre de la ruta), Null si no es resuelto
	 */
	public String mayor_alt(clase1 comparar) {
		if (dif_alt() > comparar.dif_alt())
			return (ruta);
		else if (dif_alt() < comparar.dif_alt())
			return (comparar.ruta);
		else
			return ("NULL");

	}

	/*
	 * Método que calcula las calorias quemadas en funcion a la media y al peso que
	 * insertamos por parametro
	 */
	public float cal_quemadas(float media, float peso) {
		float calorias = 0;
		if (media >= 12)
			calorias = peso * distancia * 1.25f;
		else if ((media < 12) && (media >= 6))
			calorias = peso * distancia * 1.03f;
		else if (media <= 6)
			calorias = peso * distancia * 0.73f;
		return (calorias);
	}

	/*
	 * Método que calcula el ritmo en el que se recorre la distancia en funcion del
	 * tiempo, fija el valor sin devolverlo
	 */
	public float ritCarr() {
		float ritmo;
		ritmo = distancia / duracion;
		return (ritmo);
	}

	/*
	 * Método que imprime los resultados de parte del ejercicio
	 */
	public String tostring() {
		return ("La ruta elegida es de " + ruta + ",\n" + "que llega a tener " + distancia
				+ " KMS, con una duración aproximada de " + duracion + " minutos\n" + "y cuya altitud maxima es "
				+ maxAlt + " m. y cuya altitud mínima es " + minAlt);
	}

	/*
	 * Método que calcula si la ruta es satisfactoria en funcion al umbral fijado o
	 * preestablecido anteriormente en la funcion 'fijarUmbral()', devuelve booleano
	 * en funcion de si es o no satisfactorio.
	 */

	public boolean Satisfactorio(float ritmo) {
		boolean satisfactorio;
		if (ritmo < umbral) {
			satisfactorio = true;
		} else {
			satisfactorio = false;
		}
		return (satisfactorio);
	}
	/*
	 * Método que fija el umbral que el usuario decida comprendido entre los
	 * estándares fijados. Devuelve la correcta o no resolucion de la fijación en
	 * forma de String y fija el umbral.
	 */

	public String fijarUmbral() {
		int prueba;
		System.out.println("Fije un umbral entre 5 y 20");
		prueba = entrada.nextInt();
		if ((prueba < 5) || (prueba > 20)) {
			return (cadena);
		} else {
			umbral = prueba;
			return (cadenabien);
		}
	}
}