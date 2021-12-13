package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToolsQaCheckBox {
	
	
	WebDriver driver;
	WebElement checkBoxLabel;
	WebElement homeCheckBox;
	WebElement arrowHomeCheckBox;
	WebElement desktopSubCheckboxUnchecked;//element koji nam služi kod Asserta u testu, da potvrdimo da Desktop nije èekiran
	WebElement desktopSubCheckboxChecked;//element koji se pojavljuje kad èekiramo Desktop checkbox, i sa njim radimo drugi Assert kao potvrdu 
	WebElement desktopSubCheckbox;//za ovaj element mora da se koristi xpath, jer kada se koristi bilo koji drugi lokator, èekira se cela Home podlista
	WebElement arrowDesktopCheckBox;
	WebElement noteSubCheckbox;
	
	
	
	
	public ToolsQaCheckBox(WebDriver driver) {
		
		this.driver = driver;
	}
	public WebElement getCheckBoxLabel() {
		return driver.findElement(By.className("main-header"));
	}
    
	

	public WebElement getHomeCheckBox() {
		return driver.findElement(By.className("rct-checkbox"));
	}
	
	
	
	public WebElement getArrowHomeCheckBox() {
		return driver.findElement(By.cssSelector(".rct-collapse.rct-collapse-btn"));
	}
	
	
	public WebElement getDesktopSubCheckboxChecked() {
		return driver.findElement(By.cssSelector(".rct-icon.rct-icon-check"));
	}
	
	
	public WebElement getDesktopSubCheckboxUnchecked() {
		return driver.findElement(By.cssSelector(".rct-icon.rct-icon-uncheck"));
	}
	
	
	public WebElement getDesktopSubCheckbox() {
		return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[3]"));
	}
	
	
	public WebElement getArrowDesktopCheckBox() {
		return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button"));
	}
	
	
	public WebElement getNoteSubCheckbox() {
		return driver.findElement(By.cssSelector(".rct-node.rct-node-leaf"));
	}
	public String getCheckBoxText () {
		
		return this.getCheckBoxLabel().getText();
		
	}

    public void clickHomeCheckbox() {
    	
    	this.getHomeCheckBox().click();
    	
    }
	
	public void clickArrowHomeCheckbox() {
		
		this.getArrowHomeCheckBox().click();
		
	}
	
	public void clickDesktopSubCheckbox () {
		
		this.getDesktopSubCheckbox().click();
		
		
	}
	
	public void clickDesktopArrow() {
		
		this.getArrowDesktopCheckBox().click();
		
	}

}
