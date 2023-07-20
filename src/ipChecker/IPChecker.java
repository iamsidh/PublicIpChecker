package ipChecker;

public class IPChecker {
	
	public static String getPublicIP() {
		
		String publicIP=null;
		
		try (java.util.Scanner s = new java.util.Scanner(new java.net.URL("https://api.ipify.org").openStream(), "UTF-8").useDelimiter("\\A")) {
		    publicIP=s.next();
		    s.close();
		} catch (java.io.IOException e) {
		    e.printStackTrace();
		}
		
		return publicIP;
		
		
	}

}
