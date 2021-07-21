package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignIN {

	
	WebDriver driver = null;

	@Given("browser is open")
	public void browser_is_open() {
		
		System.out.println("Inside Step - browser is open");
		
		System.setProperty("webdriver.chrome.driver","D:/Wallebi/Wallebi Project/BitBatuaNew/Driver/chromedriver.exe");

		 driver = new ChromeDriver(); // launch chrome
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
	}

	@And("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		
		driver.navigate().to("http://dev.bitbatua.com/index");
		
//		To Click On Login Button
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		Thread.sleep(2000);
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException  {
		
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/app-login[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys(username);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/app-login[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys(password);
		
		Thread.sleep(2000);
	}
	
	@And("user clicks on login")
	public void user_clicks_on_login() throws InterruptedException {
		
//		To Click On Remember Me Check Box
		driver.findElement(By.xpath("//input[@name='remember']")).click();
		Thread.sleep(2000);
		
//		To Click On Sign IN Buttons
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		Thread.sleep(2000);
	}


	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		
//		driver.findElement(By.id("logout")).isDisplayed();
		driver.findElement(By.xpath("//a[@class='sidebar-content logout']")).click();
		Thread.sleep(5000);
		
		driver.close();
		driver.quit();
    }
}
