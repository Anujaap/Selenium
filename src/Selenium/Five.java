package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Five {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","/home/ttn/IdeaProjects/Selenium/chromedriver/geckodriver");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://demo.automationtesting.in/Frames.html");
        System.out.println("Number of iframes "+driver.findElements(By.xpath("//iframe")).size());

        driver.close();
    }
}
