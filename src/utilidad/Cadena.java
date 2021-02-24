package utilidad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cadena {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public int cuentaVocales(String cadena) throws IOException {
		int vocales = 0;
		for (int x = 0; x < cadena.length(); x++) {
			if ((cadena.charAt(x) == 'a') || (cadena.charAt(x) == 'e') || (cadena.charAt(x) == 'i')
					|| (cadena.charAt(x) == 'o') || (cadena.charAt(x) == 'u') || (cadena.charAt(x) == 'A')
					|| (cadena.charAt(x) == 'E') || (cadena.charAt(x) == 'I') || (cadena.charAt(x) == 'O')
					|| (cadena.charAt(x) == 'U')) {
				vocales++;
			}
		}
		return vocales;
	}
	
	public String eliminaEspacios(String cadena) throws IOException {
		String nuevaCadena = "";
		for (int x = 0; x < cadena.length(); x++) {
			if ((cadena.charAt(x) != ' ')) {
				nuevaCadena += cadena.charAt(x);
			}
		}
		return nuevaCadena;
	}
	
	public boolean buscaEnString(String cadena, String palabra) throws IOException {
		boolean respuesta;
		if (cadena.contains(palabra)) {
			respuesta = true;
		} else {
			respuesta = false;
		}
		return respuesta;
	}
	
	public String invertirString(String cadena) throws IOException {
		String nuevaCadena = "";
		for (int x = cadena.length() - 1; x >= 0; x--) {
			nuevaCadena += cadena.charAt(x);
		}
		return nuevaCadena;
	}
	
	//COMPRUEBA SI ES UN PALINDROMO IGNORANDO MAYUSCULAS
	public Boolean esPalindromo(String cadena) throws IOException {
		String nuevaCadena = "";
		for (int x = cadena.length() - 1; x >= 0; x--) {
			nuevaCadena += cadena.charAt(x);
		}
		boolean respuesta;
		if (cadena.equalsIgnoreCase(nuevaCadena)) {
			respuesta = true;
		} else {
			respuesta = false;
		}
		return respuesta;
	}
	
	//SOLO SIRVE PARA CAMBIAR DOS PALABRAS SEPARADOS POR UN ESPACIO DE LUGAR
	public String cambiaPalabra(String cadena) throws IOException {
		String palabra1 = "";
		String palabra2 = "";
		boolean aux = false;

		for (int x = 0; x < cadena.length(); x++) {
			if (aux == false) {
				palabra1 = palabra1 + cadena.charAt(x);
			} else {
				palabra2 = palabra2 + cadena.charAt(x);
			}

			if ((cadena.charAt(x) == ' ')) {
				aux = true;
			}
		}

		return palabra2 + " " + palabra1.substring(0, palabra1.length() - 1);
	}
	
	
	
}
