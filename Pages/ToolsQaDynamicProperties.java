package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToolsQaDynamicProperties {

	
	
WebDriver driver;
	
	WebElement DynamicPropertiesLabel;

	public ToolsQaDynamicProperties(WebDriver driver) {
		
		this.driver = driver;
	}

	public WebElement getDynamicPropertiesLabel() {
		return driver.findElement(By.className("main-header"));
	}
	
	public String getDynamicPropertiesText () {
		
		return this.getDynamicPropertiesLabel().getText();
		
		
		
	}
	
	
	
	
	
}
