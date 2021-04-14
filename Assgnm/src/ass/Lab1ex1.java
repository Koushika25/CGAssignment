package ass;

public class Lab1ex1 {
	int sum = 0;

	void Lab1ex1(int n) {
		for (int i = 1; i <= n; i++) {
			sum += i * i * i;

		}
		System.out.println("Sum of the cubes is"+" " + sum);
	}

	public static void main(String[] args) {
		int n = 3;
		Lab1ex1 s = new Lab1ex1();
		s.Lab1ex1(n);

	}

}


