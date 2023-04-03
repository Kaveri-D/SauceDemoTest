package SauceDemo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class StepDef {
    public static WebDriver driver;

    @Given("I am On Homepage")
    public void i_am_on_homepage() {
        // launch the browse and open the Url
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

    }
    @When("I login using correct credentials")
    public void i_login_using_correct_credentials() {
        // Login using provided credentials
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

    }
    @Then("I should login successfully")
    public void i_should_login_successfully() {
    }

    @Then("I search for highest price item")
    public void i_search_for_highest_price_item() throws InterruptedException {
        // Getting the list of price
        List<WebElement> pricelist = driver.findElements(By.cssSelector("[class='inventory_item_price']"));
        List<Float> prices1 = new ArrayList<Float>();
        for(WebElement e : pricelist)
        {
            //Removed the $ sign from the price list
            prices1.add(Float.valueOf(e.getText().replace("$","").trim()));

        }
        //System.out.println(prices1);
        System.out.println("Trim list with without $ sign " + prices1);
        float maxfloat = (float) Collections.max(prices1);
        System.out.println("Max value is: "+ maxfloat); // Got the highest price item
        WebElement addToCart= driver.findElement(By.xpath("//div[text()='"+maxfloat+"']/following::button[1]"));
        Thread.sleep(5000);
        addToCart.click();

    }

    @Then("I add item to cart")
    public void i_add_item_to_cart() {
        //Item is added in the cart
        driver.findElement(By.className("shopping_cart_badge")).click();
      //  Assert.assertTrue();
    }
}

