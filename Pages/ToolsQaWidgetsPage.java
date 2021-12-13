package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToolsQaWidgetsPage {
	
	
	WebDriver driver;

	WebElement widgetsLabel;

	public ToolsQaWidgetsPage(WebDriver driver) {
		
		this.driver = driver;
	}

	public WebElement getWidgetsLabel() {
		return driver.findElement(By.cssSelector(".pattern-backgound.playgound-header"));
	}

	public String getWidgetsText () {
		
		return this.getWidgetsLabel().getText();
	}
	
	
	

}
