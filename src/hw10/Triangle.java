package hw10;

public class Triangle {
	private Point p1;
	private Point p2;
	private Point p3;

	public Triangle(Point p1, Point p2, Point p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;

	}

	public Point getP1() {
		return p1;
	}

	public Point getP2() {
		return p2;
	}

	public Point getP3() {
		return p3;
	}

	public int getArea(Point p1, Point p2, Point p3) {
		int base = (p2.getX() + p3.getX());
		int hight = (p2.getX() + p1.getY());
		int area = (hight * base) / 2;
		return area;
	}

	@Override
	public String toString() {
		return "Triangle [p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + "]";
	}

}
