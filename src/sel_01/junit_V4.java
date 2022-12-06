package sel_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;

public class junit_V4 {
    static WebDriver driver;
    static double shufersal = 0.0;
    static double quick = 0.0;
    static double rami = 0.0;

    @BeforeClass
    public static void  setUpBeforeClass() throws Exception {
        System.out.println("");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Slutsky\\Desktop\\QA Automation\\Selenium//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        driver.quit();
    }

    @Test
    public void test1() throws InterruptedException, AWTException {
        driver.get("https://www.shufersal.co.il/online/he/");
        driver.findElement(By.id("js-site-search-input")).sendKeys("שניצל תירס טבעול");
        driver.findElement(By.xpath("//button[@aria-label='לתוצאות חיפוש']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='24.9']")).getText();
        String price = driver.findElement(By.xpath("//span[normalize-space()='24.9']")).getText();
        price = price.replace("₪", "");
        price = price.trim();
        shufersal = Double.parseDouble(price);
        System.out.println("The price in shufersal is " + shufersal);
        Thread.sleep(3000);
    }

    @Test
    public void test2() throws InterruptedException, AWTException {
        driver.get("https://www.rami-levy.co.il/he/shop");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("שניצל תירס טבעול");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='px-2 w-100 bd-highlight']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='item-328364']//span[@class='position-relative currency-wrap overflow-ellipsis lm-text currency-product']//span[1]")).getText();
        String price = driver.findElement(By.xpath("//div[@id='item-328364']//span[@class='position-relative currency-wrap overflow-ellipsis lm-text currency-product']//span[1]")).getText();
        price = price.replace("₪", "");
        price = price.trim();
        rami = Double.parseDouble(price);
        System.out.println("The price in rami is " + rami);
        Thread.sleep(3000);
    }

    @Test
    public void test3() throws InterruptedException, AWTException {
        driver.get("https://quik.co.il/");
        Thread.sleep(5000);
        driver.findElement(By.className("searchInput_KC6")).sendKeys("שניצל תירס טבעול");
        driver.findElement(By.className("searchIcon_xpc")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@id='product-7290111566752']//strong[contains(text(),'32')]")).getText();
        String price = driver.findElement(By.xpath("//div[@id='product-7290111566752']//strong[contains(text(),'32')]")).getText();
        price = price.replace("₪", "");
        price = price.trim();
        quick = Integer.parseInt(price);
        System.out.println("The price in quick is " + quick);
        Thread.sleep(5000);
    }

    @Test
    public void test4() throws InterruptedException, AWTException {
        if (shufersal < rami && shufersal < quick) {
            System.out.println("shufersal is the chipest one");
        }
        else if (shufersal == rami && shufersal < quick) {
            System.out.println("shufersal and rami are the chipest two");
        }
        else if (shufersal == quick && shufersal < rami) {
            System.out.println("shufersal and quick are the chipest two");
        }
        else if (rami < shufersal && rami < quick) {
            System.out.println("rami is the chipest one");
        }
        else if (rami == quick && rami < shufersal) {
            System.out.println("rami and quick are the chipest two");
        }
        else if (quick < shufersal && quick < rami) {
            System.out.println("quick is the chipest one");
        }
    }
}
