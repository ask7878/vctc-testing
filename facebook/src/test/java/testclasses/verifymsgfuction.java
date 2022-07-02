package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pomclasses.Homepage;
import pomclasses.Loginpage;
import pomclasses.Profilepage;

public class verifymsgfuction {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	Loginpage lpage	=new Loginpage(driver);
	Thread.sleep(2000);
	lpage.pagelogin();
	Thread.sleep(4000);
	lpage.loginbuttonclick();
	Thread.sleep(8000);
	
	Homepage hpage	=new Homepage(driver);
	Thread.sleep(5000);
	hpage.searchthefriend();

	Thread.sleep(4000);
	hpage.selectthefriend(driver);
    Thread.sleep(2000);
	Profilepage ppage	=new Profilepage (driver);
	Thread.sleep(2000);
	 ppage.openchatwindow(driver);
	 Thread.sleep(2000);
	 ppage.writemsg(driver);
}
}
