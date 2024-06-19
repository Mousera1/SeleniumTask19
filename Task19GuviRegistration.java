package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task19GuviRegistration {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.guvi.in/register");
        driver.findElement(By.id("name")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Test@demo.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("testtesttest1");
        WebElement element = driver.findElement(By.className("countrycode-left"));
        element.sendKeys("9449090909");
        WebElement signUp = driver.findElement(By.linkText("Sign Up"));
        signUp.click();
        


	}

}
