package SeleniumCommands.NganNT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ex1: Open link

		String driverExecutablePath = "C:\\Users\\New_Men\\workspace\\BasicSelenium\\src\\test\\resources\\executables\\geckodriver.exe";

		System.setProperty("webdriver.gecko.driver", driverExecutablePath);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form");

		// Get title, title length and print
		String title = driver.getTitle();
		System.out.println("Title of page: " + title);
		int titleLength = driver.getTitle().length();
		System.out.println("Title length: " + titleLength);

		// Get url and verify
		String url = driver.getCurrentUrl();
		System.out.println("Link of page: " + url);
		if (url.contains("https://www.toolsqa.com/automation-practice-form")) {
			System.out.println("Đường link đã đúng");
		} else {
			System.out.println("Đường link không đúng");
		}

		// Get page source and length
		String pageSource = driver.getPageSource();
		int lengtPageSource = pageSource.length();
		// Print length of page source
		System.out.println("Length of page source: " + lengtPageSource);

		driver.close();
	}

}
