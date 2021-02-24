package ejercicios3;
import java.io.*;
import java.net.*;

public class Ejercicio3_8_2 {

	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		InetAddress destino=InetAddress.getLocalHost();
		int port=12345;
		
		Persona p=new Persona("Almudena",22);

		ByteArrayOutputStream bs=new ByteArrayOutputStream();
		ObjectOutputStream out=new ObjectOutputStream(bs);
		out.writeObject(p);
		out.close();
		
		byte[] mensaje=bs.toByteArray();
		DatagramPacket envio=new DatagramPacket(mensaje, mensaje.length,destino,port);
		DatagramSocket socket=new DatagramSocket();
		socket.send(envio);
		
		byte[] recibidos=new byte[1024];
		System.out.println("Esperando datagrama...");
		DatagramPacket recibo=new DatagramPacket(recibidos,recibidos.length);
		socket.receive(recibo);

		ByteArrayInputStream bais=new ByteArrayInputStream(recibidos);
		ObjectInputStream in=new ObjectInputStream(bais);
		Persona persona=(Persona) in.readObject();
		System.out.println(persona.getNombre());
		System.out.println(persona.getEdad());
		
		in.close();
		socket.close();
	}

}
