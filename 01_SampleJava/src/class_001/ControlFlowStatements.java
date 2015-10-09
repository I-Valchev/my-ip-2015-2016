package class_001;

public class ControlFlowStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ifExample();
		forExample();
	}

	private static void forExample() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

	private static void ifExample() {
		if(true){
			System.out.println("called");
		}
		
		if(1>2){
			System.out.println("not called");
		}else{
			System.out.println("called");
		}
	}
}
