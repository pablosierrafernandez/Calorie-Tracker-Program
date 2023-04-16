
/**						PR�CTICA 1 - PROGRAMACI�N  - 13/10/2019
 *							Alumno: PABLO SIERRA FERNANDEZ
 * 
 *									ARCHIVOS
 * 
 * 				�  'clase1.java'--> Archivo con todos los metodos definidos
 * 				�  'Main_T.java'--> Archivo Test principal del programa
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
	 * Creamos el m�todo constructor, aplicamos 'this.' para referirnos a las
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
	 * M�todo que calcula la velocidad media, no devuelve nada, almacena el valor de
	 * 'media'.
	 */
	public float cal_media() {
		float media;
		media = distancia / duracion;
		media = media * 60;
		return (media);
	}

	/*
	 * M�todo para copiar una clase y crear un nuevo objeto, metemos los argumentos
	 * en orden.
	 */
	public clase1 copy() {
		return (new clase1(ruta, distancia, duracion, maxAlt, minAlt));
	}

	/*
	 * M�todo para coger la distancia, devuelve la misma.
	 */
	public float get_distancia() {
		return distancia;
	}

	/*
	 * M�todo para coger la altitud m�xima, devuelve la misma.
	 */
	public int get_alt_max() {
		return maxAlt;
	}

	/*
	 * M�todo para coger la altitud m�nima, devuelve la misma.
	 */
	public int get_alt_min() {
		return minAlt;
	}

	/*
	 * M�todo para coger el tiempo, devuelve el mismo.
	 */
	public int get_temps() {
		return duracion;
	}

	/*
	 * M�todo para coger el nombre de la ruta, devuelve el mismo.
	 */
	public String get_nom_ruta() {
		return ruta;
	}

	/*
	 * M�todo para fijar el nombre de la ruta en la variable.
	 */
	public void set_nom_ruta(String nom) {
		ruta = nom;
	}

	/*
	 * M�todo para calcular el n�mero de pasos de media por minuto, se inserta como
	 * argumento 'media'
	 */
	public float num_pasos(float media) {
		media = media * 1000;
		media = media / 60;
		return (media / 0.8f);
	}

	/*
	 * M�todo para calcular la diferencia entre la altitud m�xima y la m�nima,
	 * devuelve un entero con la diferencia.
	 */
	public int dif_alt() {
		return (maxAlt - minAlt);
	}
	/*
	 * M�todo que calcula si 2 distancias de dos objetos diferentes son iguales, nos
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
	 * M�todo que resuelve que altitud es mayor entre dos rutas y devuelve su String
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
	 * M�todo que calcula las calorias quemadas en funcion a la media y al peso que
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
	 * M�todo que calcula el ritmo en el que se recorre la distancia en funcion del
	 * tiempo, fija el valor sin devolverlo
	 */
	public float ritCarr() {
		float ritmo;
		ritmo = distancia / duracion;
		return (ritmo);
	}

	/*
	 * M�todo que imprime los resultados de parte del ejercicio
	 */
	public String tostring() {
		return ("La ruta elegida es de " + ruta + ",\n" + "que llega a tener " + distancia
				+ " KMS, con una duraci�n aproximada de " + duracion + " minutos\n" + "y cuya altitud maxima es "
				+ maxAlt + " m. y cuya altitud m�nima es " + minAlt);
	}

	/*
	 * M�todo que calcula si la ruta es satisfactoria en funcion al umbral fijado o
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
	 * M�todo que fija el umbral que el usuario decida comprendido entre los
	 * est�ndares fijados. Devuelve la correcta o no resolucion de la fijaci�n en
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