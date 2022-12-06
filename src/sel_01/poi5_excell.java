package sel_01;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.hotkey.Keys;

import java.io.*;

public class poi5_excell {
    static String path = "C:\\Users\\Slutsky\\Desktop\\QA Automation\\poi5 screenshots and files//excel_test.xlsx";
    static WebDriver driver;


    private static void excelPrint(String filePath,String value, int rowNumber, int cellNumber ,int sheetNumber) throws IOException {

        FileInputStream inputStream = new FileInputStream(new File(filePath));
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(sheetNumber);
        Row row = sheet.getRow(rowNumber);
        if (row==null){
            row = sheet.createRow(rowNumber);
        }
        Cell cell = row.getCell(cellNumber);
        if (cell==null){
            cell=row.createCell(cellNumber);

        }
        cell.setCellValue(value);

        FileOutputStream outputStream = new
        FileOutputStream(filePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

    }
    public static void main(String[] args) throws IOException, InterruptedException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Slutsky\\Desktop\\QA Automation\\poi5 screenshots and files//excel_test.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet("test");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Slutsky\\Desktop\\QA Automation\\Selenium//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.il/search?q=%D7%9E%D7%A9%D7%94%D7%95&sxsrf=ALeKk03bvniI5GEtD3Y7UYstDkDLVFNSmg%3A1618732726014&source=hp&ei=teZ7YJuNO4O-aN-zmeAK&iflsig=AINFCbYAAAAAYHv0xj5lZzNkEPvZaB8H08cLl4nBXKLC&oq=%D7%9E%D7%A9%D7%94%D7%95&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECcyBAgjECcyBAgjECcyCwgAELEDEMcBEKMCMgUIABCxAzIICC4QsQMQgwEyBQgAELEDMgUIABCxAzICCAAyCAgAELEDEIMBOg4IABCxAxCDARDHARCjAjoKCAAQxwEQowIQQzoGCAAQChABOggIABAKEAEQKjoLCAAQsQMQxwEQrwE6BQguELEDOgUILhCTAjoGCC4QChABOgIILjoICAAQxwEQrwE6BwgjELECECc6BAguEAo6BAgAEAo6BwgjEOoCECc6CQgjEOoCECcQE1CyH1jNNGDWOWgEcAB4AIABwwSIAcAMkgEJMC4xLjQuNS0xmAEAoAEBqgEHZ3dzLXdperABCg&sclient=gws-wiz&ved=0ahUKEwjbu_ioqYfwAhUDHxoKHd9ZBqwQ4dUDCAc&uact=5");
        Thread.sleep(3000);
        String value;
        String titlegoogle = null;
        int FirstRow = sheet.getFirstRowNum();
        int LastRow = sheet.getLastRowNum();
        for (int i = FirstRow; i <= LastRow; i++) {
            XSSFRow row_r = sheet.getRow(i);
            XSSFCell cell_r = row_r.getCell(0);
            value = cell_r.getStringCellValue();
            Thread.sleep(1000);
            driver.findElement(By.name("q")).clear();
            driver.findElement(By.name("q")).sendKeys(value);
        //    Thread.sleep(3000);
            driver.findElement(By.className("Tg7LZd")).click();
            titlegoogle = driver.findElement(By.xpath("//div[@class='yuRUbf']//h3\n")).getText();
            excelPrint ("C:\\Users\\Slutsky\\Desktop\\QA Automation\\poi5 screenshots and files//excel_test.xlsx", titlegoogle, i,1, 0);
        }
        driver.quit();
    }

}

