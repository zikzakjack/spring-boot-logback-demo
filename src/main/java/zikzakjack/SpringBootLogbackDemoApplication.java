package zikzakjack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zikzakjack.package1.Package1Class1;
import zikzakjack.package1.subpackage1.Package1Subpackage1Class1;
import zikzakjack.package2.Package2Class1;
import zikzakjack.package2.subpackage1.Package2Subpackage1Class1;

@SpringBootApplication
public class SpringBootLogbackDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLogbackDemoApplication.class, args);
		
		Package1Class1 package1Class1 = new Package1Class1();
		package1Class1.package1Class1PublicMethod();
		
		Package1Subpackage1Class1 package1Subpackage1Class1 = new Package1Subpackage1Class1();
		package1Subpackage1Class1.package1Subpackage1Class1PublicMethod();
		
		Package2Class1 package2Class1 = new Package2Class1();
		package2Class1.package2Class1PublicMethod();
		
		Package2Subpackage1Class1 package2Subpackage1Class1 = new Package2Subpackage1Class1();
		package2Subpackage1Class1.package2Subpackage1Class1PublicMethod();
		
	}
}
