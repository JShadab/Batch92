package p1;

public class Lion {

	public Lion() {
		
		this("Leo"); //this call
		
		System.out.println("Default Constructor");

	}

	public Lion(String name) {
		System.out.println("Parameterized Constructor");
	}

	public static void main(String[] args) {

		Lion lion1 = new Lion();
		// Lion lion2 = new Lion("Leo");
	}

}
