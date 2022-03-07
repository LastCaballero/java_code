import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class NetcatSocket {

	FileInputStream reader = null;
	Socket netcat = null;
	OutputStream streamToNetcat = null;
	int c;
	public NetcatSocket(String filename, String host, int port) throws IOException {
		netcat = new Socket( host, port );
		streamToNetcat = netcat.getOutputStream();
		reader = new FileInputStream( filename );
	}

	public void sendFile() throws IOException{
		while ((c= reader.read()) != -1){
			streamToNetcat.write(c);
		}
		streamToNetcat.close();
		netcat.close();
		reader.close();
	}

}
