package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class forgotpass {

	WebDriver driver = null;
	@Given("chrome is open")
	public void chrome_is_open() {

		System.out.println("Inside Step - browser is open");

		System.setProperty("webdriver.chrome.driver","D:/Wallebi/Wallebi Project/BitBatuaNew/Driver/chromedriver.exe");

		driver = new ChromeDriver(); // launch chrome

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().window().maximize();


	}

	@And("user is on index page click on signIN Page")
	public void user_is_on_index_page_click_on_signIN_Page() {

//		To Enter URL
		driver.navigate().to("http://dev.bitbatua.com/index");

		//		To Click On Login Button
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();

	}

	@When("user click forgot pass link")
	public void user_click_forgot_pass_link() throws InterruptedException {


		//		To Click On Forgot Password
		driver.findElement(By.linkText("Forgot Password?")).click();				
		Thread.sleep(2000);  		

	}

	@And("user Enter Email Address click otp")
	public void user_Enter_Email_Address_click_otp() {
		//		To Enter The Email Address
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/app-forget-password[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("prakash@lapits.com");

		//		To Click on Send OTP			
		driver.findElement(By.xpath("//button[normalize-space()='Send OTP']")).click();   


	}

	@Then("successfully sent otp")
	public void successfully_sent_otp() {
		System.out.println("OTP SuccessFully Sent to Your Email ID");


	}





}
