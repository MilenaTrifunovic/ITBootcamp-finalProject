package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToolsQaDynamicProperties {

	
	
WebDriver driver;
	
	WebElement DynamicPropertiesLabel;
	WebElement enableAfter5Sec;
	WebElement changeColorButton;
	

	public ToolsQaDynamicProperties(WebDriver driver) {
		
		this.driver = driver;
	}

	public WebElement getDynamicPropertiesLabel() {
		return driver.findElement(By.className("main-header"));
	}
	
	public WebElement getEnableAfter5Sec () {
		
		return driver.findElement(By.id("enableAfter"));
	}
	
	public WebElement getChangeColorButton () {
		
		return driver.findElement(By.id("colorChange"));
	}
	
	public String getDynamicPropertiesText () {
		
		return this.getDynamicPropertiesLabel().getText();
		
		
		
	}
	
  
	
	
	
}
