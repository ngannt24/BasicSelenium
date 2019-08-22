package SeleniumCommands.NganNT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Ex_3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// Ex3: open link
		String driverExecutablePath = "C:\\Users\\New_Men\\workspace\\BasicSelenium\\src\\test\\resources\\executables\\geckodriver.exe";

		System.setProperty("webdriver.gecko.driver", driverExecutablePath);
		WebDriver driver = new FirefoxDriver();

		Thread.sleep(3000);
		driver.get("https://www.toolsqa.com/automation-practice-form");
		Thread.sleep(2000);

		// scroll
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// To maximize the window. This code may not work with Selenium 3 jars. If
		// script fails you can remove the line below
		driver.manage().window().maximize();

		// This will scroll down the page by 1000 pixel vertical
		js.executeScript("window.scrollBy(0,900)");

		// Select Male and Female
		driver.findElement(By.id("sex-0")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("sex-1")).click();
		Thread.sleep(3000);

		// Select Year of Experience from 1 to 7
		driver.findElement(By.id("exp-0")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("exp-1")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("exp-2")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("exp-3")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("exp-4")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("exp-5")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("exp-6")).click();
		Thread.sleep(3000);

		driver.close();
	}

}
