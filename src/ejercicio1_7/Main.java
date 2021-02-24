package ejercicio1_7;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {

	public static void main(String[] args) throws IOException {
		File directorio=new File(".\\bin");
		ProcessBuilder pb = new ProcessBuilder("java","ejercicio5.Main");
		pb.directory(directorio);
		
		File fBat=new File("entrada.bat");
		File fOut=new File("salida.txt");
		File fErr=new File("error.txt");
		
		pb.redirectInput(fBat);
		pb.redirectOutput(fOut);
		pb.redirectError(fErr);
		Process p=pb.start();
		
		int exitVal;
		try {
			exitVal=p.waitFor();
			System.out.println("Valor de salida: "+exitVal);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
