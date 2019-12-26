package qbe.pc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpc {

	
	
	public static String url = "http://motor-u1.rqbeonline.co.in/";
	public static String u="ttt" , p="Inube@123";
	
	@FindBy(id="Email")
	WebElement username;
	
	@FindBy(id="Password")
	WebElement password;
	
	
	@FindBy(xpath="/html/body/div/div/div[2]/div/form/div[2]/button")
	WebElement login;
	
	
	public void login(String u, String p)
	{
		username.sendKeys(u);
		password.sendKeys(p);
		login.click();
	}
	
}
