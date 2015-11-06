import java.io.PrintStream;

public class ClientSocketExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final PrintStream out = System.out;
		out.println("GET / HTTP/1.1");
		out.println("Host:www.example.com");
		out.println("Connection:close");
		out.println("");
	}

}
