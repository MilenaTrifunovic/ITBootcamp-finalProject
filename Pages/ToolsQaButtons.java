package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolsQaButtons {
	
	
	WebDriver driver;

	WebElement buttonsLabel;
	WebElement doubleClickButton;
	Actions action;
	WebElement doubleClickMessage;
	WebElement rightClickButton;
	WebElement rightClickMessage;
	WebElement clickMeButton;
	WebElement clickMeMessage;
	JavascriptExecutor js;
	WebDriverWait wdwait;

	public ToolsQaButtons(WebDriver driver) {
		
		this.driver = driver;
		action=new Actions(driver);
		this.js= (JavascriptExecutor)driver;
		this.wdwait=new WebDriverWait (driver,20);
	}

	public WebElement getButtonsLabel() {
		return driver.findElement(By.className("main-header"));
	}
	
	

	
	public WebElement getDoubleClickButton() {
		return driver.findElement(By.id("doubleClickBtn"));
	}
	
	

	
	public WebElement getDoubleClickMessage() {
		return driver.findElement(By.id("doubleClickMessage"));
	}
	
	

	
	public WebElement getRightClickButton() {
		return driver.findElement(By.id("rightClickBtn"));
	}
	
	

	
	public WebElement getRightClickMessage() {
		return driver.findElement(By.id("rightClickMessage"));
	}
	
	

	
	public WebElement getClickMeButton() {
		return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/button"));
	}
	
	

	
	public WebElement getClickMeMessage() {
		return driver.findElement(By.id("dynamicClickMessage"));
	}

	public String getButtonsText () {
		
		return this.getButtonsLabel().getText();
		
		
	}


	public void doubleClickDoubleClickButton () {
		
		action.doubleClick(getDoubleClickButton()).perform();
		
	}
	
	
	public String getDoubleClickMessageText () {
		
		return this.getDoubleClickMessage().getText();
	}
	
public void rightClickOnRightClickButton () {
	
	action.contextClick(this.getRightClickButton()).perform();
	
}

public String getRightClickMessageText () {
	
	return this.getRightClickMessage().getText();
	
}

public void clickOnClickMeButton () {
	js.executeScript("arguments[0].scrollIntoView(true);", this.getClickMeButton());
	wdwait.until(ExpectedConditions.elementToBeClickable(this.getClickMeButton()));
	
	this.getClickMeButton().click();
		
}

public String getClickMeMessageText () {
	
	
	return this.getClickMeMessage().getText();
}

}
