package common;

import org.apache.log4j.Logger;

public class LogClient {
	
	public static Logger logClient() {
		final Logger logger=Logger.getLogger(LogClient.class);
		return logger;
	}

}
