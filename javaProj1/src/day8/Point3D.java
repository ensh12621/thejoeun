package day8;

public class Point3D extends Point {

	private int z;

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	@Override
	public String toString() {
		return "(" + super.getX() + ", " + super.getY() + ", " + this.z + ")의 점";
	}

	public void moveUp() {
		this.z++;
	}
	
	public void moveDown() {
		this.z--;
	}
	
	public void move(int x, int y, int z) {
		super.move(x, y);
		this.z= z;
	}

}
