import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        LocateElementsByID(driver);
//        LocateElementsByName(driver);
//        LocateElementsByClassName(driver);
//        LocateElementsByTagName(driver);
//        LocateElementsByLinkText(driver);

    }
    private static void LocateElementsByLinkText(WebDriver driver) throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading");
        driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Example 2")).click();
    }

    private static void LocateElementsByTagName(WebDriver driver) {
        driver.get("https://the-internet.herokuapp.com/inputs");
        driver.findElement(By.tagName("input")).sendKeys("6");
    }

    private static void LocateElementsByClassName(WebDriver driver) throws InterruptedException {
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        List<WebElement> text_area = driver.findElements(By.className("form-control"));
        System.out.println(text_area.size());
        Thread.sleep(2000);
        driver.quit();
    }

    private static void LocateElementsByName(WebDriver driver) {
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Selenium WebDriver");
    }

    private static void LocateElementsByID(WebDriver driver) throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.findElement(By.id("APjFqb")).sendKeys("Selenium WebDriver");
    }

    }
