package MavenDemoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.Test;

import qbe.pc.pages.loginpc;

public class LoginQBEPC {
	
	@Test
	public void login()
	{
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\trilok\\Desktop\\Driver\\svneht\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 
		 loginpc lp = PageFactory.initElements(driver, loginpc.class);
		 driver.get(lp.url);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 lp.login(lp.u, lp.p);
	}

}
