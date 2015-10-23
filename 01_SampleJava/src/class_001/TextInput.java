package class_001;

import java.util.Scanner;

public class TextInput {
	public static void main(String [] args){
		System.out.print("Enter your name: ");
//		standard input from Scanner(System.in)
		final Scanner in = new Scanner(System.in);
//		get the name (read from System.in)
		final String name = in.next();
//		output the name
		System.out.println("Hello, " + name);
//		ObjectInputStream - reads stream as objects
		
	}
}
