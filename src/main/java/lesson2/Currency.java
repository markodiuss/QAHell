package main.lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Vova_1 on 30.09.2016.
 */
public class Currency  {

    @Test
    public void getCurrencyFromSite () {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);


        driver.get("https://minfin.com.ua/");
        String text = driver.findElement(By.xpath("(//*[@class='mf-currency-ask'])[3]")).getText();
        System.out.println(text);

        driver.close();
        driver.quit();


    }
}
