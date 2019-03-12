package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignfour1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/Selenium/chromedriver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.tothenew.com");
        driver.findElement(By.id("h-contact-us")).click();
        driver.close();
    }
}
