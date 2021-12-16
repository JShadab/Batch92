package p1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileDemo {

	public static void main(String[] args) throws IOException {

		File file = new File("D:\\output.txt");

		FileReader reader = new FileReader(file);
		int x = -1;

		while ((x = reader.read()) != -1) {

			char ch = (char) x;
			System.out.print(ch);
		}

		reader.close();

	}

}
