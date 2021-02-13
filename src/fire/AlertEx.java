package fire;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\We\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement s = driver.findElement(By.xpath("//*[@id=\'OKTab\']/button"));
		s.click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(1000);
		a.accept();
		WebElement s1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		s1.click();
		WebElement s3 = driver.findElement(By.xpath("//*[@id=\'CancelTab\']/button"));
		s3.click();
		Alert a1 = driver.switchTo().alert();
		// a1.accept();
		Thread.sleep(1000);
		a1.dismiss();
		// Thread.sleep(1000);
		WebElement s2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		s2.click();

		WebElement s4 = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		s4.click();
		Alert a2 = driver.switchTo().alert();
		// a2.clear();
		Thread.sleep(1000);
		a2.sendKeys("kai");

		a2.accept();
		Thread.sleep(5000);
		driver.quit();

	}

}
