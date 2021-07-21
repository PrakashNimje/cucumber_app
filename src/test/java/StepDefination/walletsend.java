package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class walletsend {


	WebDriver driver = null;
	@Given("Iam On Bibatua Index Page")
	public void iam_On_Bibatua_Index_Page() {

		System.out.println("Inside Step - browser is open");

		System.setProperty("webdriver.chrome.driver","D:/Wallebi/Wallebi Project/BitBatuaNew/Driver/chromedriver.exe");

		driver = new ChromeDriver(); // launch chrome

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.navigate().to("http://dev.bitbatua.com/index");

	}

	@And("user login is successfully done.")
	public void user_login_is_successfully_done() throws InterruptedException {


		//		To Click On Login Button
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/app-login[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys("prakash@lapits.com");
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/app-login[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys("Prakash@12345678");

		Thread.sleep(2000);

		//To Click On Remember Me Check Box
		driver.findElement(By.xpath("//input[@name='remember']")).click();
		Thread.sleep(2000);

		//To Click On Sign IN Buttons
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		Thread.sleep(2000);

	}

	@When("user select PrakashETH Wallet and clicks withdraw and enter adderess and enter amount and click on send")
	public void user_select_PrakashETH_Wallet_and_clicks_withdraw_and_enter_adderess_and_enter_amount_and_click_on_send() throws InterruptedException {

		//		To Click on Wallets Button
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/i[1]")).click();
		Thread.sleep(5000);

		//		To Select PrakashEth wallet	
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/div[1]/div[2]/div[2]/app-wallet[1]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[4]/button[2]/mat-icon[1]")).click();
		Thread.sleep(5000);

		//		To Enter Address In Address Field	
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/div[1]/div[2]/div[2]/app-balance[1]/div[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys("0x219eE665fD4b409ae08a0848f171BCcDfBA63364");
		Thread.sleep(5000);


		//      To Enter Amount In Amount Field		

		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/div[1]/div[2]/div[2]/app-balance[1]/div[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys("0.001");
		Thread.sleep(5000);

		//		To Clicking On Send Button
		driver.findElement(By.xpath("//button[normalize-space()='Send']")).click();
		Thread.sleep(5000);



	}

	@Then("user successfully send ammount to the respective address")
	public void user_successfully_send_ammount_to_the_respective_address() {

		System.out.println("You Successfully Transfered Your Amount");

	}
}