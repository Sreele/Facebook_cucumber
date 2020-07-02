package stepDefinition;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition {
	
	WebDriver driver;
	@Given("^launch browser and navigate to url$")
    public void launch_browser_and_navigate_to_url() throws Throwable {
       
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAVSLTPBCP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
    }
	    
	@When("^user login into application with (.+) and password (.+)$")
    public void user_login_into_application_with_and_password(String username, String password) throws Throwable {
		System.out.println(username);
	    System.out.println(password);
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
    }

    @Then("^get the titile of page loaded$")
    public void get_the_titile_of_page_loaded() throws Throwable {
    	//get the titile of page loaded
    	String Title = driver.getTitle(); 	
		System.out.println(Title);
    }
    @Then("^close the browser$")
    public void close_the_browser() throws Throwable {
    	//close the browser
    	driver.close();
    }


}
