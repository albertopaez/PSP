package ejercicio3_4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import utilidad.Input;

public class Cliente {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Input input = new Input();
		String host = "localhost";
		int puerto = 6000;
		Socket cliente= new Socket(host,puerto);
		
		DataOutputStream fs = new DataOutputStream(cliente.getOutputStream());
		System.out.println("Numero: ");
		fs.writeUTF(""+input.tryInteger());
		DataInputStream in = new DataInputStream(cliente.getInputStream());
		System.out.println(in.readUTF());
		fs.close();
		in.close();
		cliente.close();
	}

}