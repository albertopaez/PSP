package utilidad;

import java.io.IOException;

public class Matematicas {

	// CALCULA EL FACTORIAL DEL NUMERO INTRODUCIDO
	public int factorial(int numero) throws IOException {
		if (numero == 0) {
			return 1;
		} else {
			return numero * factorial(numero - 1);
		}
	}

	// CALCULA EL VALOR DE LA POSICIÓN DADA EN LA SERIE DE FIBONACCI
	public int CalcularFibonacci(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return CalcularFibonacci(n - 1) + CalcularFibonacci(n - 2);
	}

	// DEVUELVE UNA CADENA CON TODOS LOS NUMEROS DE LA SERIE DE FIBONACCI HASTA LA
	// POSICIÓN DADA SEPARADOS CADA UNO POR UN ESPACIO
	public String imprimirFibonacci(int n) {
		String cadena = "";
		for (int x = 0; x <= n; x++) {
			cadena += CalcularFibonacci(x) + " ";
		}
		return cadena;
	}

	// CALCULA EL VALOR DE LA POSICIÓN DADA EN EL TRIANGULO DE TARTAGLIA
	public int calcularTartaglia(int altura, int posicion) {
		if (posicion == 1 || posicion == altura) {
			return 1;
		} else {
			return calcularTartaglia(altura - 1, posicion - 1) + calcularTartaglia(altura - 1, posicion);
		}
	}

	// DEVUELVE UNA CADENA CON EL TRIANGULO DE TARTAGLIA DE LA ALTURA INTRODUCIDA
	public String imprimirTartaglia(int altura) {
		
		if(altura < 1) {
			return null;
		}
		
		String triangulo = "";

		for (int x = 1; x <= altura; x++) {
			for (int j = 0; j < altura - x; j++) {
				triangulo += " ";
			}

			for (int i = 1; i <= x; i++) {
				triangulo += calcularTartaglia(x, i);
				if (i == x) {
					triangulo += "\n";
				} else {
					triangulo += " ";
				}
			}
		}
		return triangulo;
	}

}
