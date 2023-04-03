package SauceDemo;

import SauceDemo.Pages.BasePage;
import org.junit.After;
import org.junit.Before;

public class Hooks extends BasePage {
   @Before
    public void setUp(){
     startBrowser();
   }

   @After
    public void tearDown(){
       closeBrowser();
   }


}
