package cucumber;
import org.openqa.selenium.WebDriver;

import io.cucumber.core.cli.Main;

public class RoadRunner {

//	public static void main(String[] args) {
//		Main.main(new String[]{"-g","cucumber.framework.runner.hrms.sceneoutlinefix",
//				"src/test/resources/hrms/sceneoutlinefix/0004dashboard.feature",
//					"src/test/resources/hrms/sceneoutlinefix/0001logininvalid.feature",
//					"src/test/resources/hrms/sceneoutlinefix/0002loginempty.feature",
//					"src/test/resources/hrms/sceneoutlinefix/0003loginvalid.feature"});
//	}
	public static WebDriver driver;
	public static void main(String[] args) {
		try {
			Main.main(new String[]
			{
				"-g","cucumber.framework.runner.hrms.sceneoutlinefix",
				"classpath:hrms/sceneoutlinefix",//src/test/resources/hrms/sceneoutlinefix
				"-p","pretty",
				"-p","html:target/hrms/htmlreport/LoginRunnerOutline.html",
				"-p","json:target/hrms/jsonreport/LoginRunnerOutline.json",
				"-p","junit:target/hrms/junitreport/LoginRunnerOutline.xml",
				"-m"
			});
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Main Class Execption : "+e);
		}
	}
}