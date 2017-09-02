package zikzakjack.package2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Package2Class1 {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public void package2Class1PublicMethod() {
		logger.trace("package2Class1PublicMethod :: trace message");
		logger.debug("package2Class1PublicMethod :: debug message");
		logger.info("package2Class1PublicMethod :: info message");
		logger.warn("package2Class1PublicMethod :: warn message");
		logger.error("package2Class1PublicMethod :: error message");
	}

}
