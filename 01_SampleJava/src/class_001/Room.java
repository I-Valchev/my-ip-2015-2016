package class_001;

public class Room {
	private int width;
	private int height;
//	generated with Alt+Shift+S R to generate getters/setters
	public int getWidth() {
//	check value of width - 0 or positive only
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int calculateArea(){
		return height*width;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == this){
			return true;
		}
		if(obj instanceof Room){
			final Room room2 = (Room) obj;
			return room2.getHeight() == height && room2.getWidth() == width;
		}
		return false;
	}
}
