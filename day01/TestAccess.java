import com.test.*;

public class TestAccess {
	public static void main(String[] args) {
		Ball ball = new BasketBall("Nike", COLOR.YELLOW, 32);
		Boy boy = new Boy();

		boy.playBall(ball);

		System.out.println(ball.name);

		TestPackage tp = new TestPackage();
		System.out.println(tp.prvVar + tp.dfVal + tp.prVal + tp.puVal);
	}

}

enum COLOR { 
	YELLOW,
	RED,
	WHITE,
	BLACK,
}

class Ball {
	String name;
	COLOR color;

	public Ball(String n, COLOR c) {
		name = n;
		color = c;
	}
}

class BasketBall extends Ball {
	int size;

	public BasketBall(String n, COLOR c, int s) {
		super(n, c);
		size = s;
	}

	void info() {
		System.out.println("name: " + name + ", color: " + color + ", size: " + size);
	}
}

class Boy {
	void playBall(Ball ball) {
		System.out.println("Boy play ball, " + ball.name + ", " + ball.color);
	}
}