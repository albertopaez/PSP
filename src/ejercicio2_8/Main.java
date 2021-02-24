package ejercicio2_8;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Saldo sal = new Saldo(20);
		Suma s1 = new Suma(15, "Alberto", sal);
		Suma s2 = new Suma(20, "Francisco", sal);
		Suma s3 = new Suma(30, "Maribel", sal);
		
		s1.start();
		s2.start();
		s3.start();
		
		System.out.println(sal.getSaldo());
	}

}
