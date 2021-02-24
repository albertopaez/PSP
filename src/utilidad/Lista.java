package utilidad;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	// RECIBE UN ARRAY INTEGER Y DEVUELVE UN LIST INTEGER
	public List<Integer> arrayIntToList(int[] array) {
		List<Integer> contenedor = new ArrayList<Integer>();

		for (int x = 0; x < array.length; x++) {
			contenedor.add(array[x]);
		}
		return contenedor;
	}

	// RECIBE UN LIST INTEGER Y DEVUELVE UN ARRAY INTEGER
	public int[] ListToArrayInt(List<Integer> contenedor) {
		int[] array = new int[contenedor.size()];

		for (int x = 0; x < array.length; x++) {
			array[x] = contenedor.get(x);
		}
		return array;
	}

}