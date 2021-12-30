package p1;

public class Test {

	public static void main(String[] args) {

		Lion lion1 = new Lion();
		Lion lion2 = new Lion();

		King king1 = King.getKing();
		King king2 = King.getKing();
		
		//King king3= new King();

		System.out.println(king1.hashCode());
		System.out.println(king2.hashCode());
	//	System.out.println(king3.hashCode());
		
		System.out.println("================================");
		
		System.out.println(lion1.hashCode());
		System.out.println(lion2.hashCode());

	}

}
