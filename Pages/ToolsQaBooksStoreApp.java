package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToolsQaBooksStoreApp {
	
	WebDriver driver;
	WebElement booksStoreAppLabel;

	public ToolsQaBooksStoreApp(WebDriver driver) {
		
		this.driver = driver;
	}

	public WebElement getBooksStoreAppLabel() {
		return driver.findElement(By.className("main-header"));
	}


	public String getBooksStoreAppText () {
		
		return this.getBooksStoreAppLabel().getText();
		
		
		
	}



	
	
	
	
	
	

}
