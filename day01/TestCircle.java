public class TestCircle {
	public static void main(String[] args) {
		Point p1 = new Point(3, 5);
		Point p2 = new Point(0, 0);

		Circle c1 = new Circle();
		c1.setOrigin(new Point(3, 6));
		c1.setRadis(15);

		System.out.println("p1 is in circle or not ? " + c1.contains(p1));
		System.out.println("p2 is in circle or not ? " + c1.contains(p2));
	}
}

class Circle {
	private Point origin;
	private double radis;

	public void setOrigin(Point p) {
		origin = p;
	}

	public void setRadis(double r) {
		radis = r;
	}

	public double getCircle() {
		return radis * radis * Math.PI;
	}

	public boolean contains(Point p) {
		return origin.getDistance(p) <= radis;
	}
}

class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double getDistance(Point p) {
		return Math.sqrt((double)(x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
	}
}