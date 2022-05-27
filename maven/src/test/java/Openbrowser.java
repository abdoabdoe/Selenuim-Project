import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;
import java.sql.Driver;
import java.time.Duration;
import java.util.ArrayList;

public class Openbrowser {
    public static void main(String[] args) throws InterruptedException {


        String cromepath = System.getProperty("user.dir") + "\\src\\chromedriver.exe";

        System.out.println(cromepath);
        System.setProperty("webdriver.chrome.driver",cromepath);

        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);
        driver.navigate().to("https://www.ebay.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);


        driver.findElement(By.xpath("//*[@id=\"gh-ug\"]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("abdoabdoe@rocketmail.com");
        driver.findElement(By.xpath("//*[@id=\"signin-continue-btn\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("pass")).sendKeys("qaz123456");
        driver.findElement(By.xpath("//*[@id=\"sgnBt\"]")).click();


        driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[13]/div/div[2]/a")).click();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.findElement(By.id("binBtn_btn")).click();
        driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("1, cairo");
        driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys(" cairo");
        driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys(" cairo");
        driver.findElement(By.xpath("//*[@id=\"zip\"]")).sendKeys(" 01234");
        driver.findElement(By.xpath("//*[@id=\"phoneFlagComp1\"]")).sendKeys(" 1112315987");
        driver.findElement(By.xpath("//*[@id=\"sbtBtn\"]")).click();
        driver.findElement(By.xpath("//*[@i]")).click();




        Thread.sleep(3000);
        driver.close();
        driver.quit();
    }

}