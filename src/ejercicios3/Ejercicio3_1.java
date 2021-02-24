package ejercicios3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ejercicio3_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String mensaje = "";
		InetAddress[] direcciones = null;
		System.out.println("Introduzca la direccion ip:");
		boolean failsafe = true;
		mensaje = input.next();
		try {
			direcciones = InetAddress.getAllByName(mensaje);
			System.out.println("Direcciones ip de : "+mensaje);
			for (int i = 0; i < direcciones.length; i++) {
				System.out.println(direcciones[i].toString());
				System.out.println("-----------------------------------");
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}