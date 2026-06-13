import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XpathLocators {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        LocateElementsByXpath(driver);
//        Loginfunctionality(driver);
//        LocateElementsByPredicates(driver);
//        LocateElementsByAxes(driver);
        LocateElementsByXathFunctions(driver);
        LocateElementsByOperators(driver);
    }

    private static void LocateElementsByOperators(WebDriver driver) {
        Loginfunctionality(driver);
        driver.findElement(By.xpath("//a[contains(@href, 'linkedin') or text() = 'LinkedIn']")).click();
        driver.findElement(By.xpath("//button[contains(@class,'btn_inventory ') and contains(@id,'onesie') ]")).click();
    }

    private static void LocateElementsByXathFunctions(WebDriver driver) {
        Loginfunctionality(driver);
//        List<WebElement> priceList = driver.findElements(By.xpath("//div[contains(@class, 'item_price')]"));
//        for (WebElement price : priceList) {
//            System.out.println(price.getText());
//        }
        driver.findElement(By.xpath("//div[text() = 'Sauce Labs Fleece Jacket']/following::button[1]")).click();
        driver.findElement(By.xpath("//img[starts-with(@alt,'Test')]/following::button")).click();
    }

    private static void LocateElementsByAxes(WebDriver driver) {
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        System.out.println(driver.findElement(By.xpath("//table[@id = 'customers']//child::tr[5]/child::td[2]")).getText());
        System.out.println(driver.findElement(By.xpath("//table[@id = 'customers']/descendant::th[2]")).getText());
        System.out.println(driver.findElement(By.xpath("//table[@id = 'customers']/descendant::th[2]/parent::tr")).getTagName());
        System.out.println(driver.findElement(By.xpath("//table[@id = 'customers']//child::tr[5]/child::td[2]/ancestor::table")).getAttribute("class"));
        System.out.println(driver.findElement(By.xpath("//table[@id = 'customers']//child::tr[5]/child::td[2]/preceding-sibling::td")).getText());
        System.out.println(driver.findElement(By.xpath("//table[@id = 'customers']//child::tr[5]/child::td[2]/following-sibling::td")).getText());
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
