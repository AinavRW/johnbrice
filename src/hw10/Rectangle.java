package hw10;

public class Rectangle {

	private Point lowerRight;
	private Point lowerLeft;

	public Rectangle(Point lowerRight, Point lowerLeft) {

		this.lowerRight = lowerRight;
		this.lowerLeft = lowerLeft;
	}

	public Point getLowerRight() {
		return lowerRight;
	}

	public Point getLowerLeft() {
		return lowerLeft;
	}

	public int getArea(Point lowerRight, Point lowerLeft) {
		int length = (lowerRight.getY() + lowerLeft.getY());
		int width = (lowerRight.getX() + lowerLeft.getX());
		int area = length * width;
		return area;

	}

}
