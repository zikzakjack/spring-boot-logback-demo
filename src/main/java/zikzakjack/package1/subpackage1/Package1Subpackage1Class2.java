package zikzakjack.package1.subpackage1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Package1Subpackage1Class2 {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public void package1Subpackage1Class2PublicMethod() {
		logger.trace("package1Subpackage1Class2PublicMethod :: trace message");
		logger.debug("package1Subpackage1Class2PublicMethod :: debug message");
		logger.info("package1Subpackage1Class2PublicMethod :: info message");
		logger.warn("package1Subpackage1Class2PublicMethod :: warn message");
		logger.error("package1Subpackage1Class2PublicMethod :: error message");
	}

}
