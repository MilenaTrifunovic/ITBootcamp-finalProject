package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToolsQaInteractions {
	
	WebDriver driver;
	WebElement InteractionsLabel;

	public ToolsQaInteractions(WebDriver driver) {
		
		this.driver = driver;
	}

	public WebElement getInteractionsLabel() {
		return  driver.findElement(By.cssSelector(".pattern-backgound.playgound-header"));
	}
	
	public String getInteractionsText () {
		
		return this.getInteractionsLabel().getText();
	}
	
	
	
	
	

}
