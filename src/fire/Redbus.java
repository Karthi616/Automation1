package fire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\We\\src\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.redbus.in/");
			WebElement from=driver.findElement(By.xpath("//input[@id='src']"));
			from.sendKeys("Chennai");
			WebElement to=driver.findElement(By.xpath("//input[@id='dest']"));
			to.sendKeys("Sivakasi");
			Thread.sleep(1000);
			WebElement date=driver.findElement(By.xpath("//*[@id=\'\search\']/div/div[3]/div/label"));
			//Select s=new Select(date);
			//s.selectByValue("16");
			//date.sendKeys("16-May-2021");
			Thread.sleep(1000);
			//WebElement day=driver.findElement(By.xpath("(//td[@class='wd day'])[1]"));
			//day.sendKeys("16");
			WebElement search=driver.findElement(By.xpath("//*[@id=\'search_btn\']"));
			search.click();
			Thread.sleep(1000);
			driver.quit();
}
}