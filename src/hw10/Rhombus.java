package hw10;

public class Rhombus {
	private Point topPoint;
	private Point middlePointLeft;
	private Point bottomPoint;
	private Point middlePointRight;

	public Rhombus(Point topPoint, Point middlePointLeft, Point bottomPoint, Point middlePointRight) {
		super();
		this.topPoint = topPoint;
		this.middlePointLeft = middlePointLeft;
		this.bottomPoint = bottomPoint;
		this.middlePointRight = middlePointRight;
	}

	public Point getTopPoint() {
		return topPoint;
	}

	public Point getMiddlePointLeft() {
		return middlePointLeft;
	}

	public Point getBottomPoint() {
		return bottomPoint;
	}

	public Point getMiddlePointRight() {
		return middlePointRight;
	}

	public int getArea(Point topPoint, Point middlePointLeft, Point bottomPoint, Point middlePointRight) {
		int hight = (topPoint.getY() + bottomPoint.getY());
		int width = (middlePointLeft.getX() + middlePointRight.getX());
		int area = (hight * width);
		return area;

	}

	
}
