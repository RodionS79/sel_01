package sel_01;

import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class poi5_excell2 {
    static String path = "C:\\Users\\Slutsky\\Desktop\\QA Automation\\poi5 screenshots and files//excel_test.xlsx";
    static WebDriver driver;
    static public WebElement userName;
    static public WebElement password;
    static public WebElement tryIt_button;
    static public WebElement error_message;

    private static void excelPrint(String filePath, String value, int rowNumber, int cellNumber, int sheetNumber) throws IOException {

        FileInputStream inputStream = new FileInputStream(new File(filePath));
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(sheetNumber);
        Row row = sheet.getRow(rowNumber);
        if (row == null) {
            row = sheet.createRow(rowNumber);
        }
        Cell cell = row.getCell(cellNumber);
        if (cell == null) {
            cell = row.createCell(cellNumber);

        }
        cell.setCellValue(value);

        FileOutputStream outputStream = new
                FileOutputStream(filePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Slutsky\\Desktop\\QA Automation\\Selenium//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://danielauto.net/practice/loginPage/loginpageTest.html");
        userName = driver.findElement(By.id("uaertName"));
        password = driver.findElement(By.id("password"));
        tryIt_button = driver.findElement(By.id("send"));
        error_message = driver.findElement(By.id("err"));

        ////////////test_1////////////
        userName.sendKeys("admin");
        password.sendKeys("12345");
        Thread.sleep(3000);
        tryIt_button.click();

        if (error_message.getText().equals("You have entered incorrect details")) {
            excelPrint (path, "pass", 1,2, 3);
        }
        else {
            excelPrint (path, "fail", 1,2, 3);
        }

        //////////test2////////////
        userName = driver.findElement(By.id("uaertName"));
        password = driver.findElement(By.id("password"));
        tryIt_button = driver.findElement(By.id("send"));
        error_message = driver.findElement(By.id("err"));
        driver.get("http://danielauto.net/practice/loginPage/loginpageTest.html");
        userName.sendKeys("admin");
        password.sendKeys("pass");
        Thread.sleep(3000);
        tryIt_button.click();
        if (error_message.getText().equals("You have entered incorrect details")) {
            excelPrint (path, "pass", 2,2, 3);
        }
        else {
            excelPrint (path, "fail", 2,2, 3);
        }
        driver.quit();
    }
}
