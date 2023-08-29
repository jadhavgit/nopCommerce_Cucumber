package TestNGPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerDemo {

	public static void main(String[] args) {
		
		Logger log=LogManager.getLogger("LoggerDemo");
		System.out.println("This si Logger demo");
		//if you want to log any infomation or message then you can used
		log.info("for info only");
		log.debug("for debug");
		log.error("for error message");
		log.warn("Waring message");

		

	}

}
