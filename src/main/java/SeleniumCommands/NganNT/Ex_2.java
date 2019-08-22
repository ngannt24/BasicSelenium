package SeleniumCommands.NganNT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex_2 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		// Ex2: open link
		String driverExecutablePath = "C:\\Users\\New_Men\\workspace\\BasicSelenium\\src\\test\\resources\\executables\\geckodriver.exe";

		System.setProperty("webdriver.gecko.driver", driverExecutablePath);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form");

		// Click Accept button using xpath
//		driver.findElement(By.xpath("//a[@id='cookie_action_close_header']")).click();
//		Thread.sleep(2000);

		// Click Partial Link Text using Partial Link Text locator
		driver.findElement(By.partialLinkText("Partial Link Test")).click();
		Thread.sleep(2000);

		// Get text of Partial Link Text
		String textLink = driver.findElement(By.xpath("//a[@title='Automation Practice Form']")).getText();
		System.out.println("Text of Partial Link Text: " + textLink);
		Thread.sleep(2000);

		// Click Link Text using Link Text locator
		driver.findElement(By.xpath("//a[@title='Automation Practice Table']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		String textOfLink = driver.findElement(By.xpath("//a[@title='Automation Practice Table']")).getText();
		System.out.println("Text of link text: " + textOfLink);
		Thread.sleep(2000);

		// Input your first name in First Name textbox (using name locator)
		driver.findElement(By.name("firstname")).sendKeys("Ngân");
		Thread.sleep(2000);

		// Input your last name in Last Name textbox (using id locator)
		driver.findElement(By.id("lastname")).sendKeys("Nguyễn");
		Thread.sleep(2000);

		// Click Simple Button using xpath locator
		driver.findElement(By.xpath("//button[@id='buttonwithclass']")).click();
		Thread.sleep(2000);

		// Get text of Simple Button
		String textButton = driver.findElement(By.xpath("//button[@id='buttonwithclass']")).getText();
		System.out.println("Text of Simple button: " + textButton);

		driver.close();
	}

}
