package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	@FindBy (xpath="(//input[@placeholder='Search Facebook'])[1]")
	private WebElement searchbox;
	
	@FindBy (xpath="(//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7'])[1]")
	private WebElement firstsearch;
	
	public  Homepage(WebDriver driver2) {
     PageFactory.initElements(driver2, this);}
	
	
	public void searchthefriend() {
		
		searchbox.sendKeys("Abhishek Dilip Dhane");
	}
	
	public void selectthefriend(WebDriver driver) {
		Actions act =new Actions(driver);
		act.moveToElement(firstsearch);
		firstsearch.click();
	}
}
