import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        LocateElementsByCssSelector(driver);
        LocateByidwithCssSelector(driver);
        LocateByClasswithCssSelector(driver);
    }

    private static void LocateByClasswithCssSelector(WebDriver driver) {
        driver.get("https://ultimateqa.com/simple-html-elements-for-automation");
        driver.findElement(By.cssSelector("button[class = 'buttonClass']")).click();
        driver.findElement(By.cssSelector("button.buttonClass")).click();
        driver.findElement(By.cssSelector(".buttonClass")).click();
    }

    private static void LocateByidwithCssSelector(WebDriver driver) {
        driver.get("https://ultimateqa.com/simple-html-elements-for-automation");
        driver.findElement(By.cssSelector("a[id = 'idExample']")).click();
        driver.findElement(By.cssSelector("a#idExample")).click();
        driver.findElement(By.cssSelector("#idExample")).click();
    }

    private static void LocateElementsByCssSelector(WebDriver driver) {
        driver.get("https://www.google.com/");
        driver.findElement(By.cssSelector("textarea[class = 'gLFyf']")).sendKeys("Selenium WebDriver");
    }
}
