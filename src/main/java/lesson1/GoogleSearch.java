package lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Markodius on 28.09.2016.
 */
public class GoogleSearch {

    String searchWord = "Hello World!!!";

    @Test
    public void findSomeWordInGoogle() throws InterruptedException  {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        driver.get("https://www.google.com.ua");

        driver.findElement(By.id("lst-ib")).clear();
        driver.findElement(By.id("lst-ib")).sendKeys(searchWord);

        driver.findElement(By.name("btnG")).click();
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("#search .g .rc a")).click();
        Thread.sleep(3000);

        String title = driver.getTitle();
        System.out.println(title);

    }

}
