package StepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {

	WebDriver driver;

	@Given("^user on the playtech website \"([^\"]*)\"$")
	public void user_on_the_playtech_website_something(String url) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "/Users/ganesan/Desktop/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get(url);
		System.out.println("User on the playtech site");

	}

	@And("^user Enters \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")

	public void user_enters_Day_month_year(String day, String month, String year) {

		driver.findElement(By.name("day")).sendKeys(String.valueOf(day));
		driver.findElement(By.name("month")).sendKeys(String.valueOf(month));
		driver.findElement(By.name("year")).sendKeys(String.valueOf(year));

	}

	@When("user clicks  on Enter site")
	public void user_clicks_on_enter_site() throws Exception {

		driver.findElement(By.xpath("//*[@id=\"age-verification\"]/div[1]/div/div/div[2]/div[4]/button")).click();
		driver.findElement(By.xpath("//*[@id='close-cookie']")).click();
	
	}

	@When("user should land on the HomePage and clickson Aboutus")
	public void user_should_land_on_the_home_page() {

		System.out.println("user lands on the Home page");
		
		WebElement element = driver.findElement(By.linkText("About Us"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
		element.click();

	}

	@And("^user should verify the Title of the Page$")
	public void user_should_verify_the_title_of_the_page() throws Throwable {
		System.out.println("user verifies the title");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Company Overview PlayTech");

	}

	@When("^user scrolls downto validate$")
	public void user_scrolls_downto_validate() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Dom = driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div"));
		js.executeScript("arguments[0].scrollIntoView();", Dom);

	}

	@Then("^validates the count of (.+) (.+) and (.+)$")
	public void validates_the_count_of_numberofemployeescountriescountgloballicensees(String emp, String country,
			String licensees) {

		WebElement NoEmp = driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[1]/div[1]"));
		String Empcount = NoEmp.getAttribute("data-odometer-count");
		System.out.println(Empcount);
		Assert.assertEquals(Empcount, emp);

		WebElement Countries = driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div[1]"));
		String Countriescount = Countries.getAttribute("data-odometer-count");
		System.out.println(Countriescount);
		Assert.assertEquals(Countriescount, country);

		WebElement Licenses = driver.findElement(By.xpath("//body/div[1]/main[1]/div[2]/div[1]/div[3]/div[1]"));
		String Licensescount = Licenses.getAttribute("data-odometer-count");
		System.out.println(Licensescount);
		Assert.assertEquals(Licensescount, licensees);

		driver.quit();

	}

}
