package utilidad;

import java.util.StringTokenizer;

public class Array {

	// ORDENA EL VECTOR DE MENOR A MAYOR POR EL METODO DE INSERCION DIRECTA
	public static void ascendenteInsercionDirecta(int[] array) {
		int p, j;
		int aux;
		for (p = 1; p < array.length; p++) { // desde el segundo elemento hasta
			aux = array[p]; // el final, guardamos el elemento y
			j = p - 1; // empezamos a comprobar con el anterior
			while ((j >= 0) && (aux < array[j])) { // mientras queden posiciones y el
													// valor de aux sea menor que los
				array[j + 1] = array[j]; // de la izquierda, se desplaza a
				j--; // la derecha
			}
			array[j + 1] = aux; // colocamos aux en su sitio
		}
	}

	// ORDENA EL VECTOR DE MENOR A MAYOR POR EL METODO DE LA BURBUJA
	public static void ascendenteBurbuja(int[] array) {
		int i, j, aux;
		for (i = 0; i < array.length - 1; i++) {
			for (j = 0; j < array.length - i - 1; j++) {
				if (array[j + 1] < array[j]) {
					aux = array[j + 1];
					array[j + 1] = array[j];
					array[j] = aux;
				}
			}
		}
	}

	// DEUELVE TRE SI LOS 2 ARRAYS INTRODUCIDOS SON IGUALES Y FALSE EN CASO
	// CONTRARIO
	public boolean esIgual(int[] array1, int[] array2) {
		boolean igual = true;

		if (array1.length != array2.length) {
			return false;
		}
		for (int i = 0; i < array1.length - 1; i++) {
			if (array1[i] != array2[i]) {
				igual = false;
			}
		}
		return igual;
	}

	// DEVUELVE TRUE SI LA POSICION INDICADA DEL VECTOR ES EL MENOR VALOR DEL VECTOR
	public boolean menorVector(int[] vector, int punto) {
		if (punto < 0 || punto > vector.length) {
			System.out.println("No existe la posición en el vector");
			return false;
		}
		boolean respuesta = true;
		for (int x = 0; x < vector.length; x++) {
			if (vector[x] < punto) {
				respuesta = false;
			}
		}
		return respuesta;
	}

	// DEVUELVE TRUE SI LA POSICION INDICADA DEL VECTOR ES EL MAYOR VALOR DEL VECTOR
	public boolean mayorVector(int[] vector, int punto) {
		if (punto < 0 || punto > vector.length) {
			System.out.println("No existe la posición en el vector");
			return false;
		}
		boolean respuesta = true;
		for (int x = 0; x < vector.length; x++) {
			if (vector[x] > punto) {
				respuesta = false;
			}
		}
		return respuesta;
	}

	// GUARDA LOS NUMEROS EN UNA CADENA DE NUMEROS SEPARADOS POR ESPACIOS EN UN
	// ARRAY
	public int[] vectorDeCadena(String entrada) {
		StringTokenizer st = new StringTokenizer(entrada, " ");
		int[] notas = new int[st.countTokens() / 2];
		for (int x = 0; x < notas.length; x++) {
			st.nextToken();
			notas[x] = Integer.parseInt(st.nextToken());
		}

		return notas;
	}

}
