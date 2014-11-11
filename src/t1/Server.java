package t1;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws Exception{
		ServerSocket ssoc = new ServerSocket(8080);
		Socket soc = ssoc.accept();
		OutputStream os = soc.getOutputStream();
		String str = "hello world";
		os.write(str.getBytes());
	}
}
