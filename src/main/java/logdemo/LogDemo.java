package logdemo;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class LogDemo {
	public static Logger logger=Logger.getLogger(LogDemo.class);
	@Test
	public static void demo() {
		logger.info("This is info");
		logger.debug("This is debug");
		logger.warn("This is warning");
		logger.error("This is error");
	}

}
