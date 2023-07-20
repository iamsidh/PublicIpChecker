package ipChecker;

//import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
//import java.util.Scanner;

public class TelegramAPIBot {

	public static void sendTelegram(String publicip) throws IOException {

		String command = String.format(
				"curl -X POST https://api.telegram.org/bot%s/sendMessage?chat_id=%s&text=New_Public_IP=%s",getCredentials("token"),getCredentials("userid"),
				IPChecker.getPublicIP());
		Process process = Runtime.getRuntime().exec(command);
		process.getInputStream();
	}

	/*private static String getToken() {

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
	}*/
	
	private static String getCredentials(String a) {
		
		Properties prop = new Properties();


        FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:\\Sidh\\ipchecker\\credentials.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

        try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
        return prop.getProperty(a);
	}

}