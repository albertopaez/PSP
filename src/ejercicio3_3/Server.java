package ejercicio3_3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		int puerto = 6000;
		ServerSocket server = new ServerSocket(puerto);
		System.out.println("Escuchando en puerto: "+server.getLocalPort()+" ...");
		Socket cliente1= server.accept();
		
		
		OutputStream sal= cliente1.getOutputStream();
		DataOutputStream fs = new DataOutputStream(sal);
		fs.writeUTF("ESTO ERAN ORIGINALMENTE MAYUSCULAS");
		InputStream ent = null;
		ent = cliente1.getInputStream();
		DataInputStream dis = new DataInputStream(ent);
		System.out.println("Recibido mensaje del cliente: "+dis.readUTF());
		
		ent.close();
		dis.close();
		sal.close();
		fs.close();
		cliente1.close();
		server.close();
	
	}
}
