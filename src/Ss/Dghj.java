package Ss;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
public class Dghj {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
WebDriver n=new ChromeDriver();
n.get("https://www.facebook.com/");
WebElement e= n.findElement(By.id("email"));
e.sendKeys("abc@gmail.com");
WebElement g= n.findElement(By.id("pass"));
g.sendKeys("abc");
WebElement l=n.findElement(By.name("login"));
l.click();
Thread.sleep(1000);
n.get("https://www.redbus.in/");
WebElement c= n.findElement(By.id("src"));
c.sendKeys("Chennai");
Thread.sleep(1000);
n.get("http://www.greenstechnologys.com/");
Thread.sleep(1000);
n.get("https://www.lvbankonline.in/index.html?module=login");
//WebElement hgg= n.findElement(By.xpath("//html//body//div[2]//div//div//div//div//div[2]"));
//hgg.sendKeys("hghij");
Thread.sleep(1000);
n.get("https://www.icicibank.com/Personal-Banking/insta-banking/internet-banking/index.page");
n.get("https://twitter.com/login");
//WebElement b= n.findElement(By.xpath("(//div[@class='css-1dbjc4n r-18u37iz r-16y2uox r-1wbh5a2 r-19h5ruw r-1udh08x r-1inuy60 r-ou255f r-m611by'])[1]"));
//b.sendKeys("7338940176");
//WebElement p= n.findElement(By.xpath("(//div[@class='css-1dbjc4n r-18u37iz r-16y2uox r-1wbh5a2 r-19h5ruw r-1udh08x r-1inuy60 r-ou255f r-m611by'])[2]"));
//p.sendKeys("abcqw6888");
//WebElement g1=n.findElement(By.xpath("(//div[@class='css-901oao r-1awozwy r-jwli3a r-6koalj r-18u37iz r-16y2uox r-1qd0xha r-a023e6 r-b88u0q r-1777fci r-ad9z0x r-dnmrzs r-bcqeeo r-q4m81j r-qvutc0'])[1]"));
//g1.click();
Thread.sleep(5000);
n.get("https://www.hdfcbank.com/");
//WebElement g2=n.findElement(By.xpath("//input[@class='input_password']]"));
//g2.sendKeys("abcd");
Thread.sleep(1000);
n.get("https://www.swiggy.com/");
WebElement b1= n.findElement(By.xpath("//*[@id=\"location\"]"));
b1.sendKeys("Chennai");
Thread.sleep(1000);
n.get("https://www.snapdeal.com/");
//WebElement b2= n.findElement(By.name("username"));
//b2.sendKeys("Karthi");
Thread.sleep(1000);
n.get("https://www.instagram.com/");
//WebElement b21= n.findElement(By.name("username"));
//b21.sendKeys("kks");
//WebElement b22= n.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input"));
//b22.sendKeys("kkse1");
//WebElement b23=n.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]"));
//b23.click();
n.get("https://www.irctc.co.in/nget/train-search");
WebElement b25= n.findElement(By.xpath("//*[@id=\"origin\"]/span/input"));
b25.sendKeys("Chennai");
n.get("https://adactinhotelapp.com/");
WebElement b26= n.findElement(By.name("username"));
b26.sendKeys("Hari");
WebElement b27= n.findElement(By.id("password"));
b27.sendKeys("12333");
WebElement b28= n.findElement(By.name("login"));
b28.click();
Thread.sleep(1000);

n.quit();

	}

}