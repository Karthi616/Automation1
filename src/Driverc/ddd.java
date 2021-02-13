package Driverc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ddd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.internetexplorer.driver", "C:\\Users\\USER\\eclipse-workspace\\We\\src\\Driver\\IEDriverServer.exe");
	WebDriver nn=new InternetExplorerDriver();
	nn.get("https://www.google.com/intl/en-GB/gmail/about/#");
	nn.quit();
	}
	
	
	
	

}
