import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Made_Autotest {
    @Test
    public void testP2P(){

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://made-2d.renovai.com/design/1619498");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        By Sku = By.xpath("//div[@class='wrap wrap_active']");
        driver.findElement(Sku).click();
        By Like = By.xpath("//div[@class='container__wishbutton ng-star-inserted']");
        driver.findElement(Like).click();
        By Bag = By.xpath("(//div[@class='buttons__item']//button)[2]");
        driver.findElement(Bag).click();





















    }
}
