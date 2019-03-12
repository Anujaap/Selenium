package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LaunchChrome {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "/home/ttn/IdeaProjects/Selenium/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.switchTo().window("google search");


    }
}
