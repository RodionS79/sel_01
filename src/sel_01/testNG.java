package sel_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import java.util.List;

public class testNG {
    static WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public static void browserOpening() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Slutsky\\Desktop\\QA Automation\\Selenium//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.nisha.co.il/%D7%98%D7%91%D7%9C%D7%90%D7%95%D7%AA-\n" +
                "%D7%A9%D7%9B%D7%A8");
    }
    @AfterClass(alwaysRun = true)
    public static void browserClosing() throws Exception {
        driver.quit();
    }
    @BeforeGroups("list")
    public static void list() throws Exception {
        System.out.println("**************List************");
    }
    @BeforeGroups("average")
    public static void average() throws Exception {
        System.out.println("**************Average************");
    }

    @Test(groups = "list", priority = 1)
    public static void printingList() throws Exception {
        List<WebElement> headers_list = driver.findElements(By.xpath("//h3[contains(@style, 'background')]"));
        for (int i = 0; i < headers_list.size(); i++) {
            System.out.println(headers_list.get(i).getText());
        }
    }

    @Test(groups = "average", priority = 2)
    public static void average1() throws Exception {
        List<WebElement> sphere_list = driver.findElements(By.xpath("//*[@id='salary-table-1']//*[contains(@style,'text-align: center;')][1]"));
        //table[@id='salary-table-1']//tr/td[@style='text-align: center;'][1] // 2-nd variation xpath
        sphere_list.remove(0);
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < sphere_list.size(); i++) {
            int ext_n = Integer.parseInt(sphere_list.get(i).getText().replaceAll("\\D", "")); //removing "-" inside a number, like: 20-25 -> 2025
            ext_n = ext_n / 100; //removing two right numbers
            sum = sum + ext_n;
            System.out.println(ext_n);
        }
        avg = sum / sphere_list.size();
        System.out.println("The average minimum salary of the Software is " + avg);
    }

    @Test(groups = "average", priority = 3)
    public static void average2() throws Exception {
        List<WebElement> sphere_list = driver.findElements(By.xpath("//table[@id='salary-table-3']//td[2]"));
        sphere_list.remove(0);
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < sphere_list.size(); i++) {
            int ext_n = Integer.parseInt(sphere_list.get(i).getText().replaceAll("\\D", "")); //removing "-" inside a number, like: 20-25 -> 2025
            ext_n = ext_n / 100; //removing two right numbers
            sum = sum + ext_n;
            System.out.println(ext_n);
        }
        avg = sum / sphere_list.size();
        System.out.println("The average minimum salary of the Hardware is " + avg);
    }

    @Test(groups = "average", priority = 4)
    public static void average3() throws Exception {
        List<WebElement> sphere_list = driver.findElements(By.xpath("//table[@id='salary-table-4']//td[2]"));
        sphere_list.remove(0);
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < sphere_list.size(); i++) {
            int ext_n = Integer.parseInt(sphere_list.get(i).getText().replaceAll("\\D", "")); //removing "-" inside a number, like: 20-25 -> 2025
            ext_n = ext_n / 100; //removing two right numbers
            sum = sum + ext_n;
            System.out.println(ext_n);
        }
        avg = sum / sphere_list.size();
        System.out.println("The average minimum salary of the QA is " + avg);
    }
}