package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Basepase{
	WebDriver driver;
	public Homepage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement InkMyaccount;

	@FindBy(xpath="//a[normalize-space()='Register']")

	WebElement InkRegiste;

	public void clickMyAccount()

	{

	InkMyaccount.click();

	}

	public void clickRegister()

	{

	InkRegiste.click();

	}

}
