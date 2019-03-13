package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Four {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","/home/ttn/IdeaProjects/Selenium/chromedriver/geckodriver");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://demo.automationtesting.in/Frames.html");
        driver.switchTo().frame("SingleFrame");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Anuja");

        driver.switchTo().defaultContent();

        driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Anuja");
        driver.close();
    }
}
