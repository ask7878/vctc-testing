package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profilepage {
	@FindBy (xpath="//span[text()='Message']")private WebElement message;
	@FindBy (xpath="//p[@class='kvgmc6g5 oygrvhab']")private WebElement msgbox;
	@FindBy (xpath="//div[@aria-label='Press enter to send']")private WebElement sendmsgkey;

	
	
	public  Profilepage(WebDriver driver4) {
	PageFactory.initElements(driver4,this);}	
	
	public void openchatwindow(WebDriver driver5) {
		Actions act =new Actions(driver5);
		act.moveToElement(message).click().build().perform();}
	
	
    public void writemsg(WebDriver driver6) {
    Actions act =new Actions(driver6);
    act.sendKeys(msgbox, "Good Morning abhi,uthlas ka.").perform();
   
    act.moveToElement(sendmsgkey).click().build().perform();}		
		
}		
