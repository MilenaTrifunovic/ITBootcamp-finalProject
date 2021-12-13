package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToolsQaFormsPage {

	
	WebDriver driver;
	WebElement formsLabel;

	public ToolsQaFormsPage(WebDriver driver) {
		
		this.driver = driver;
	}

	public WebElement getFormsLabel() {
		return driver.findElement(By.cssSelector(".pattern-backgound.playgound-header"));
	}


	public String getFormsText () {
		
		return this.getFormsLabel().getText();
		
	}
	
	
	
	
	
	
}
