package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToolsQaAlertsFrameWindowsPage {

	WebDriver driver;
	WebElement alertsFrameWindowsLabel;

	public ToolsQaAlertsFrameWindowsPage(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getAlertsFrameWindowsLabel() {
		return driver.findElement(By.cssSelector(".pattern-backgound.playgound-header"));
	}


	public String getAlertsFrameWindowsText () {
		
		return getAlertsFrameWindowsLabel().getText();
		
	}
	
	
	
	
}
