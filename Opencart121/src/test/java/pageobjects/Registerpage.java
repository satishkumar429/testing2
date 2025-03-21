package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registerpage extends Basepase{

	public Registerpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")

	 WebElement txtFirstname;

	

	 @FindBy(xpath="//input[@id='input-lastname']")

	 WebElement txtLasttname;

	 @FindBy(xpath="//input[@id='input-email']")

	 WebElement txtEmail;

	

	@FindBy(xpath="//input[@id='input-telephone']")

	 WebElement txtTelephone;

	

	 @FindBy(xpath="//input[@id='input-password']")

	WebElement txtPassword;

	

	 @FindBy(xpath="//input[@id='input-confirm']")

	 WebElement txtConfirmPassword;
	 
	 @FindBy(xpath="//input[@name='agree']")

	  WebElement chkdPolicy;

	 

	  @FindBy(xpath="//input[@value='Continue']")

	  WebElement btnContinue;

	 

	 @FindBy(xpath = "//h1 [normalize-space()= 'Your Account Has Been Created!']")
	 WebElement msgConfirmation;
	 
	 public void setfastName (String fname) {

		 txtFirstname.sendKeys(fname);
	 }
	 
	 public void setlastName (String Iname) {

		  txtLasttname.sendKeys(Iname);
		 
	 }
	 public void emailid (String emailid) {

		 txtEmail.sendKeys(emailid);
	 }
	 public void phonnumber (String phone) {

		 txtTelephone.sendKeys(phone);
	 }
	 
	 public void password (String pwd) {

		 txtPassword.sendKeys(pwd);
	 }
	 WebDriver driver;

	 public void conform(String pwd) {
		 
		 txtConfirmPassword.sendKeys(pwd);
		 
	 }
	 public void pclick() {
		 chkdPolicy.click();
		 
	 }

	 public void Continue() {
		 btnContinue.click();
	 }
	 
	 public String getConfirmationMsg() {

		

		 try {

		 

		 return (msgConfirmation.getText());

		 

		 } catch (Exception e) {

		 

		 return (e.getMessage());
		 }
	 }
}
