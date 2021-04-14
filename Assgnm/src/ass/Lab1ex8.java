package ass;

public class Lab1ex8 {
	public boolean checknumber(int n) {
		while (n % 2 == 0) {
			n = n / 2;
		}
		if (n == 1) {
			return true;
		} else {

		}
		return false;

	}

	public static void main(String[] args) {
		int n = 8;
		Lab1ex8 pf = new Lab1ex8();
		System.out.println(pf.checknumber(n));

	}

}

