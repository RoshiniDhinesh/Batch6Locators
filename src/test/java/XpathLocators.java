import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        LocateElementsByXpath(driver);
//        Loginfunctionality(driver);
        LocateElementsByPredicates(driver);

    }

    private static void Loginfunctionality(WebDriver driver) {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//input[@id = 'user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id = 'login-button']")).click();
    }

    private static void LocateElementsByPredicates(WebDriver driver) {
        Loginfunctionality(driver);
        WebElement predicate = driver.findElement(By.xpath("//div[@class = 'inventory_list']/div[position() = 3]//button"));
        predicate.click();
        WebElement predicate2 = driver.findElement(By.xpath("//div[@class = 'inventory_list']/div[last()]//button"));
        predicate2.click();
    }

    private static void LocateElementsByXpath(WebDriver driver) {
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[6]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/textarea[1]")).sendKeys("webdriver");
        WebElement relativexpath1 = driver.findElement(By.xpath("//textarea[@class = 'gLFyf']"));
        relativexpath1.sendKeys("Selenium WebDriver");
        WebElement relativexpath2 = driver.findElement(By.xpath("/html[1]/body[1]//form[1]//textarea[1]"));
        relativexpath2.sendKeys("Selenium WebDriver");
        WebElement realtivexpath3 = driver.findElement(By.xpath("//form[1]//textarea"));
        realtivexpath3.sendKeys("Selenium WebDriver");
        WebElement relativexpath4 = driver.findElement(By.xpath("//div[@class = 'a4bIc']/textarea"));
        relativexpath4.sendKeys("Selenium WebDriver");
    }

}
