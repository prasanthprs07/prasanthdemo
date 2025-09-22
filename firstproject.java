package testjava;

import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.Scanner;

import org.openqa.selenium.*;		

public class firstproject {				
    public static void main(String[] args) throws InterruptedException {									
    		
    	// declaration and instantiation of objects/variables		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Green\\Desktop\\Files\\chromedriver_win32\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();					
        		
        String baseUrl = "https://ai.piraiinfo.com/";					
        driver.get(baseUrl);					
	
        WebElement email = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/main/div/div[1]/div[2]/form/div/input"));							
        Thread.sleep(1000);


        WebElement email = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/main/div/div[1]/div[2]/form/div/input"));							
        Thread.sleep(1000);

		   WebElement email = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/main/div/div[1]/div[2]/form/div/input"));							
        Thread.sleep(1000);

		   WebElement email = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/main/div/div[1]/div[2]/form/div/input"));							
        Thread.sleep(1000);

		   WebElement email = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/main/div/div[1]/div[2]/form/div/input"));							
        Thread.sleep(1000);




        WebElement email = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/main/div/div[1]/div[2]/form/div/input"));							
        Thread.sleep(1000);

        
        email.sendKeys("prasandprs07@gmail.com");	
        
        WebElement sendOtp = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/main/div/div[1]/div[2]/form/button"));
        
        sendOtp.click();
        Thread.sleep(3000);	
        
        WebElement otp = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/main/div/div[1]/div[2]/form/div/input"));							
        Thread.sleep(2000);	
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter otp: ");
        String otpNo = s.next();
        
        Thread.sleep(2000);	
        otp.sendKeys(otpNo);	
        
        Thread.sleep(1000);	
        //Validate Otp
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/main/div/div[1]/div[2]/form/button")).click();

        Thread.sleep(1000);
        
        String heading = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/main/div/div/main/div/div/div/div/h1")).getText();
        System.out.println(heading);
        
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/main/div/div/main/div/div/section/div/div[1]/a/div/div/div/div/div[1]")).click();
        
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/aside/ul/li[2]")).click();
        
        Thread.sleep(1000);
        
        String verifyClickedText = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div/main/div/h2")).getText();
        
        Thread.sleep(2000);
        
        String ActualText = "R1 - Actual vs Predicted (January 01 - April 16, 2024)";
        
        Thread.sleep(2000);
        
        if(verifyClickedText.equals(ActualText))
        	
        {
        	System.out.println(ActualText+" data is getting displayed");
        }
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/div/nav/a[2]/div/button")).click();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/main/div/div/main/div/div/section/div/div[2]/a/div/div/div/div/div[1]")).click();
        
        Thread.sleep(1000);
        
        WebElement uploadField = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/main/div/div[2]/form/div/div[2]/div[1]/span/input"));
        
        Thread.sleep(2000);
        
        uploadField.sendKeys("C:\\Users\\Green\\Documents\\10th.jpg");
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/main/div/div[2]/form/div/div[2]/div[2]/div[2]/div/div[2]/button")).click();
        
        Thread.sleep(2000);
        
        String testUploadText =  driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/main/div/div[2]/form/div/div[2]/div[2]")).getText();
        
        System.out.println(testUploadText);
        
        if(testUploadText.equals("Drag and drop files to here to upload."))
        {
        	System.out.println("Removed the upload file");
        }
        
        
        driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/nav/a[4]/div/button")).click();
        
        Thread.sleep(2000);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        js.executeScript("window.scrollBy(0,350)");
        
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/main/div/div/main/div/div/section/div/div[7]/a/div/div/div/div/div[1]")).click();
        
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/div/nav/a[3]/div/button")).click();
       
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/main/div/div/main/div/div/section/div/div[3]/a/div/div/div/div")).click();
        
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div/main/div/form/div/div[1]/div[6]/button")).click();
        
        Thread.sleep(1000);
        
        String testEduPage = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div/main/div/div")).getText();
        
        System.out.println(testEduPage);
        
        Thread.sleep(1000);
        
        if(testEduPage.equals("")) {
        	System.out.println("empty filter and clicked generate doesn't produced the result");
        }
    }		
}
