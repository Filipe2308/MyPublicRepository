// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;



public class BuyingSummerDressAndRegistration {
	
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  
  
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  
  
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  
  
  public void summerDressByuingAndRegistration() {
	
	  String url = "http://automationpractice.com/index.php"; 
	  String email = "testeriduuii33@gmail.com";
	  String password="Passw0rd444";
	  String firstName = "Testeruser";
	  String lastName ="Someid";
	  String company="SomeidINC";
	  String address="77 Broadway";
	  String city="Buffalo";
	  String postCode="14203";
	  String phone="16552038888";
	  
    driver.get(url);
    {
      WebElement element = driver.findElement(By.xpath("//a[contains(text(),\'Women\')]"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.xpath("//a[contains(text(),\'Summer Dresses\')]")).click();
    driver.findElement(By.xpath("(//img[@alt=\'Printed Summer Dress\'])[2]")).click();
    driver.findElement(By.xpath("//p[@id=\'add_to_cart\']/button/span")).click();
    {
      WebElement element = driver.findElement(By.xpath("(//img[@alt=\'Printed Summer Dress\'])[3]"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    
    
    driver.findElement(By.xpath("//span[contains(.,\'Proceed to checkout\')]")).click();
    driver.findElement(By.cssSelector(".standard-checkout > span")).click();
    driver.findElement(By.xpath("//input[@id=\'email_create\']")).click();
    driver.findElement(By.id("email_create")).sendKeys(email);
    driver.findElement(By.xpath("//button[@id=\'SubmitCreate\']/span")).click();
    driver.findElement(By.xpath("//input[@id=\'id_gender1\']")).click();
    driver.findElement(By.xpath("//input[@id=\'customer_firstname\']")).sendKeys(firstName);
    driver.findElement(By.xpath("//input[@id=\'customer_lastname\']")).sendKeys(lastName);
    driver.findElement(By.xpath("//input[@id=\'passwd\']")).sendKeys(password);
    {
      WebElement dropdown = driver.findElement(By.id("days"));
      dropdown.findElement(By.xpath("//option[. = 'regexp:7\\s+']")).click();
    }
    {
      WebElement dropdown = driver.findElement(By.id("months"));
      dropdown.findElement(By.xpath("//option[. = 'regexp:September\\s']")).click();
    }
    {
      WebElement dropdown = driver.findElement(By.id("years"));
      dropdown.findElement(By.xpath("//option[. = 'regexp:1998\\s+']")).click();
    }
    driver.findElement(By.id("years")).click();
    driver.findElement(By.id("company")).sendKeys(company);
    driver.findElement(By.id("address1")).sendKeys(address);
    driver.findElement(By.id("city")).sendKeys(city);
    {
      WebElement dropdown = driver.findElement(By.id("id_state"));
      dropdown.findElement(By.xpath("//option[. = 'New York']")).click();
    }
    driver.findElement(By.id("postcode")).sendKeys(postCode);
    driver.findElement(By.xpath("//input[@id=\'phone\']")).sendKeys(phone);
    driver.findElement(By.xpath("//button[@id=\'submitAccount\']/span")).click();
    driver.findElement(By.xpath("//div[@id=\'center_column\']/form/p/button/span")).click();
    driver.findElement(By.id("cgv")).click();
    driver.findElement(By.xpath("//form[@id=\'form\']/p/button/span")).click();
  }
}
