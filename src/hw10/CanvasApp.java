package hw10;

public class CanvasApp {
	public static void main(String[] args) {
		Canvas myCanvas = new Canvas();
		
		Point p1 = new Point(10,5);
		Point p2 = new Point(21,10);
		Point p3 = new Point(35,3);
		Point p4 = new Point(13,8);
		Point p5 = new Point(44,19);
		
		
		
		Triangle tri = new Triangle(p1, p2, p3);
		Rectangle rec = new Rectangle(p4, p5);
		
		myCanvas.addShape(tri);
		myCanvas.addShape(rec);
		
		System.out.println(myCanvas.getShapes());
		
		System.out.println(tri.getArea(p1, p2, p3));
	}

}
