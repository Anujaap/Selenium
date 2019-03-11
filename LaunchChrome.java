package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LaunchChrome {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/Selenium/chromedriver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("file:///home/ttn/Downloads/DemoPage.html");
        driver.manage().window().maximize();

        driver.findElement(By.id("FName")).sendKeys("anuja");
        System.out.println(driver.findElement(By.id("FName")).getAttribute("value"));
        WebElement e=driver.findElement(By.xpath("//a[text()='Great Place to Learn- w3schools']"));
        List<WebElement> elements=driver.findElements(By.xpath("//a[text()='Great Place to Learn- w3schools']"));
        System.out.println(elements.size());
        for (WebElement w:elements) {
            System.out.println(w);
        }
        elements.get(1).click();
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        Thread.sleep(2000);
        e.click();
        driver.close();
    }
}
