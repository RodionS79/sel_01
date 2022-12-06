package sel_01;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class pomModel {
    @FindBy (how = How.XPATH, using = "//input[@id='searchTxt']")
    static WebElement search_field;
    @FindBy (how = How.ID, using = "Button1")
    static WebElement search_button;
    @FindBy (how = How.XPATH, using = "//*[@id=\"serachResults\"]/option[1]")
    static WebElement bread_list1;
    @FindBy (how = How.XPATH, using = "//*[@id=\"serachResults\"]/option[@value='-1']")
    static WebElement no_food_try_again;
    @FindBy (how = How.XPATH, using = "//input[@id='quantity']")
    static WebElement quantity;
    @FindBy (how = How.XPATH, using = "//*[@id=\"serachResults\"]/option[4]")
    static WebElement olive_bread;
    @FindBy (how = How.XPATH, using = "//input[@value='הוסף']")
    static WebElement add;

}
