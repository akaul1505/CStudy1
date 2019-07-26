package ngrnur;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CS01 {
	WebDriver driver;
	
	
	@Given("User is on Home Page")
	
	public void user_is_on_Home_Page() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver", "C:\\NexGen Testing Stream\\DRIVERS\\chromedriver_win32\\chromedriver.exe");
	      driver= new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
		}

	@When("User clicks on SignUp link")
	public void user_clicks_on_SignUp_link() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		WebElement signup= driver.findElement(By.xpath("//a[contains(text(), 'SignUp')]"));
		signup.click();
	}

	@When("User fills the required details")
	public void user_fills_the_required_details() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("akauls1505");
		
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("abc");
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("ghj");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("zxcvbnm123");
			driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("zxcvbnm123");
			driver.findElement(By.xpath("//span[text()='Female']")).click();
			driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("abc123@ajkj.com");
			driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("6756886998");
			driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("01/05/1997");
			driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("afsbusdbfudysbgf123");
			driver.findElement(By.xpath("//select[@name='securityQuestion']")).sendKeys("What is your favourite color?");
			driver.findElement(By.xpath("//input[@name='answer']")).sendKeys("afsbusdbfudysbgf");
			
	}

	@Then("She clicks on Submit button")
	public void she_clicks_on_Submit_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	}

	@Then("She logs in the website")
	public void she_logs_in_the_website() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("akauls1505");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("zxcvbnm123");
		WebElement login= driver.findElement(By.xpath("//input[@name='Login']"));
		login.click();
	}
	

}
