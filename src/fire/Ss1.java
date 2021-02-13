package fire;

import java.io.File;

import org.openqa.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ss1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// input[@name='identifier'
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\We\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File sourcefile1 = ts1.getScreenshotAs(OutputType.FILE);
		File D1 = new File("C:\\Users\\USER\\eclipse-workspace\\We\\Screenshot\\amazon1.png");
		FileUtils.copyFile(sourcefile1, D1);
		// Thread.sleep(2000);
		// driver.quit();

	}

}
