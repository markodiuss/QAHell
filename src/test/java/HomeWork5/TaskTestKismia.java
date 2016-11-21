package HomeWork5;

import constantsAndOther.Contstants;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.Constants;

import java.util.concurrent.TimeUnit;

/**
 * Created by Markodius on 21.11.2016.
 */
public class TaskTestKismia {

    WebDriver driver;

    @BeforeTest
    public void setUpBrowser() {

        System.out.println("SetUp Chrome");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Contstants.DEFAULT_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Contstants.DEFAULT_WAIT_LONG_TIME, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    //тест который проверяет смену языка после логина
    @Test(priority = 1)
    public void testKismiaLanguageAfterLogin() throws InterruptedException {

        String strEng = "Моя страница";

        System.out.println("Test");
        driver.get(Contstants.KISMIA_MAIN_PAGE);
        driver.findElement(By.id("user-email")).clear();
        driver.findElement(By.id("user-email")).sendKeys(Contstants.KISMIA_LOGIN);
        driver.findElement(By.id("user-password")).clear();
        driver.findElement(By.id("user-password")).sendKeys(Contstants.KISMIA_PASSWORD);
        driver.findElement(By.xpath(".//*[@id='sign-in-form']/button")).click();
        driver.findElement(By.xpath(".//*[@id='footer']/div/div/ul/li[2]/a")).click();
        String strGetText = driver.findElement(By.xpath(".//*[@id='main']/div[2]/div[1]/div/article/div/h1")).getText();

        if (strEng.equals(strGetText)) {

            System.out.println("Language is  not English");

        } else {

            System.out.println("Language is English");
        }

        driver.findElement(By.xpath(".//*[@id='footer']/div/div/ul/li[1]/a")).click();



    }

    //тест который проверяет смену языка БЕЗ логина
    @Test(priority = 2)
    public void testKismialLanguageBeforeLogin() throws InterruptedException {

        String strDefault = "Войти";

        System.out.println("Test");
        driver.get(Contstants.KISMIA_MAIN_PAGE);

        try {

            driver.findElement(By.xpath("html/body/div[1]/header/div/section/a")).click();

        } catch (NoSuchElementException e) {

            driver.get(Contstants.KISMIA_MAIN_PAGE);

        }

        String strMainPageLang = driver.findElement(By.xpath(".//*[@id='sign-in-form']/button")).getText();
        driver.findElement(By.xpath("html/body/div[2]/footer/div[2]/div/ul/li[2]/a")).click();

        if (strMainPageLang.equals(strDefault)) {

            System.out.println("Language is not Change");

        } else {

            System.out.println("Laguage is changed");

        }



    }

    @Test(priority = 3)
    public void blockedUser() throws InterruptedException {

        driver.get(Contstants.KISMIA_MAIN_PAGE);

        try {

            driver.findElement(By.xpath(".//*[@id='footer']/div/div/ul/li[1]/a")).click();

        } catch (NoSuchElementException e) {

            driver.get(Contstants.KISMIA_MAIN_PAGE);

        }

        driver.findElement(By.id("user-email")).clear();
        driver.findElement(By.id("user-email")).sendKeys(Contstants.KISMIA_LOGIN);
        driver.findElement(By.id("user-password")).clear();
        driver.findElement(By.id("user-password")).sendKeys(Contstants.KISMIA_PASSWORD);
        driver.findElement(By.xpath(".//*[@id='sign-in-form']/button")).click();
        driver.findElement(By.xpath(".//*[@id='aside']/div[2]/ul/li[1]/a")).click();
        WebElement webElemForBlock = driver.findElement(By.xpath(".//*[@id='content']/ul[2]/li[1]/ul/li[1]/a"));

        Actions builder = new Actions(driver);
        builder.moveToElement(webElemForBlock).build().perform();

        driver.findElement(By.xpath(".//*[@id='content']/ul[2]/li[1]/ul/li[7]/a")).click();


    }



    @AfterTest
    public void tearDown() {

        System.out.println("tearDown");
        driver.close();
        driver.quit();

    }



}
