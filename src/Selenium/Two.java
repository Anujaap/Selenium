package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Two {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","/home/ttn/IdeaProjects/Selenium/chromedriver/geckodriver");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        WebElement element= driver.findElement(By.id("multi-select"));
        Select dropdown=new Select(element);
        System.out.println("The Multi-Select List Demo is a multiple dropdown: "+dropdown.isMultiple());
        List<WebElement> list=dropdown.getOptions();
        System.out.println("All options are:");
        for (WebElement webElement:list){
            System.out.println(webElement.getText());
        }
        dropdown.selectByValue("New Jersey");
        dropdown.selectByValue("New York");
        dropdown.selectByValue("Texas");
        driver.findElement(By.id("printMe")).click();
        System.out.println("First selected option is:");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        driver.findElement(By.id("printAll")).click();
        List<WebElement> e=dropdown.getAllSelectedOptions();
        System.out.println("Selected option is:");
        for (WebElement wb:e) {
            System.out.println(wb.getText());
        }
        dropdown.deselectAll();
        driver.close();
    }
}
