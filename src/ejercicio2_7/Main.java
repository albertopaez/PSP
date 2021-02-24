package ejercicio2_7;

public class Main {
	static int contador;
	public static void main(String[]args) {
		Contador contador = new Contador();
		Hilo1 h1 = new Hilo1(contador);
		Hilo2 h2 = new Hilo2(contador);
		Hilo3 h3 = new Hilo3(contador);
		Hilo4 h4 = new Hilo4(contador);
		Hilo5 h5 = new Hilo5(contador);
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		h5.start();
	}
}
