package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinations_Amazone {
	public WebDriver driver;
	
	
	
	 @Given("^open chrome browser and open home page of amazone$")
	    public void open_chrome_browser_and_open_home_page_of_amazone() throws Throwable {
		 
		 System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver_win32_new\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile");
	     driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	      
	    }

	    @When("^user search \"([^\"]*)\" on search box$")
	    public void user_search_something_on_search_box(String Mobile) throws Throwable {
	    	/*driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile");
	    	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	        */
	    }

	    @Then("^mobile option are seen on next page$")
	    public void mobile_option_are_seen_on_next_page() throws Throwable {
	        System.out.println("Product dispay scuussfully");
	    }


}
