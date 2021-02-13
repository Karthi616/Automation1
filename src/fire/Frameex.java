package fire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\We\\src\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		driver.switchTo().frame("SingleFrame");
		WebElement text=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		text.sendKeys("Karthi");
	}
}
