package p2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {

	public static void main(String[] args) throws IOException {

		f1();

	}

	private static void f1() throws IOException {
		f2();

	}

	private static void f2() throws IOException {
		// int a = 10 / 0; // Arithmetic -> 100 surety //Unchecked
		// System.out.println(a);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		br.readLine(); // IOException -> 0.00000000000001 % surety //checked

	}

}
