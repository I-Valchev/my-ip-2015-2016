package commandshandling;

public class SumCommandHandler implements CommandHandler{	
	@Override
	public int execute(String[] args) {
		// TODO Auto-generated method stub
		return Integer.valueOf(args[1]) + Integer.valueOf(args[2]);
	}

}
