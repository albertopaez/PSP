package ejercicio2_8;

public class Saldo {

	private double saldo;
	
	public Saldo(double saldo){
		this.saldo = saldo;
	}

	public double getSaldo() throws InterruptedException {
		Thread.sleep((long) (Math.random()*10));
		return saldo;
	}

	public void setSaldo(double saldo) throws InterruptedException {
		Thread.sleep((long) (Math.random()*10));
		this.saldo = saldo;
	}
	
	public synchronized void sumarSaldo(double cantidad, String nombre) {
		System.out.println("Saldo inicial: "+saldo);
		saldo = saldo+cantidad;
		System.out.println("cantidad ingresada: "+cantidad);
		//System.out.println("Total: "+saldo);
		System.out.println("Ingreso realizado por: "+nombre);
	}

	@Override
	public String toString() {
		return "Saldo [saldo=" + saldo + "]";
	}
	
	
}