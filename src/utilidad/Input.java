package utilidad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public float tryFloat() throws IOException {
		float numero = 0;
		boolean failsafe = true;
		do {
			try {
				numero = Float.parseFloat(br.readLine());
				failsafe = false;
			} catch (NumberFormatException ex) {
				System.out.println("Comando invalido");
			}
		} while (failsafe);
		return numero;
	}

	public double tryDouble() throws IOException {
		double numero = 0;
		boolean failsafe = true;
		do {
			try {
				numero = Double.parseDouble(br.readLine());
				failsafe = false;
			} catch (NumberFormatException ex) {
				System.out.println("Comando invalido");
			}
		} while (failsafe);
		return numero;
	}

	public int tryInteger() throws IOException {
		int numero = 0;
		boolean failsafe = true;
		do {
			try {
				numero = Integer.parseInt(br.readLine());
				failsafe = false;
			} catch (NumberFormatException ex) {
				System.out.println("Comando invalido");
			}
		} while (failsafe);
		return numero;
	}

	public long tryLong() throws IOException {
		long numero = 0;
		boolean failsafe = true;
		do {
			try {
				numero = Long.parseLong(br.readLine());
				failsafe = false;
			} catch (NumberFormatException ex) {
				System.out.println("Comando invalido");
			}
		} while (failsafe);
		return numero;
	}

	public float tryFloatPositivo() throws IOException {
		float numero = 0;
		boolean failsafe = true;
		do {
			try {
				numero = Float.parseFloat(br.readLine());
				failsafe = false;
			} catch (NumberFormatException ex) {
				System.out.println("Comando invalido");
			}
			if (numero < 0) {
				System.out.println("Comando invalido");
				failsafe = true;
			}
		} while (failsafe);
		return numero;
	}

	public double tryDoublePositivo() throws IOException {
		double numero = 0;
		boolean failsafe = true;
		do {
			try {
				numero = Double.parseDouble(br.readLine());
				failsafe = false;
			} catch (NumberFormatException ex) {
				System.out.println("Comando invalido");
			}
			if (numero < 0) {
				System.out.println("Comando invalido");
				failsafe = true;
			}
		} while (failsafe);
		return numero;
	}

	public int tryIntegerPositivo() throws IOException {
		int numero = 0;
		boolean failsafe = true;
		do {
			try {
				numero = Integer.parseInt(br.readLine());
				failsafe = false;
			} catch (NumberFormatException ex) {
				System.out.println("Comando invalido");
			}
			if (numero < 0) {
				System.out.println("Comando invalido");
				failsafe = true;
			}
		} while (failsafe);
		return numero;
	}

	public long tryLongPositivo() throws IOException {
		long numero = 0;
		boolean failsafe = true;
		do {
			try {
				numero = Long.parseLong(br.readLine());
				failsafe = false;
			} catch (NumberFormatException ex) {
				System.out.println("Comando invalido");
			}
			if (numero < 0) {
				System.out.println("Comando invalido");
				failsafe = true;
			}
		} while (failsafe);
		return numero;
	}

	public int tryIntegerAcotado(int menor, int mayor) throws IOException {
		int numero = 0;
		boolean failsafe = true;
		do {
			try {
				numero = Integer.parseInt(br.readLine());
				failsafe = false;
			} catch (NumberFormatException ex) {
				System.out.println("Comando invalido");
			}
			if (numero < menor || numero > mayor) {
				System.out.println("Comando invalido");
				failsafe = true;
			}
		} while (failsafe);
		return numero;
	}

	public double tryDoubleAcotado(double menor, double mayor) throws IOException {
		double numero = 0;
		boolean failsafe = true;
		do {
			try {
				numero = Double.parseDouble(br.readLine());
				failsafe = false;
			} catch (NumberFormatException ex) {
				System.out.println("Comando invalido");
			}
			if (numero < menor || numero > mayor) {
				System.out.println("Comando invalido");
				failsafe = true;
			}
		} while (failsafe);
		return numero;
	}

	public float tryFloatAcotado(float menor, float mayor) throws IOException {
		float numero = 0;
		boolean failsafe = true;
		do {
			try {
				numero = Float.parseFloat(br.readLine());
				failsafe = false;
			} catch (NumberFormatException ex) {
				System.out.println("Comando invalido");
			}
			if (numero < menor || numero > mayor) {
				System.out.println("Comando invalido");
				failsafe = true;
			}
		} while (failsafe);
		return numero;
	}

	public long tryLongAcotado(long menor, long mayor) throws IOException {
		long numero = 0;
		boolean failsafe = true;
		do {
			try {
				numero = Long.parseLong(br.readLine());
				failsafe = false;
			} catch (NumberFormatException ex) {
				System.out.println("Comando invalido");
			}
			if (numero < menor || numero > mayor) {
				System.out.println("Comando invalido");
				failsafe = true;
			}
		} while (failsafe);
		return numero;
	}

}
