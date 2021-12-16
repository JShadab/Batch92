package p1;

/**
 * WithoutException -> WithHandling
 **/
public class Test3 {

	public static void main(String[] args) {

		System.out.println("Before Main");

		f1();

		System.out.println("After Main");
	}

	private static void f1() {

		System.out.println("Before f1");

		int a = 10;
		int b = 3;

		try {
			System.out.println("TRY BLOCK");
			int c = a / b;

			System.out.println("c = " + c);

		} catch (Exception e) {
			System.out.println("CATCH BLOCK");

		} finally {
			System.out.println("FINALLY BLOCK");
		}
		System.out.println("After f1");
	}

}
