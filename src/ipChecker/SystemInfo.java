package ipChecker;

import java.net.InetAddress;

public class SystemInfo {

    public static String getUsername() {
        String username = System.getProperty("user.name");

        if (username.endsWith("$")) {
            return "Sidh";
        } else {
            return username;
        }
    }

    public static String getMachineName() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (Exception e) {
            return "Unknown-Host";
        }
    }

    public static String getOsName() {
        return System.getProperty("os.name");
    }
}
