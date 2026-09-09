package day8;

public class ColorPoint extends Point {

	private String color;
	
	public ColorPoint() {
		this(0, 0, "BLACK");
	}
	
	public ColorPoint(int x, int y) {
		this(x,y, "BLACK");
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public void setXY(int x, int y) {
		super.move(x, y);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return color+"색의 ("+super.getX()+","+super.getY()+")의 점";
	}
	
	

	
}
