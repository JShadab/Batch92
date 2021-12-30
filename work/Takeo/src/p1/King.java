package p1;

public class King {

	private static King king;

	private King() {

	}

	public static King getKing() {

		if (king == null) {
			king = new King();
		}

		return king;
	}

}
