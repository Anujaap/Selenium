package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AssignTwe {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/Selenium/chromedriver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("file:///home/ttn/Downloads/Registration.html");
        List<WebElement> elements=driver.findElements(By.name("Demo"));
        elements.get(0).sendKeys("Anuja");
        elements.get(1).sendKeys("Pandey");
        elements.get(2).sendKeys("anuja.pandey@tothenew.com");
        driver.close();
    }
}
