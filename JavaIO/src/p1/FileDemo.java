package p1;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {

		File file = new File("D:\\shad.txt");

		// Tests whether the file or directory denoted by this abstract pathname exists.
	//	System.out.println(file.exists()); //

		// How to create a file on Hard disk
		file.createNewFile();

		//System.out.println(file.exists()); // true

		File dir = new File("D:\\myFiles");
		// dir.mkdir();

		if (dir.isDirectory()) {
			String[] fileNames = dir.list();
			//File[] files = dir.listFiles();

			for (int i = 0; i < fileNames.length; i++) {
				String fn = fileNames[i];
				System.out.println(fn);

			}
		}
		
		file.delete();
		dir.delete();

	}

}
