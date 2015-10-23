package commandshandling;

import java.util.Scanner;

public class CommandsHandler {
	public static void main(String [] args){
//		input:
		System.out.print("Enter command: ");
		final Scanner in = new Scanner(System.in);
		final String command = in.next();
		
//		processing:
		CommandHandler handler = parse(command);
		final int result = handler.execute();
		
//		output
		System.out.println("Result: " + result);
		in.close();
	}

	/**
	 * @param command something like: sum:1:2 or you can use json/xml
	 * @return
	 */
	private static CommandHandler parse(String command) {
		// TODO Auto-generated method stub
		final String[] split = command.split(":");
		if("sum".equals(split[0])){ //avoid NullPointerException
			return new SumCommandHandler(split);
		}
		throw new IllegalArgumentException("Unknown command: " + command);
	}
	
	public int run(){
		return 0;
	}
}
