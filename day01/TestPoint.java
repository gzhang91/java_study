public class TestPoint {
	public static void main(String[] args) {
		Point p1 = new Point();
		p1.setPoint(5, 6, 7);
		Point p2 = new Point();
		p2.setPoint(0, 0, 0);

		System.out.println("distance= " + p1.getDistance(p2));
	}
}

class Point {
	private int x = 0;
	private int y = 0;
	private int z = 0;

	void setPoint(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	double getDistance(Point p) {
		return (x - p.x) * (x - p.x) + (y - p.y) * (y - p.y) + (z - p.z) * (z - p.z);
	} 
}