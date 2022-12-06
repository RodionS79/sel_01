package sel_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class csv_table {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Slutsky\\Desktop\\QA Automation\\Selenium//chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        List<String> line = readCsv();


        for (int i = 1; i < line.size(); i++) {
            String[] split = line.get(i).split(",");
            driver.get("http://omayo.blogspot.com/search?q=radio");
            driver.findElement(By.name("userid")).sendKeys(split[0]);
            driver.findElement(By.name("pswrd")).sendKeys(split[1]);
            driver.findElement(By.xpath("//input[@value='Login']")).click();


            if (split[2].equals("fals")) ;

            String err = driver.switchTo().alert().getText();
            if (err.equals("Error Password or Username")) {
                System.out.println("The check " + i + " is successful");
            } else {
                System.out.println("The check" + i + "is false");
            }


        }
    }
        public static List <String> readCsv() throws IOException {
            List lines = new ArrayList();
            File file = new File("C:\\Users\\Slutsky\\Desktop\\QA Automation\\Csv\\csv.csv");
            lines = FileUtils.readLines(file, "windows-1255");
            return lines;
        }


    }



