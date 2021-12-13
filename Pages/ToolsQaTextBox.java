package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolsQaTextBox {

	WebDriver driver;
	WebDriverWait wdwait;
	JavascriptExecutor js;
	WebElement textBoxLabel;
	WebElement fullNameTextBox;
	WebElement userEmailTextBox;
	WebElement currentAddressTextBox;
	WebElement permanentAddressTextBox;
	WebElement submitButton;
	WebElement outputTextBox;

	public ToolsQaTextBox(WebDriver driver) {
		
		this.driver = driver;
		this.js=(JavascriptExecutor)driver;
		this.wdwait=new WebDriverWait (driver,20);
	}

	public WebElement getTextBoxLabel() {
		return driver.findElement(By.className("main-header"));
	}
	
	
	
	public WebElement getFullNameTextBox() {
		return driver.findElement(By.id("userName"));
	}
	
	

	public WebElement getUserEmailTextBox() {
		return driver.findElement(By.id("userEmail"));
	}
	
	

	public WebElement getCurrentAddressTextBox() {
		return driver.findElement(By.id("currentAddress"));
	}
	
	

	public WebElement getPermanentAddressTextBox() {
		return driver.findElement(By.id("permanentAddress"));
	}
	
	

	public WebElement getSubmitButton() {
		return driver.findElement(By.id("submit"));
	}
	
	

	public WebElement getOutputTextBox() {
		return driver.findElement(By.id("output"));
	}

	public String getTextBoxLabelText () {
		
		return this.getTextBoxLabel().getText();
		
	}
	
	public void insertFullNameData (String fullName) {
		
		this.getFullNameTextBox().clear();
		this.getFullNameTextBox().sendKeys(fullName);
		
	}
	
	public void insertEmailData(String email) {
		js.executeScript("arguments[0].scrollIntoView(true);", this.getUserEmailTextBox());
		wdwait.until(ExpectedConditions.elementToBeClickable(this.getUserEmailTextBox()));
		this.getUserEmailTextBox().clear();
		this.getUserEmailTextBox().sendKeys(email);
	}
	
	public void insertCurrentAddressData (String currentAddress) {
		
		js.executeScript("arguments[0].scrollIntoView(true);", this.getCurrentAddressTextBox());
		wdwait.until(ExpectedConditions.elementToBeClickable(this.getCurrentAddressTextBox()));
		this.getCurrentAddressTextBox().clear();
		this.getCurrentAddressTextBox().sendKeys(currentAddress);
		
	}
	
	public void insertPermanentAddressData (String permanentAddress) {
		js.executeScript("arguments[0].scrollIntoView(true);", this.getPermanentAddressTextBox());
		wdwait.until(ExpectedConditions.elementToBeClickable(this.getPermanentAddressTextBox()));
		this.getPermanentAddressTextBox().clear();
		this.getPermanentAddressTextBox().sendKeys(permanentAddress);
		
	}
	
	public void clickSubmitButton () {
		
		this.getSubmitButton().click();
	}
	
	public String getTextFromOutputBox () {
		
		return this.getOutputTextBox().getText();
		
	}
	
}
