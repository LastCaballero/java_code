import java.io.IOException;

public class Start{

	public static void main(String args[]){
		String filename = args[0];
		String host = args[1];
		Integer port = Integer.parseInt(args[2]);
		try {
			NetcatSocket nc = new NetcatSocket( filename, host, port );
			nc.sendFile();
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}

}
