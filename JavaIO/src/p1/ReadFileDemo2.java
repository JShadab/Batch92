package p1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileDemo2 {

	public static void main(String[] args) throws IOException {

		File file = new File("D:\\output.txt");

		FileReader reader = new FileReader(file);

		BufferedReader br = new BufferedReader(reader);
		
		String line = null;

		while ((line = br.readLine()) != null) {

			System.out.println(line);
		}

		br.close();

	}

}
