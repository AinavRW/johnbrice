package hw10;


public class Canvas {
	private Object shapes[];

	public Canvas() {
		this.shapes = new Object[10];

	}


	public Object[] getShapes() {
		return shapes;
	}

	public void addShape(Object object) {
		int idx = getFirstEmptyIndex(shapes);
		if (idx < shapes.length) {
			shapes[idx] = object;
			System.out.println("Shape painted on the canvas, go artist!");
		} else {
			System.out.println("There's no more room, Jackson Pollack");
		}
	}

	private int getFirstEmptyIndex(Object[] shapes) {
		int i = 0;
		for (; i < shapes.length && shapes[i] != null; i++) {
		}
		return i;
	}
}
