package school_web;

public class ClassExample {
	public static void main(String[] args) {
		final Room room = new Room();
		
		room.setHeight(20);
		
//		get the value of the object
		final int height = room.getHeight();
		
//		print the value
		System.out.println(height);
	}
}
