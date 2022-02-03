package Main;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class main {
	public static void main(String[] args) throws UnknownHostException, IOException {
		String domain = "lovecein4858.iptime.org";
		Socket c_socket = new Socket(domain,888);
		InputStream input_data = c_socket.getInputStream();
		byte[] receivreBuffer = new byte[100];
		input_data.read(receivreBuffer);
		c_socket.close();
	}
}
