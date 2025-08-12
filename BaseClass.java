package base;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public static EdgeDriver driver;

	@BeforeMethod
	public void preConditions() {
		driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void postConditions() {
		driver.close();

	}

}
