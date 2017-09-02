package zikzakjack.package1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Package1Class1 {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public void package1Class1PublicMethod() {
		logger.trace("package1Class1PublicMethod :: trace message");
		logger.debug("package1Class1PublicMethod :: debug message");
		logger.info("package1Class1PublicMethod :: info message");
		logger.warn("package1Class1PublicMethod :: warn message");
		logger.error("package1Class1PublicMethod :: error message");
	}

}
