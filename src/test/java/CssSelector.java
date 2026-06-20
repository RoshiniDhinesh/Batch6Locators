import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CssSelector {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

//        LocateElementsByCssSelector(driver);
//        LocateByidwithCssSelector(driver);
//        LocateByClasswithCssSelector(driver);
//        LocateBydifferentCssSelector(driver);
        LocateByCombiningCssSelector(driver);
        goToCartPAge(driver);

    }

    private static void goToCartPAge(WebDriver driver) {
        driver.findElement(By.cssSelector("a.shopping_cart_link")).click();
    }

    private static void LocateByCombiningCssSelector(WebDriver driver) {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.cssSelector("input#user-name[placeholder = 'Username']")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("input.form_input[placeholder='Password']")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("input#login-button")).click();
        driver.findElement(By.cssSelector("div.inventory_list>div:nth-child(2) button")).click();
        driver.findElement(By.cssSelector("button[id $= 'onesie']")).click();
        driver.findElement(By.cssSelector("button[id ^= 'add-to-cart-test']")).click();
        driver.findElement(By.cssSelector("button[id *= 'bolt']")).click();
    }

    private static void LocateBydifferentCssSelector(WebDriver driver) {
        driver.get("https://ultimateqa.com/simple-html-elements-for-automation");
        driver.findElement(By.cssSelector("button[name = 'button1']")).click();
        driver.findElement(By.cssSelector("[name = 'button1']")).click();
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
