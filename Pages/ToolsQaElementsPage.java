package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolsQaElementsPage {

	WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wdwait;
	WebElement elementLabel;
	WebElement textBoxButton;
	WebElement checkBox;
	WebElement radioButton;
	WebElement webTables;
	WebElement buttons;
	WebElement links;
	WebElement brokenLinksImages;
	WebElement uploadAndDownLoad;
	WebElement dynamicProperties;



	public ToolsQaElementsPage(WebDriver driver) {
		
		this.driver = driver;
		this.js=(JavascriptExecutor)driver;
		this.wdwait=new WebDriverWait (driver,20);
	}

	public WebElement getElementLabel() {
		return driver.findElement(By.cssSelector(".pattern-backgound.playgound-header"));
	}






	public WebElement getTextBoxButton() {
		return driver.findElement(By.className("text"));
	}




	public WebElement getCheckBox() {
		return driver.findElement(By.xpath("//*[@id=\"item-1\"]/span")); //ovde koristim xpath jer posle TextBox-a svi ostali elementi u nizu imaju isti naziv za class, a id-a nema
	}




	public WebElement getRadioButton() {
		return driver.findElement(By.xpath("//*[@id=\"item-2\"]/span"));//ovde koristim xpath jer posle TextBox-a svi ostali elementi u nizu imaju isti naziv za class, a id-a nema
	}





	public WebElement getButtons() {
		return driver.findElement(By.xpath("//*[@id=\"item-4\"]/span"));
	}

	public WebElement getWebTables() {
		return driver.findElement(By.xpath("//*[@id=\"item-3\"]/span"));
	}




	public WebElement getLinks() {
		return driver.findElement(By.xpath("//*[@id=\"item-5\"]/span"));
	}




	public WebElement getBrokenLinksImages() {
		return driver.findElement(By.xpath("//*[@id=\"item-6\"]/span"));
	}



	public WebElement getUploadAndDownLoad() {
		return driver.findElement(By.xpath("//*[@id=\"item-7\"]/span"));
	}



	public WebElement getDynamicProperties() {
		return driver.findElement(By.xpath("//*[@id=\"item-8\"]/span"));
	}

	public String getElemetsText () {
		
		return this.getElementLabel().getText();
		
		
		
	}


	public void clickTextBoxButton () {
		
		this.getTextBoxButton().click();
	}

	public void clickCheckBox () {
		
		
		this.getCheckBox().click();
	}

	public void clickRadioButton () {
		
		this.getRadioButton().click();
	}

	public void clickOnWebTables () {
		
		this.getWebTables().click();
		
	}

	public void clickButtons () {
		
		js.executeScript("arguments[0].scrollIntoView(true);", this.getButtons());
		wdwait.until(ExpectedConditions.elementToBeClickable(this.getButtons()));
		this.getButtons().click();
		
	}

	public void clickLinks () {
		
		js.executeScript("arguments[0].scrollIntoView(true);", this.getLinks());
		wdwait.until(ExpectedConditions.elementToBeClickable(this.getLinks()));
		this.getLinks().click();
		
	}

	public void clickBrokenLinksImages () {
		
		js.executeScript("arguments[0].scrollIntoView(true);", this.getBrokenLinksImages());
		wdwait.until(ExpectedConditions.elementToBeClickable(this.getBrokenLinksImages()));
		this.getBrokenLinksImages().click();
		
		
		
	}


	public void clickUploadAndDownload () {
		
		js.executeScript("arguments[0].scrollIntoView(true);", this.getUploadAndDownLoad());
		wdwait.until(ExpectedConditions.elementToBeClickable(this.getUploadAndDownLoad()));
		this.getUploadAndDownLoad().click();
		
		
	}

	public void clickDynamicProperties () {
		js.executeScript("arguments[0].scrollIntoView(true);", this.getDynamicProperties());
		wdwait.until(ExpectedConditions.elementToBeClickable(this.getDynamicProperties()));
		this.getDynamicProperties().click();
		
		
	}



   














}
