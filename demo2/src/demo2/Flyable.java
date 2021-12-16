package demo2;

@FunctionalInterface
public interface Flyable {

	void fly();

//	void foo();

	default public void greet() {

		System.out.println("Hello Functional programming");
	}

	static public void sayBye() {

		System.out.println("Likal lo, Bahut tezi se....");
	}

}
