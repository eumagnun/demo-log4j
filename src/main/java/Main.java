import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	public static final Logger logger = LogManager.getLogger(Main.class);

	public static void main(String[] args) {

		System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true");

		String username = "${java:version}";
		logger.error("Ol�! " + username);

	}
}
