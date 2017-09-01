package zikzakjack.package2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Package2Class1 {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	private void package2Class1PrivateMethod() {
		logger.trace("package2Class1PrivateMethod :: trace message");
		logger.debug("package2Class1PrivateMethod :: debug message");
		logger.info("package2Class1PrivateMethod :: info message");
		logger.warn("package2Class1PrivateMethod :: warn message");
		logger.error("package2Class1PrivateMethod :: error message");
	}

	private void package2Class1DefaultMethod() {
		logger.trace("package2Class1DefaultMethod :: trace message");
		logger.debug("package2Class1DefaultMethod :: debug message");
		logger.info("package2Class1DefaultMethod :: info message");
		logger.warn("package2Class1DefaultMethod :: warn message");
		logger.error("package2Class1DefaultMethod :: error message");
	}

	private void package2Class1ProtectedMethod() {
		logger.trace("package2Class1ProtectedMethod :: trace message");
		logger.debug("package2Class1ProtectedMethod :: debug message");
		logger.info("package2Class1ProtectedMethod :: info message");
		logger.warn("package2Class1ProtectedMethod :: warn message");
		logger.error("package2Class1ProtectedMethod :: error message");
	}

	private void package2Class1PublicMethod() {
		logger.trace("package2Class1PublicMethod :: trace message");
		logger.debug("package2Class1PublicMethod :: debug message");
		logger.info("package2Class1PublicMethod :: info message");
		logger.warn("package2Class1PublicMethod :: warn message");
		logger.error("package2Class1PublicMethod :: error message");
	}

}
