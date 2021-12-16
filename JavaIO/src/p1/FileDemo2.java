package p1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {

		File file = new File("D:\\output.txt");

		String line5 = "This is Fifth Line\n";

		FileWriter writer = new FileWriter(file, true);

		writer.write(line5);

		System.out.println("Done");

		writer.close();

	}

}
