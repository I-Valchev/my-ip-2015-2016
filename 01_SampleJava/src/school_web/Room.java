package school_web;

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
}
