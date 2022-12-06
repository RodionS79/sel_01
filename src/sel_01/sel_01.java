package sel_01;

import com.paulhammant.ngwebdriver.ByAngular;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

public class sel_01 {
    public static void main(String[] args) throws InterruptedException, FindFailed {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Slutsky\\Desktop\\QA Automation\\Selenium//chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("http://danielauto.net/practice/newLocator/locator.html");
//        driver.findElement(By.id("myText")).sendKeys("Enter any text");
//        driver.findElement(By.name("by_Name")).click();
//        driver.findElement(By.tagName("h3")).getText();
//        driver.findElement(By.className("c_name")).getText();
//        System.out.print(driver.findElement(By.tagName("h3")).getText());
//        System.out.print(" ");
//        System.out.println(driver.findElement(By.className("c_name")).getText());
//        driver.findElement(By.xpath("//p[contains(@type,'xpath')]")).getText();
//        System.out.println(driver.findElement(By.xpath("//p[contains(@type,'xpath')]")).getText());
//        driver.findElement(By.linkText("Click me to check link text")).click();
//        driver.findElement(By.id("link_text")).getText();
//        System.out.println(driver.findElement(By.id("link_text")).getText());
//        driver.navigate().back();
//        driver.findElement(By.linkText("Click me to check partial link text")).click();
//        driver.findElement(By.id("p_link_text")).getText();
//        System.out.println(driver.findElement(By.id("p_link_text")).getText());
//        driver.navigate().back();
//        driver.findElement(By.cssSelector("input[type='button']")).click();
//        driver.findElement(By.id("btn")).getText();
//        System.out.println(driver.findElement(By.id("btn")).getText());
//        driver.findElement(By.tagName("h1")).getText();
//        System.out.println(driver.findElement(By.tagName("h1")).getText());
//          driver.get("https://www.booknet.co.il/\n");
//          driver.findElement(By.id("top-search")).sendKeys("עשיר\n");
//          driver.findElement(By.name("/images/icons/search.png")).click();
//        driver.get("https://stackoverflow.com/tags");
//        List<WebElement> themes = driver.findElements(By.xpath("//a[@class='post-tag']"));
//        List<WebElement> questions = driver.findElements(By.xpath("//div[@class='mt-auto d-flex jc-space-between fs-caption fc-black-400']//div[@class='flex--item']"));
//          for (int i=0; i<themes.size(); i++) {
//               System.out.println(themes.get(i).getText() + " " + questions.get(i).getText());
//          }
//         Thread.sleep (3000);
//        driver.quit();
//        driver.get("https://www.calauto.co.il/heb/wantbuy/searchresults/");
//        List<WebElement> carYears = driver.findElements(By.xpath("//td[@class='year ng-binding']"));
//            for (int i=0; i<carYears.size(); i++) {
//                System.out.println(carYears.get(i).getText());
//                Thread.sleep(3000);
//                int year = Integer.parseInt(carYears.get(i).getText());
//                if (year > 2014){


        //    /html/body/div/img[2]
        //    /html/body/div/img[3]
        //    /html/body/div/img[4]
    /*    driver.get("http://marcojakob.github.io/dart-dnd/basic");
        WebElement draggable1 = driver.findElement(By.xpath("/html/body/div/img[1]"));
        WebElement draggable2 = driver.findElement(By.xpath("/html/body/div/img[2]"));
        WebElement draggable3 = driver.findElement(By.xpath("/html/body/div/img[3]"));
        WebElement draggable4 = driver.findElement(By.xpath("/html/body/div/img[4]"));
        WebElement droppable = driver.findElement(By.className("trash"));
        new Actions(driver).dragAndDrop(draggable1,droppable).perform();
        new Actions(driver).dragAndDrop(draggable2,droppable).perform();
        new Actions(driver).dragAndDrop(draggable3,droppable).perform();
        new Actions(driver).dragAndDrop(draggable4,droppable).perform();
        Thread.sleep(3000);
        driver.close();
        driver.quit();
     */

        // driver.get("http://danielauto.net/practice/action/multipick.html");
    /*    List<WebElement> list = driver.findElements(By.xpath("(//select[@id='city']"));
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL)
                .click(list.get(0))
                .click(list.get(4))
        .keyUp(Keys.CONTROL).perform();
    */  //************//
    /*    WebElement doubleClickElement = driver.findElement(By.id("dbl_click"));
        Actions action = new Actions(driver);
        action.doubleClick(doubleClickElement);
        action.perform();
    */  //*************//
    /*    Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.id("over"));
        builder.moveToElement(element).perform();
        WebElement element2 = driver.findElement(By.id("div1"));
        builder.moveToElement(element2).perform();
        WebElement element3 = driver.findElement(By.id("over"));
        builder.moveToElement(element3).perform();
        driver.findElement(By.id("demo2")).getText();
        System.out.print(driver.findElement(By.id("demo2")).getText());
        int sfira = Integer.parseInt (driver.findElement(By.id("demo2"));
            if (sfira == 2){
                System.out.print("The number 2 is exist in <Mouse over me> box");
            }
            else {
                System.out.print("There is no number 2");
            }
            //**********/
    /*    WebElement menu = driver.findElement(By.xpath("//*[@id='mouseover']/button"));
        Actions actions = new Actions(driver);
        actions.moveToElement(menu).perform();
        Thread.sleep(2000);
        WebElement submenu = driver.findElement(By.linkText("google"));
        System.out.print(driver.findElement(By.linkText("google")));
        Thread.sleep(2000);
        actions.click(submenu);
        actions.perform();
        Thread.sleep(2000);
        driver.close();
        driver.quit();
      */
      /*  WebElement element = driver.findElement(By.xpath("//*[@id=\"baby\"]/img"));
        new Actions(driver).scrollToElement(element).perform();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Thread.sleep(2000);
        driver.close();
        driver.quit();

       */
        //****************
        //     driver.get("https://www.supermarker.themarker.com");
        //     driver.findElement(By.id("txtSearch")).sendKeys("מחשבון");
        //    Thread.sleep(3000);

        //autocomplete


        //      WebElement ul = driver.findElement(By.cssSelector(".ui-autocomplete.ui-front.ui-menu.ui-widget.ui-widget-content"));
        //      List<WebElement>  list = ul.findElements(By.tagName("li"));
        //      list.get(1).click();

        //   List<WebElement> options = driver.findElements(By.className("ui-menu-item"));
        //   Thread.sleep(3000);
        //   for (WebElement option : options) {
        //       if ("מחשבון משכנתא".equals(option.getText().trim())) {
        //           option.click();
        //           break;

        //autocomplete


//            Thread.sleep(3000);
//            if (driver.findElement(By.xpath("//label[@for='rblSelectCalcType_0']//span[1]")).isSelected()) {
//                System.out.println("hechzer hodshi is selected");
//            }
//            Thread.sleep(2000);
//            Actions builder = new Actions(driver);
//            WebElement element = driver.findElement(By.xpath("//img[@title='לוח סילוקין שפיצר או לוח סילוקין קרן שווה']"));
//            builder.moveToElement(element).perform();
//            Thread.sleep(2000);
//            WebElement element2 = driver.findElement(By.xpath("//form[@id='aspnetForm']"));
//            builder.moveToElement(element2).perform();
//            Thread.sleep(2000);
//            driver.findElement(By.cssSelector("label[for='rblSelectKeren_1']")).click();
//            System.out.println(driver.findElement(By.xpath("//img[@title='לוח סילוקין שפיצר או לוח סילוקין קרן שווה']")).getText());
//            driver.findElement(By.id("txtLoanAmount")).clear();//ניקוי שדה
//            Thread.sleep(2000);
//            driver.findElement(By.id("txtLoanAmount")).sendKeys("500000");
//            Thread.sleep(2000);
//
//            //הזזת מכוון
//            WebElement slider = driver.findElement(By.xpath("//div[@id='sliderTerm']//span[@class='ui-slider-handle ui-state-default ui-corner-all']"));
//            for (int i = 1; i <= 5; i++) {
//                slider.sendKeys(Keys.ARROW_RIGHT);
//            }
//            //הזזת מכוון
//
//            driver.findElement(By.cssSelector("#txtInterest")).clear();
//            Thread.sleep(2000);
//            driver.findElement(By.cssSelector("#txtInterest")).sendKeys("3.75");
//            driver.findElement(By.id("ibCalc")).click();
//            driver.findElement(By.id("keren")).getText();
//            driver.findElement(By.id("txtEmail")).sendKeys(driver.findElement(By.id("keren")).getText()); //הדבקת טקסט
//            driver.findElement(By.cssSelector("#txtShemPrati")).sendKeys("רודיאון");
//            // בדיקה אם הצ'קבוקס לחוץ
//            WebElement checkBoxElement = driver.findElement(By.id("3167"));
//            Thread.sleep(5000);
//               if(!checkBoxElement.isSelected())
//                 {
//                   checkBoxElement.click();
//                   driver.findElement(By.cssSelector("#btnSendLid")).click();
//               }
//            // בדיקה אם הצ'קבוקס לחוץ
//            Thread.sleep(5000);
//        List<WebElement> error_messages = driver.findElements(By.className("error"));
//        String txt;
//        for (int i=0; i<error_messages.size(); i++) {
//            txt = error_messages.get(i).getText();
//            if (txt.equals("יש להזין כתובת מייל")) {
//                driver.findElement(By.id("txtEmail")).clear();
//                driver.findElement(By.id("txtEmail")).sendKeys("test@gmail.com");
//            }
//            else if (txt.equals("יש להזין מספר טלפון")) {
//                driver.findElement(By.id("txtTelephone")).sendKeys("054-1234567");
//            }
//            else if (txt.equals("יש לאשר את תנאי השימוש")) {
//                driver.findElement(By.id("cbTnaim")).click();
//            }
//        }
//            driver.quit();


        //****************
//        driver.get("https://www.vila4u.com");
//        driver.findElement(By.id("siteSearch")).sendKeys("וילות בצפון");
//        driver.findElement(By.xpath("//form[@id='searchBox']")).click();
//        Thread.sleep(2000);
//        Select category = new Select(driver.findElement(By.xpath("//select[@name='category']"))); //בחירת נתון מתוך קטגוריה
//        category.selectByValue("41");//בחירת נתון מתוך קטגוריה
//        driver.findElement(By.xpath("//span[contains(text(),'בחר איבזור')]")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.id("acc_81")).click();
//        driver.findElement(By.id("acc_85")).click();
//        driver.findElement(By.className("ok")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector(".submitSearch")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//div[@id='boxWrapperResults']")).getText();
//        Thread.sleep(2000);
//        System.out.print(driver.findElement(By.xpath("//div[@id='boxWrapperResults']")).getText());
//        Thread.sleep(2000);
//        driver.quit();

     /*   driver.get("https://www.vila4u.com");
        boolean a = driver.getPageSource().contains("וילה");
        int count = 0;
        while (a) {
            count ++;
        }
        System.out.println(count);

     */

    /*    driver.get("http://danielauto.net/practice/tabls/tables.html");
        int counter = 0;
        boolean a = driver.getPageSource().contains("וילה");
        while (int i = 0; i<)
        if (driver.findElement(By.xpath("//tbody/tr[1]")).equals(true));
           counter++;
           System.out.println(counter);

     */
        //שימוש ב-SIKULI
        //   driver.get("https://www.jobmaster.co.il");
        //   Screen scn=new Screen();
        //   scn.click ("C:\\Users\\Slutsky\\Desktop\\QA Automation\\Sikulix\\tfkd.png");
        //   scn.type("C:\\Users\\Slutsky\\Desktop\\QA Automation\\Sikulix\\tfkd.png", "QA");
        //   scn.click ("C:\\Users\\Slutsky\\Desktop\\QA Automation\\Sikulix\\Sbtn.png");
        //שימוש ב-SIKULI

    //    driver.get("https://www.sqlink.com/career/db/qa-\n" +
     //           "%D7%AA%D7%95%D7%9B%D7%A0%D7%94/");
    //    List<WebElement> headers = driver.findElements(By.tagName("h1"));
    //    String txt;
    //    for (int i = 0; i < headers.size(); i++) {

    //    }
    //    driver.get("https://myhealth.stanfordhealthcare.org/#/");
    //    Thread.sleep(3000);
    //    driver.findElement(ByAngular.model("id")).sendKeys("ok");
    //    driver.findElement(ByAngular.model("password")).sendKeys("ok");
    //    driver.findElement(ByAngular.buttonText("Sign")).click();



    }
}