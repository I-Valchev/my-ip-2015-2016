package commandshandling;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CommandsHandler {
	private static Map<String, CommandHandler> HANDLERS = new HashMap<String, CommandHandler>();
	
	public static void main(String [] args){
		HANDLERS.put("sum", new SumCommandHandler());
//		input:
		System.out.print("Enter command: ");
		final Scanner in = new Scanner(System.in);
		final String command = in.next();
		
//		processing:
		CommandHandler handler = parse(command);
		final int result = handler.execute(command.split(":"));
		
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
		final CommandHandler result = HANDLERS.get(split[0]);
		
		if(result == null){
			throw new IllegalArgumentException("Unknown command: " + command);
		}
		
		return result;
	}
	
	public int run(){
		return 0;
	}
}
