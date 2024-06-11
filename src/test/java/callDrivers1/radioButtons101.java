package callDrivers1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import practice101drivers.makeDrivers;

public class radioButtons101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an instance of the makeDrivers class
				makeDrivers callDriver = new makeDrivers();

				// Call the setupBrowser method to initialize the driver
				callDriver.setupBrowser("chrome", "https://www.automationtesting.co.uk/dropdown.html");

				// Define WebDriverWait with a timeout of 10 seconds
				WebDriverWait wait = new WebDriverWait(callDriver.getDriver(), Duration.ofSeconds(20));

		        // Wait for the contactUs element to be clickable make separate class
		        WebElement radioButton1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'One')]")));
		        
		        // Click on the contactUs element
		        radioButton1.click();
		        
		        // Wait for the contactUs element to be clickable make separate class
		        WebElement radioButton2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'Two')]")));
		        radioButton2.click();		        
		        
		        // Wait for the contactUs element to be clickable make separate class
		        WebElement radioButton3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'Three')]")));
		        radioButton3.click();

	}

}