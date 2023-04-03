package SauceDemo.Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {

//    public static void main(String[] args) {
//        startBrowser();
//        AuthenticationPage.enteremailId();
//        AuthenticationPage.enterPassword();
//        AuthenticationPage.clickOnlogin();
//        AddToCart.addHighestPriceitemToCart();
//
//    }

    public static WebDriver driver;
      public static void startBrowser(){
          //WebDriverManager.chromedriver().setup();
          //driver= new ChromeDriver();
//          WebDriverManager.firefoxdriver().setup();
//          driver = new FirefoxDriver();
//          driver.get("https://www.saucedemo.com/");
//          driver.manage().window().maximize();
      }

      public static void closeBrowser(){
          driver.close();
      }

//      public static String getPageTitle() {return driver.getTitle();}
}
