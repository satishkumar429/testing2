package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Basepase {
	
	WebDriver driver;
	
	Basepase(WebDriver driver)

	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}

}
