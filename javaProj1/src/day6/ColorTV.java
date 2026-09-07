package day6;

public class ColorTV extends TV {

	private int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;

	}

	public void printProperty() {
		System.out.println(super.getSize() + "인치 " + this.color + "컬러");
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}
	
	
}
