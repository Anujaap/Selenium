package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class One {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","/home/ttn/IdeaProjects/Selenium/chromedriver/geckodriver");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
        driver.switchTo().alert().dismiss();

        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
        driver.switchTo().alert().sendKeys("Anuja");
        driver.switchTo().alert().accept();
        System.out.println(driver.findElement(By.id("prompt-demo")).getText());
        driver.close();
    }
}
