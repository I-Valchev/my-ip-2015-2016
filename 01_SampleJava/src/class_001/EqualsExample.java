package class_001;

public class EqualsExample {
	public static void main(String[] args) {
		final Room room1 = new Room();
		final Room room2 = new Room();
		
		setDimensions(room1);
		setDimensions(room2);
		
		System.out.println("room1 == room2: " + (room1==room2));
		
		System.out.println("room1.equals(room2): " + room1.equals(room2));
		
		
	}

	private static void setDimensions(Room room) {
		room.setHeight(5);
		room.setWidth(7);
	}
}
