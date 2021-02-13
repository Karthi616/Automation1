package fire;

import java.io.File;

import org.openqa.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sc1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\We\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");

		/*
		 * WebElement
		 * am=driver.findElement(By.xpath("//div[@class='nav-logo-base //nav-sprite']"))
		 * ; JavascriptExecutor js=(JavascriptExecutor)driver; //
		 * js.executeScript("arguments[0].scrollIntoView(true);", am); //
		 * Thread.sleep(5000); //
		 * js.executeScript("arguments[0].scrollIntoView(false);", am);
		 * Thread.sleep(5000); // js.executeScript("window.scrollBy(0,3000)"); //
		 * Thread.sleep(5000);
		 * 
		 */
		// js.executeScript("window.scrollBy(0,-3000)"); // Thread.sleep(5000);

		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File sourcefile1 = ts1.getScreenshotAs(OutputType.FILE);
		File D1 = new File("C:\\Users\\USER\\eclipse-workspace\\We\\Screenshot\\gmail.png");
		FileUtils.copyFile(sourcefile1, D1);
		driver.quit();

//	driver.get("http://www.greenstechnologys.com/");
//	WebElement g=driver.findElement(By.id("client-logo"));
//	JavascriptExecutor js1=(JavascriptExecutor)driver;
		// js.executeScript("arguments[0].scrollIntoView(true);", am);
		// Thread.sleep(5000);
		// js.executeScript("arguments[0].scrollIntoView(false);", am);
//	Thread.sleep(5000);
//js1.executeScript("window.scrollBy(0,3000)");
//Thread.sleep(5000);

		/*
		 * ript("window.scrollBy(0,-3000)");
		 * Thread.sleep(5000)js1.executeScript("window.scrollBy(0,-3000)");
		 * Thread.sleep(5000); TakesScreenshot ts1=(TakesScreenshot)driver; File
		 * sourcgefile=ts1.getScreenshotAs(OutputType.FILE); File D1=new
		 * File("C:\\Users\\USER\\eclipse-workspace\\We\\Screenshot\\greens.png");
		 * FileUtils.copyFile(sourcefile,D); driver.get("https://www.toolsqa.com/");
		 * WebElement sq=driver.findElement(By.xpath("//*[@id=\'MjI0OjM0MA==-1\']"));
		 * JavascriptExecutor js2=(JavascriptExecutor)driver;
		 * //js.executeScript("arguments[0].scrollIntoView(true);", am);
		 * //Thread.sleep(5000);
		 * //js.executeScript("arguments[0].scrollIntoView(false);", am);
		 * Thread.sleep(5000); js2.executeScript("window.scrollBy(0,3000)");
		 * Thread.sleep(5000);
		 * 
		 * js2.executeSc; TakesScreenshot ts2=(TakesScreenshot)driver; File
		 * sourcgefile1=ts1.getScreenshotAs(OutputType.FILE); File D11=new
		 * File("C:\\Users\\USER\\eclipse-workspace\\We\\Screenshot\\greens.png");
		 * FileUtils.copyFile(sourcefile,D); driver.get("https://www.flipkart.com/");
		 * WebElement f=driver.findElement(By.xpath(
		 * "//*[@id=\'container\']/div/div[1]/div[1]/div[2]/div[1]/div/a[1]/img"));
		 * JavascriptExecutor js3=(JavascriptExecutor)driver;
		 * //js.executeScript("arguments[0].scrollIntoView(true);", am);
		 * //Thread.sleep(5000);
		 * //js.executeScript("arguments[0].scrollIntoView(false);", am);
		 * Thread.sleep(5000); js3.executeScript("window.scrollBy(0,3000)");
		 * Thread.sleep(5000);
		 * 
		 * js3.executeScript("window.scrollBy(0,-3000)"); Thread.sleep(5000);
		 * TakesScreenshot lts1=(TakesScreenshot)driver; File
		 * soourcgefile=ts1.getScreenshotAs(OutputType.FILE); File D10=new
		 * File("C:\\Users\\USER\\eclipse-workspace\\We\\Screenshot\\greens.png");
		 * FileUtils.copyFile(sourcefile,D); driver.get("https://www.snapdeal.com/");
		 * WebElement sq2=driver.findElement(By.xpath(
		 * "//*[@id=\'sdHeader\']/div[4]/div[2]/div/div[1]/a[1]/img"));
		 * JavascriptExecutor js22=(JavascriptExecutor)driver;
		 * //js.executeScript("arguments[0].scrollIntoView(true);", am);
		 * //Thread.sleep(5000);
		 * //js.executeScript("arguments[0].scrollIntoView(false);", am);
		 * Thread.sleep(5000); js22.executeScript("window.scrollBy(0,3000)");
		 * Thread.sleep(5000);
		 * 
		 * js22.executeScript("window.scrollBy(0,-3000)"); Thread.sleep(5000);
		 * TakesScreenshot ts26=(TakesScreenshot)driver; File
		 * sourcgefile19=ts1.getScreenshotAs(OutputType.FILE); File D01=new
		 * File("C:\\Users\\USER\\eclipse-workspace\\We\\Screenshot\\greens.png");
		 * FileUtils.copyFile(sourcefile,D);
		 * 
		 */ }

}