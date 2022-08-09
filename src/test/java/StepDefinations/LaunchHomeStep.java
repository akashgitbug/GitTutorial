package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LaunchHomeStep {

	WebDriver driver;

	@Given("Open Chrome browser and Lanch site")
	public void launchBrowser() {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Resources\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://phptravels.com/demo/");
		driver.manage().window().maximize();
	}

	@Then("verify Home page of site")
	public void verifyHomePage() {
		String text = driver.findElement(By.cssSelector("strong[class='pull-left']")).getText();
		System.out.println(text);
		String title = driver.findElement(By.id("PHPTRAVELS")).getText();
		System.out.println("home screen contain title : "+title);
		if(driver.getPageSource().contains("PHPTRAVELS")) {
			System.out.println("its verify that home screen contain title : "+title);
		}
		
		
	}
	
	@And("verify the text subscriptions and onetime payment")
	public void verifyText() {
		String text = driver.findElement(By.cssSelector("strong[class='pull-left']")).getText();
		System.out.println(text);
		text.split("text");
	}
	
}
