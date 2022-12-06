package sel_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class page_object_model {
    static WebDriver driver;
    static pomModel pom;

    @BeforeClass
    static public void before() throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Slutsky\\Desktop\\QA Automation\\Selenium//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" http://www.netogreen.co.il/Calculators/Nutrition-Calories.aspx ");
        pom = new pomModel();
        pom = PageFactory.initElements(driver, pomModel.class);

    }

    @AfterClass
    public static void after() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }


    @Test
    public void test1() throws Exception {
        pom.search_field.sendKeys("לחם");
        pom.search_button.click();
        Thread.sleep(3000);
        if (pom.bread_list1.getText().equals("לחם לבן")) {
            System.out.println("test 1 pass");
        } else {
            System.out.println("test 1 fail");

        }

    }

    @Test
    public void test2() throws Exception {
        pom.search_field.clear();
        pom.search_field.sendKeys("123");
        pom.search_button.click();
        Thread.sleep(3000);
        if (pom.no_food_try_again.getText().equals("לא נמצאו מזונות, נסה שנית.")) {
            System.out.println("test 2 pass");
        } else {
            System.out.println("test 2 fail");
        }
    }

    @Test
    public void test3() throws Exception {
        pom.quantity.clear();
        pom.quantity.sendKeys("abc");
        Thread.sleep(3000);
        if (pom.quantity.getText().equals("abc")) {
            System.out.println("test 3 fail");
        }
        else {
            System.out.println("test 3 pass");
        }
    }
    @Test
    public void test4() throws Exception {
        pom.search_field.clear();
        pom.search_field.sendKeys("לחם");
        pom.search_button.click();
        Thread.sleep(3000);
        pom.olive_bread.click();
        pom.add.click();
        Thread.sleep(3000);
        if (driver.switchTo().alert().getText().equals("יש לבחור  יחידת מידה וכמות")) {
            driver.switchTo().alert().accept();
            System.out.println("test 3 pass");
        }
        else {
            System.out.println("test 3 fail");
        }

    }
}