package parameterized;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class MumbaiIndians_Test {

	@Test

	public void mi() {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	String	url=System.getProperty("");
	driver.get(url);
		//driver.quit();
	}

}
