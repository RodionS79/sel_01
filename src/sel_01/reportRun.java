package sel_01;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class reportRun {
    static WebDriver driver;
    static ExtentReports extent;
    static ExtentTest test1;
    static ExtentTest test2;
    static ExtentTest test3;
    static ExtentManager exm = new ExtentManager(driver);

    @BeforeClass
    public static void before(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Slutsky\\Desktop\\QA Automation\\Selenium//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://edu.gov.il/owlHeb/Pages/default.aspx");
        extent = exm.GetExtent();
        test1 = exm.createTest("test1", "description1");
        test2 = exm.createTest("test2", "description2");
        test3 = exm.createTest("test3", "description3");
    }
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        Thread.sleep(3000);
        driver.quit();
        extent.flush();

    }
    @Test
    public void test1() throws IOException, AWTException, InterruptedException {
        WebElement menu = driver.findElement(By.xpath("//a[contains(text(),'רפורמות ותוכניות')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(menu).perform();
        Thread.sleep(2000);
        WebElement submenu = driver.findElement(By.linkText("גני ילדים"));
        driver.getTitle(); //לוקח את השם של הדף
        Thread.sleep(2000);
        actions.click(submenu);
        actions.perform();
        if (!driver.getTitle().equals("גני ילדים")) {
            test1.pass("test1");
        } else {
            test1.fail("test1", MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
        }
        Thread.sleep(2000);
    }
    @Test
        public void test2() throws IOException, AWTException, InterruptedException {
            WebElement menu2 = driver.findElement(By.xpath("//a[contains(text(),'אודות המשרד')]"));
            Actions actions2 = new Actions(driver);
            actions2.moveToElement(menu2).perform();
            Thread.sleep(2000);
            WebElement submenu = driver.findElement(By.linkText("הנהלת המשרד ויחידותיו"));
            driver.getTitle();
            Thread.sleep(2000);
            actions2.click(submenu);
            actions2.perform();
        if (!driver.getTitle().equals("הנהלת המשרד ויחידותיו")) {
            test1.pass("test2");
        } else {
            test1.fail("test2", MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
        }
        Thread.sleep(2000);
        }
    //    test1.pass("test1");
    //    test2.fail("test2",MediaEntityBuilder.createScreenCaptureFromPath(exm.CaptureScreen(driver)).build());
     //   test3.pass("test3");

}
