package SauceDemo.Pages;

import org.openqa.selenium.By;

public class AuthenticationPage extends BasePage {

    //public static String getPageTitle() { return driver.getTitle(); }

    public static void enteremailId(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }
    public static void enterPassword(){
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    public static void clickOnlogin(){
//        loginButton = driver.findElement(By.id("login-button"));
//        loginButton.click();
        driver.findElement(By.id("login-button")).click();    }
}
