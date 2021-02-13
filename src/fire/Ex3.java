package fire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\We\\src\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/contact.php");
	WebElement a1=driver.findElement(By.id("InputName"));
	a1.sendKeys("Karthi");
	WebElement a2=driver.findElement(By.id("InputEmail1"));
	a2.sendKeys("Karthi@gmail.com");
	WebElement a3=driver.findElement(By.id("InputSubject"));
	a3.sendKeys("7338940176");
	WebElement a4=driver.findElement(By.name("courses"));
	a4.sendKeys("Selenium");
	WebElement a5=driver.findElement(By.name("branch"));
	a5.sendKeys("Adyar");
	WebElement a6=driver.findElement(By.name("time"));
	a6.sendKeys("Immediately");
	WebElement a7=driver.findElement(By.name("comments"));
	a6.sendKeys("thanks");
	WebElement a8=driver.findElement(By.id("submit"));
	a6.click();
	Thread.sleep(2000);
	driver.get("https://www.facebook.com/");
	WebElement b1=driver.findElement(By.xpath("//*[@id=\'email\']"));
	b1.sendKeys("7338940176");
	WebElement b2=driver.findElement(By.xpath("//*[@id=\'pass\']"));
	b2.sendKeys("Dharun6@");
	WebElement b3=driver.findElement(By.xpath("//*[@id=\'u_0_b\']"));
	b3.click();
Thread.sleep(4000);
	driver.get("http://demo.automationtesting.in/SignIn.html");
	WebElement c1=driver.findElement(By.xpath("/html/body/div/div/div[2]/input"));
	c1.sendKeys("abc@gmail.com");
	WebElement c2=driver.findElement(By.xpath("/html/body/div/div/div[3]/input"));
	c2.sendKeys("abc@gm");
	WebElement c3=driver.findElement(By.id("enterbtn"));
	c3.click();
	Thread.sleep(4000);
	driver.get("https://demoqa.com/automation-practice-form");
	WebElement d1=driver.findElement(By.id("firstName"));
	d1.sendKeys("Karthi");
	WebElement d2=driver.findElement(By.id("lastName"));
	d2.sendKeys("V");
	WebElement d3=driver.findElement(By.id("userEmail"));
	d3.sendKeys("abc@gmail.com");
	WebElement d4=driver.findElement(By.xpath("//*[@id=\'genterWrapper\']/div[2]/div[1]/label"));
	d4.click();
	WebElement d5=driver.findElement(By.id("userNumber"));
	d5.sendKeys("7338940176");
	WebElement d6=driver.findElement(By.id("dateOfBirthInput"));
	
	//d6.sendKeys("09 Feb 2021");
	//WebElement d7=driver.findElement(By.xpath("//div[contains(@class,'subjects-auto-complete__control css-yk16xz-control')]"));
	//d7.sendKeys("English");
	//WebElement d8=driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]"));
	//d8.sendKeys("Sports");
	//WebElement d9=driver.findElement(By.id("uploadPicture"));
	//d9.click();
	WebElement d10=driver.findElement(By.id("currentAddress"));
	d10.sendKeys("Madurai");
	Thread.sleep(3000);
	//WebElement d11=driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[1]"));
//Select S=new Select (d11);
//Thread.sleep(3000);
	//S.selectByIndex(1);
	//d11.sendKeys("Uttarpradesh");
	//WebElement d12=driver.findElement(By.xpath("//*[@id=\'stateCity-wrapper\']/div[3]"));
//d12.sendKeys("Agra");
	driver.get("https://www.greenstechnologys.com/careers.html");
	WebElement e1=driver.findElement(By.xpath("//*[@id=\'collapse20\']/div/div/ul/li[6]/a"));
	//e1.click();
	driver.get("https://www.redbus.i7n/");
	//WebElement f1=driver.findElement(By.id("mobileNoInp"));
	///f1.sendKeys("7338940176");
	driver.get("https://www.cleartrip.com/signin");
	WebElement f1=driver.findElement(By.id("email"));
	f1.sendKeys("kar");
	WebElement f2=driver.findElement(By.id("password"));
	f2.sendKeys("a13ij9@");
	WebElement f3=driver.findElement(By.id("signInButton"));
	f3.click();
	Thread.sleep(4000);
	driver.get("https://www.flipkart.com/");
	WebElement g1=driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- VJZDxU')]"));
	g1.sendKeys("7338940176");
	WebElement g2=driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- _3mctLh VJZDxU')]"));
	g2.sendKeys("Dharun62@");
	driver.quit();
	
	}

}
