package ipChecker;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Utils {

	public static void directoryCreator() {

		File f = new File("C:\\ipchecker");

		if (!f.exists()) {

			f.mkdir();
		}

	}

	public static void writeToLog(String a, String b) {

		try {
			FileWriter myWriter = new FileWriter("C:\\ipchecker\\publicip.log", true);
			BufferedWriter br = new BufferedWriter(myWriter);
			br.write(a + " " + b + "\n");
			br.close();
			myWriter.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

	public static void writeToTxt(String a) {

		try {
			FileWriter myWriter = new FileWriter("C:\\ipchecker\\publicip.txt", false);
			BufferedWriter br = new BufferedWriter(myWriter);
			br.write(a);
			br.close();
			myWriter.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

	public static void txtFileCreator() {

		File f = new File("c:\\ipchecker\\publicip.txt");

		if (!f.exists()) {

			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static boolean txtFileExist() {
		
		directoryCreator();
		File f = new File("c:\\ipchecker\\publicip.txt");

		if (f.exists()) {

			return true;
		}

		return false;

	}

}
