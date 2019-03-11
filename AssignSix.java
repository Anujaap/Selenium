package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignSix {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/Selenium/chromedriver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.tothenew.com");
        WebElement e=driver.findElement(By.xpath("//a[text()='contact us']"));
        e.click();
        System.out.println(driver.getCurrentUrl());
        driver.close();
    }
}
