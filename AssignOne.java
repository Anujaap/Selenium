package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssignOne {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","/home/ttn/IdeaProjects/Selenium/chromedriver/geckodriver");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.google.com");
        driver.close();
    }
}
