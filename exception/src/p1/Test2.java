package p1;

/**
 * WithException -> WithoutHandling
 **/
public class Test2 {

	public static void main(String[] args) {
		
		System.out.println("Before Main");

		f1();

		System.out.println("After Main");
	}

	private static void f1() {
		
		System.out.println("Before f1");

		int a = 10;
		int b = 0;

		int c = a / b;

		System.out.println("c = " + c);
		
		System.out.println("After f1");

	}

}
