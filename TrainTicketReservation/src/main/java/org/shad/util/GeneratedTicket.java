package org.shad.util;

import java.io.File;

import java.io.FileWriter;

public class GeneratedTicket {

	public static void printTicket() throws Exception {

		String path = "D:\\tickets\\genTicket1.txt";

		File file = new File(path);

		FileWriter fw = new FileWriter(file);

		String l1 = "PNR           : --------------------\n";

		String l2 = "Train no      :---------------------\n";

		String l3 = "Train Name    :---------------------\n";

		String l4 = "From          :---------------------\n";

		String l5 = "To            :---------------------\n";

		String l6 = "Travel Date   :---------------------\n\n\n\n";

		String l7 = "Passengers:\n";

		String l8 = "Name  Age       Gender    Fare     \n\n\n\n";

		String l9 = "Total Price:---------------------";

		fw.write(l1);

		fw.write(l2);

		fw.write(l3);

		fw.write(l4);

		fw.write(l5);

		fw.write(l6);

		fw.write(l7);

		fw.write(l8);

		fw.write(l9);

		fw.close();
	}
}
