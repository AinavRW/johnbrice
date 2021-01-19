package exercise9;

public class Rectangle extends Shape {

	private int highet;
	private int width;

	public Rectangle(int width, int highet, int x, int y) {
		super(x, y);
		this.highet = highet;
		this.width = width;
	}

	public int getHighet() {
		return highet;
	}

	public void setHighet(int highet) {
		this.highet = highet;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
