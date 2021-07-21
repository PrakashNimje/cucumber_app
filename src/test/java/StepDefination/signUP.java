package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signUP {
              
	WebDriver driver = null;
	@Given("browser window is open")
	public void browser_window_is_open() {

		   System.out.println("Inside Step - browser is open");
			
			System.setProperty("webdriver.chrome.driver","D:/Wallebi/Wallebi Project/BitBatuaNew/Driver/chromedriver.exe");

			 driver = new ChromeDriver(); // launch chrome
			
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
			
	}

	@And("user is on Bitbatua SignUP page")
	public void user_is_on_Bitbatua_SignUP_page() throws InterruptedException {
		
		driver.navigate().to("http://dev.bitbatua.com/index");
		
//		To Click On Create Button
		driver.findElement(By.xpath("//a[normalize-space()='Create Account']")).click();
		Thread.sleep(2000);
				
//		To Click On SignUp Button
		driver.findElement(By.xpath("//button[normalize-space()='Sign Up']")).click();
		Thread.sleep(2000);		
		
	}

	@When("user enters a FullName EmailAddress Passs")
	public void user_enters_a_FullName() throws InterruptedException {
	    
//		To Enter Full Name On SignUp Page		
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/app-register[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys("Prakash P Nimje");	

		
//		To Enter Email Address SignUp Page		
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/app-register[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys("prakashnime800@gmail.com");	
		Thread.sleep(1000);

	    
		
//		To Enter The Password
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/app-register[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys("Prakash@12345");	
		Thread.sleep(1000);
		
	}

	@And("user click on checkbox signUp")
	public void user_click_on_checkbox() throws InterruptedException {
	    
//		To Click Checkbox 
		driver.findElement(By.xpath("//div[@class='mat-checkbox-inner-container']")).click();
		Thread.sleep(2000);
		
//		To Click SignUp 
		driver.findElement(By.xpath("/html/body/app-root/app-layout/app-register/div/div/div[1]/div/div/form/div[5]/button[1]")).click();
		Thread.sleep(2000);	
	}

	@Then("user successfully create signUp")
	public void user_successfully_create_signUp() {
		System.out.println("Successfully Created Account");
	    
	}
	
	
}
