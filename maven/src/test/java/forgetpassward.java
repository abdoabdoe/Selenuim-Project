import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class forgetpassward {
    public static void main(String[] args) throws InterruptedException {


        String cromepath = System.getProperty("user.dir") + "\\src\\chromedriver.exe";

        System.out.println(cromepath);
        System.setProperty("webdriver.chrome.driver", cromepath);

        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);
        driver.navigate().to("https://www.jumia.com.ng/customer/account/login/?return=%2F");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"authForm\"]/div[1]/div[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"fi-email\"]")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"authForm\"]/div[2]/button")).click();
    }
}