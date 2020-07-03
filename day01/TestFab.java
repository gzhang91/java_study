/*
	斐波那契数列实现
 */
public class TestFab {
	public static void main(String[] args) {
		TestFab testFab = new TestFab();
		System.out.println("result=" + testFab.fabNoRecurs(5));
	}

	int fab(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}

		System.out.println(n);
		return fab(n - 1) + fab(n - 2);
	}

	int fabNoRecurs(int n) {
		int first = 1;
		int second = 1;
		int sum = 0;

		for (int i = 2; i <= n; i++) {
			sum = first + second;
			first = second;
			second = sum;
		}

		return sum;
	}
}