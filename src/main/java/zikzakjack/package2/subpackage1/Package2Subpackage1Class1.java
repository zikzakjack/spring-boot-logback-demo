package zikzakjack.package2.subpackage1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Package2Subpackage1Class1 {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public void package2Subpackage1Class1PublicMethod() {
		logger.trace("package2Subpackage1Class1PublicMethod :: trace message");
		logger.debug("package2Subpackage1Class1PublicMethod :: debug message");
		logger.info("package2Subpackage1Class1PublicMethod :: info message");
		logger.warn("package2Subpackage1Class1PublicMethod :: warn message");
		logger.error("package2Subpackage1Class1PublicMethod :: error message");
	}

}
