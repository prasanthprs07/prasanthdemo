package servicedeskpackage;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class DataDrivenAdduser {

	private static WebDriver driver;

	public static void openServiceDeskPage() {
		try { // Try-catch block to handle exceptions
			
			driver.findElement(
					By.xpath("//*[@id=\"addUserManage\"]/div/div/div/div[2]/div[2]/div/div/div/div[2]/button")).click();
			Thread.sleep(5000); // Allow action to complete
		} catch (WebDriverException | InterruptedException e) {
			System.out.println("Error adding user: " + e.getMessage());
		}
	}

	// Main method
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PST20171107\\Desktop\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver(); // Create a new instance of ChromeDriver
		driver.manage().window().maximize(); // Maximize the browser window
		addUsersFromExcel("C:\\Users\\PST20171107\\Downloads\\Sample Template (19).xlsx");
	}

}
