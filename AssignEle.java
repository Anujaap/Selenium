package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignEle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/Selenium/chromedriver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("file:///home/ttn/Downloads/Registration.html");
        driver.findElement(By.xpath("//*[@ng-model='FirstName']")).sendKeys("Anuja");
        driver.findElement(By.xpath("//*[@ng-model='LastName']")).sendKeys("Pandey");
        driver.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys("Arun Vihar, Noida");
        driver.findElement(By.xpath("//*[@ng-model='EmailAdress']")).sendKeys("anuja.pandey@tothenew.com");
        driver.findElement(By.xpath("//*[@ng-model='Phone']")).sendKeys("9739908331");
        driver.findElements(By.xpath("//*[@ng-model='radiovalue']")).get(1).click();
        driver.findElement(By.id("checkbox2")).click();
        driver.findElement(By.xpath("//*[@ng-model='Password']")).sendKeys("asdfghjkl");
        driver.findElement(By.xpath("//*[@ng-model='CPassword']")).sendKeys("asdfghjkl");
        System.out.println("The reset button is enabled:"+ driver.findElement(By.id("Button1")).isEnabled());
        System.out.println("The female gender option is selected:"+ driver.findElements(By.xpath("//*[@ng-model='radiovalue']")).get(1).isSelected());
        System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Automation Demo Site')]")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Register')]")).isDisplayed());
        driver.close();

    }
}
