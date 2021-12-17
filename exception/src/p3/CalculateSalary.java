package p3;

public class CalculateSalary {

	public static void main(String[] args) {

		double totalSalary = calcSal(-100);

		System.out.println(totalSalary);
	}

	private static double calcSal(int basic) {

		// forgiveness
//		if (basic <= 0) {
//
//			String msg = "Bhai Sahab, basic salary cannot be ZERO or NEGATIVE";
//
//			System.out.println(msg);
//
//			return 0;
//		}

		// Punishment
		if (basic <= 0) {

			String msg = "Sale, basic salary cannot be ZERO or NEGATIVE";
			throw new MyException(msg);
		}

		double total = 2 * basic + 50;

		return total;
	}

}
