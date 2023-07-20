package ipChecker;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TelegramAPIBot {

	public static void sendTelegram(String publicip) throws IOException {

		String command = String.format(
				"curl -X POST https://api.telegram.org/bot%s/sendMessage?chat_id=496409188&text=New_Public_IP=%s",getToken(),
				publicip);
		Process process = Runtime.getRuntime().exec(command);
		process.getInputStream();
	}

	private static String getToken() {

		 String token = null;

		File file = new File("C:\\Sidh\\ipchecker\\token.txt");

		if (!file.exists()) {

			System.out.println("Please provide token");
			return null;

		} else {

			try {
				Scanner sc = new Scanner(file);
				while (sc.hasNext()) {

					token = sc.next();
				}
				sc.close();
				return token;
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}