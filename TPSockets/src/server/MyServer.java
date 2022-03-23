package server;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class MyServer {

	public static void main(String[] args) throws Exception {
	ServerSocket ss=new ServerSocket(1234);
	System.out.println("j' attend la connexion...");
	Socket s=ss.accept();
	System.out.println("Connexion d'un client  "+s.getRemoteSocketAddress());

	InputStream is=s.getInputStream();
	OutputStream os=s.getOutputStream();
	System.out.println("j' attend que le client envoie un octet...");
	int nb=is.read();
	System.out.println("j' ai recu un nombre "+nb);
	int res=nb*5;
	System.out.println("j'envoie la reponse "+res);
	os.write(res);
	s.close();
	}

}
