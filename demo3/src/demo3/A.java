package demo3;

public class A {

	public A() {
		this(99);// this call  -> Local constructor chaining
		System.out.println("First Consructor");
	}

	public A(int x) {
		this(x, 88);
		System.out.println("Second Consructor");
	}

	public A(int x, int y) {
		super();
		System.out.println("Third Consructor");
	}

}
