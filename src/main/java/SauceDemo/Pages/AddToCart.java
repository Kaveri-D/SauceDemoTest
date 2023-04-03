package SauceDemo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddToCart extends BasePage{

    public static void addHighestPriceitemToCart(){
        // Getting the list of price
        List<WebElement> pricelist = driver.findElements(By.cssSelector("[class='inventory_item_price']"));
        List<Float> prices1 = new ArrayList<Float>();
        for(WebElement e : pricelist)
        {
            prices1.add(Float.valueOf(e.getText().replace("$","").trim()));

        }
        System.out.println(prices1);
        System.out.println("Trim list" + prices1);
        float maxfloat = (float) Collections.max(prices1);
        System.out.println("Max value is: "+ maxfloat);
        WebElement addToCart= driver.findElement(By.xpath("//div[text()='"+maxfloat+"']/following::button[1]"));
        addToCart.click();

    }

    }



