package homeWorkOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Markodius on 28.09.2016.
 */
public class VkAndFbLogin {

    String vkEmail = "";
    String vkPass = "";
    String fbPass = "";



    @Test
    public void findTitleVk () throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);

        driver.get("https://vk.com");

        driver.findElement(By.id("index_email")).clear();
        driver.findElement(By.id("index_email")).sendKeys(vkEmail);

        driver.findElement(By.id("index_pass")).clear();
        driver.findElement(By.id("index_pass")).sendKeys(vkPass);
        Thread.sleep(2000);

        driver.findElement(By.id("index_login_button")).click();
        Thread.sleep(2000);

        String nameVk = driver.getTitle();
        System.out.println("Title of MainPage vk.com = " +nameVk);

        driver.close();
        driver.quit();
    }

    @Test
    public void findTitleFacebook () throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);

        driver.get("https://facebook.com");

        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(vkEmail);

        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys(fbPass);
        Thread.sleep(2000);

        driver.findElement(By.id("u_0_l")).click();
        Thread.sleep(2000);

        String nameFb = driver.getTitle();
        System.out.println("Title of MainPage fb.com = " +nameFb);

        driver.close();
        driver.quit();

    }
}
