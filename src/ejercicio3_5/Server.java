package ejercicio3_5;

import java.awt.List;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import utilidad.Input;

public class Server {

	public static void main(String[] args) throws IOException {
		Input input = new Input();
		int puerto = 6000;
		int nclientes = 0;
		int max=3;
		
		System.out.println("Cantidad de cilentes a aceptar: ");
		max = input.tryIntegerPositivo();
		
		
		ArrayList<Socket>clientes = new ArrayList();
		ServerSocket server = new ServerSocket(puerto);
		System.out.println("Escuchando en puerto: "+server.getLocalPort()+" ...");
		
		do {
			nclientes++;
			Socket cliente=null;
			System.out.println("Esperando clientes...");
			cliente=server.accept();
			OutputStream sal= cliente.getOutputStream();
			DataOutputStream fs = new DataOutputStream(sal);
			fs.writeUTF("cliente numero "+nclientes);
			sal.close();
			fs.close();
			cliente.close();
		
		}while(nclientes<max);
		
		server.close();
	
	}
}
