package zikzakjack.package1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Package1Class1 {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	private void package1Class1PrivateMethod() {
		logger.trace("package1Class1PrivateMethod :: trace message");
		logger.debug("package1Class1PrivateMethod :: debug message");
		logger.info("package1Class1PrivateMethod :: info message");
		logger.warn("package1Class1PrivateMethod :: warn message");
		logger.error("package1Class1PrivateMethod :: error message");
	}

	private void package1Class1DefaultMethod() {
		logger.trace("package1Class1DefaultMethod :: trace message");
		logger.debug("package1Class1DefaultMethod :: debug message");
		logger.info("package1Class1DefaultMethod :: info message");
		logger.warn("package1Class1DefaultMethod :: warn message");
		logger.error("package1Class1DefaultMethod :: error message");
	}

	private void package1Class1ProtectedMethod() {
		logger.trace("package1Class1ProtectedMethod :: trace message");
		logger.debug("package1Class1ProtectedMethod :: debug message");
		logger.info("package1Class1ProtectedMethod :: info message");
		logger.warn("package1Class1ProtectedMethod :: warn message");
		logger.error("package1Class1ProtectedMethod :: error message");
	}

	private void package1Class1PublicMethod() {
		logger.trace("package1Class1PublicMethod :: trace message");
		logger.debug("package1Class1PublicMethod :: debug message");
		logger.info("package1Class1PublicMethod :: info message");
		logger.warn("package1Class1PublicMethod :: warn message");
		logger.error("package1Class1PublicMethod :: error message");
		logger.error("{}","package1Class1PublicMethod :: error message");
	}

}
