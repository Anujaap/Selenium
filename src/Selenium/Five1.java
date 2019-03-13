package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Five1 {
    public static void main(String[] args) {
        String expected="Acid-free paper for the digital age";
        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/Selenium/chromedriver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.londonfreelance.org/courses/frames/index.html");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.switchTo().frame("navbar");
        driver.findElement(By.xpath("//a[text()='Sample content']")).click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("content");
        String actual=driver.findElement(By.xpath("//h2")).getText();
        if(expected.equals(actual)){
            System.out.println("The actual and expected header matches");
        }
        driver.close();
    }
}
