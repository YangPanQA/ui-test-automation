package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import java.util.logging.*;

/**
 * Created by ypan on 5/14/2018.
 */
public class WebdriverSetup {

    public static WebDriver driver;
    private static final Logger LOGGER = Logger.getLogger(WebdriverSetup.class.getName());

    public void setup(){

        System.setProperty("webdriver.chrome.driver", "C:\\Dev\\Tools\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.brooksbrothers.com/");
    }

    public  void closeDriver(){

        if (driver != null){
            try{
                driver.quit();
                driver = null;
            }catch (Exception e){
                LOGGER.log(Level.SEVERE, "Could not close driver!");
            }
        }
    }
}