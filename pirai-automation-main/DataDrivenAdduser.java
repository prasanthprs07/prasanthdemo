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
			Thread.sleep(2000); // Wait for 1 second
			// Open the specified URL in the browser
			driver.get("http://laudea.test.psgst.psgtech.ac.in/service-desk-ui/dashboard");

			
			Thread.sleep(2000); // Wait for 1 second
			
			// Locate the username input field and enter "sysadmin"
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			// Wait until the username field is v isible on the page
			WebElement usernameField = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"username\"]")));


// Locate the username input field and enter "sysadmin"
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			// Wait until the username field is v isible on the page
			WebElement usernameField = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"username\"]")));

// Locate the username input field and enter "sysadmin"
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			// Wait until the username field is v isible on the page
			WebElement usernameField = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"username\"]")));

// Locate the username input field and enter "sysadmin"
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			// Wait until the username field is v isible on the page
			WebElement usernameField = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"username\"]")));

// Locate the username input field and enter "sysadmin"
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			// Wait until the username field is v isible on the page
			WebElement usernameField = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"username\"]")));

			// Enter the username "sysadmin" into the field
			usernameField.sendKeys("sysadmin");
			Thread.sleep(1000); // Wait for 1 second

			// Locate the password input field and enter "a"
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("a");
			Thread.sleep(1000); // Wait for 1 second

			// Locate and click the login button
			driver.findElement(By.xpath("//*[@id=\"kc-login\"]")).click();
			Thread.sleep(1000); // Wait for 1 second

			// Navigate to the dashboard link
			driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")).click();
			Thread.sleep(1000); // Wait for 1 second
			
			// Locate and click the import section link
			driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a")).click();
			Thread.sleep(1000); // Wait for 0.5 seconds

			// Locate and click the import button
			driver.findElement(By.xpath("//*[@id=\"section\"]/div/div[2]/div/div[1]/div/div/button[1]")).click();
			Thread.sleep(1000); // Wait for 0.5 seconds
		} catch (InterruptedException e) { // Catch block to handle exceptions
			// Print an error message if an exception occurs
			System.out.println("An error occurred while loading the page: " + e.getMessage());
		}
	}

	// Method to add multiple users from an Excel file
	public static void addUsersFromExcel(String filePath) {
		try (FileInputStream file = new FileInputStream(filePath); Workbook workbook = new XSSFWorkbook(file)) {
			Sheet sheet = workbook.getSheetAt(0); // Get the first sheet
			int rowCount = sheet.getPhysicalNumberOfRows();

			for (int i = 1; i < rowCount; i++) { // Start from 1 to skip the header
				Row row = sheet.getRow(i);
				String userId = row.getCell(0).getStringCellValue();
				String userName = row.getCell(1).getStringCellValue();
				String department = row.getCell(2).getStringCellValue();
				String designation = row.getCell(3).getStringCellValue();
				String memberType = row.getCell(4).getStringCellValue();
				String email = row.getCell(5).getStringCellValue();
				String contactNo = row.getCell(6).getStringCellValue()  ;

				addUser(userId, userName, department, designation, memberType, email, contactNo);
			}
		} catch (IOException e) {
			System.out.println("Error reading Excel file: " + e.getMessage());
		}
	}

	// Method to add a single user
	public static void addUser(String userId, String userName, String department, String designation, String memberType,
			String email, String contactNo) {
		try {
			Thread.sleep(1000); // Wait for 1 second
			driver.findElement(By.xpath("//*[@id=\"section\"]/div/div[2]/div/div[1]/div/div/button[2]")).click();
			Thread.sleep(3000); // Close import section

			driver.findElement(By.xpath("//*[@id=\"userId\"]")).sendKeys(userId);
			Thread.sleep(500);

			driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(userName);
			Thread.sleep(500);

			driver.findElement(By.xpath("//*[@id=\"department\"]/div/div[1]/div[2]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//*[@id=\"react-select-5-input\"]")).sendKeys(department);
			Thread.sleep(500);
			driver.findElement(By.xpath("//*[@id=\"react-select-5-input\"]")).sendKeys(Keys.ENTER);

			driver.findElement(By.xpath("//*[@id=\"designation\"]/div/div[1]/div[2]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//*[@id=\"react-select-6-input\"]")).sendKeys(designation);
			Thread.sleep(500);
			driver.findElement(By.xpath("//*[@id=\"react-select-6-input\"]")).sendKeys(Keys.ENTER);

			driver.findElement(By.xpath("//*[@id=\"memberType\"]/div/div[1]/div[2]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//*[@id=\"react-select-7-input\"]")).sendKeys(memberType);
			Thread.sleep(500);
			driver.findElement(By.xpath("//*[@id=\"react-select-7-input\"]")).sendKeys(Keys.ENTER);

			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
			Thread.sleep(500);

			driver.findElement(By.xpath("//*[@id=\"contactNo\"]")).sendKeys(contactNo);
			Thread.sleep(500);

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
