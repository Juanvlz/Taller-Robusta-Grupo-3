package Package;

import java.io.*; 
import java.net.*;

public class Client {
	public static void main(String[] args) {
		Socket elSocket;
		String texto="";
		String result=""; // Se utiliza el servidor para procesar texto
		try { // Se lee un texto desde el teclado
			texto = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		} catch (IOException e1) {System.out.println("ERROR con teclado");} catch (Exception ex) {
			// TODO: handle exception
		}
		try{ // Se crea el socket y se establece la conexión
			elSocket = new Socket(InetAddress.getLocalHost(), 5000);
			DataOutputStream dos = new DataOutputStream(elSocket.getOutputStream());
			dos.writeUTF(texto); // Se envía el texto al servidor
			DataInputStream dis = new DataInputStream(elSocket.getInputStream());
			result=dis.readUTF(); // Se lee el resultado retornado por el servidor
			elSocket.close(); // Se cierra el socket
			// Se imprime el texto antes y después de la transformación
			System.out.println("Texto: "+ texto+" Result: "+result);
		} catch (IOException e) {System.out.println("ERROR con socket");} catch (Exception ex) {
			// TODO: handle exception
		}
	}
}
