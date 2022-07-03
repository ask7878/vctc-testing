package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
  @FindBy (xpath = "//input[@id='email']" )
  private WebElement username;
 
  @FindBy (xpath ="//input[@id='pass']"  )
  private WebElement password; 
 
  @FindBy (xpath ="//button[@type='submit']"  ) 
  private WebElement login;

    public Loginpage(WebDriver driver1) {
   PageFactory.initElements(driver1,this);}
  
      public void pagelogin() {
	  username.sendKeys("abhi.kadam7878@gmail.com");
	  password.sendKeys("abcd");
	}
      
      public void loginbuttonclick() {
    	  login.click();
      }
  }
  
  
  
  

