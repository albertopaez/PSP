package utilidad;

public class Matriz {

	
	// GENERA UNA MATRIZ CUADRADA ALEATORIA DEL TAMAÑO Y RANGO DE ALETORIEDAD ESPECIFICADOS 
	public int[][] generarMatrizCuadradaAleatoria(int tamanio, int random) {
		int[][] matriz = new int[tamanio][tamanio];
		
		for (int x = 0; x < tamanio; x++) {
			for (int y = 0; y < tamanio; y++) {
				matriz[x][y] = (int) (Math.random() * random);
			}
		}
		return matriz;
	}
	
	
	public String mostrarMatriz(int[][] matriz) {
		String mostrar="";
		
		for(int x=0; x<matriz.length; x++) {
			mostrar+="\n";
			for(int y=0; y<matriz[1].length; y++) {
				mostrar+= matriz[x][y]+" ";
			}
		}
		return mostrar;
	}
	
	
	// CALCULA SI EL PUNTO CORRESPONDIENTE A LAS COORDENADAS DE LA FILA Y LA COLUMNA
	// ES UN PUNTO DE SILLA
	public boolean puntoSilla(int[][] matriz, int fila, int columna) {
		boolean respuesta = false;
		int[] col = new int[matriz.length];
		int[] fil = new int[matriz.length];

		Array v = new Array();

		for (int i = 0; i < col.length; i++) {
			col[i] = matriz[i][columna];
		}
		for (int i = 0; i < col.length; i++) {
			fil[i] = matriz[fila][i];
		}
		if (v.menorVector(fil, matriz[fila][columna]) && v.mayorVector(col, matriz[fila][columna])) {
			respuesta = true;
		}
		return respuesta;
	}
}
