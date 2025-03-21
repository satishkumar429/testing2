package Testcase;
//import java.time.Duration;

import java.time.Duration;

//import org.apache.commons.lang3.RandomStringUtils;
//import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.apache.commons.lang3.RandomStringUtils;

import pageobjects.Homepage;
//import pageobjects.Registerpage;
//import pageobjects.Homepage;
import pageobjects.Registerpage;


public class testcasecode {


	WebDriver driver;
	@BeforeClass 
	void setup() {
		driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(3000));
		}
	@AfterClass
	void teardown() {
		driver.quit();
		}
	@Test
	void page1() throws InterruptedException {
		Homepage hp = new Homepage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		Registerpage rg=new Registerpage(driver);
		rg.setfastName(S);
		rg.setlastName("H");
		rg.emailid("fgdu"+ "@+gmail.com");
		rg.phonnumber("8520984353");
		rg.password("465356");
		rg.conform("465356");
		rg.pclick();
		rg.Continue();
		Thread.sleep(3000);
		String meg=rg.getConfirmationMsg();
		Assert.assertEquals(meg,"Your Account Has Been Created!");
	}
	

		
		public String randomString() 
		{
		    @SuppressWarnings("deprecation")
			String s=  RandomStringUtils.randomAlphabetic(5);
		    return s;
		}
		
    
	}
}


