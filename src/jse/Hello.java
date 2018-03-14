package jse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Hello {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:/selenium/selenium jar v3.5.0, gecko v0.18.0, firefor v54/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[@id='bluemenu']/ul/li[2]/a"))).perform();
		Thread.sleep(2000);
		driver.close();
	}

}
