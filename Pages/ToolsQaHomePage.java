package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToolsQaHomePage {

	WebDriver driver;
	
	WebElement elements;
	WebElement forms;
	WebElement alertsFrameWindows;
	WebElement widgets;
	WebElement interactions;
	WebElement bookStoreApp;

	public WebElement getElements() {
		return driver.findElement(By.className("card-body"));
	}

	public ToolsQaHomePage(WebDriver driver) {
		
		this.driver = driver;
	}


	public void clickOnElement () {
		
		this.getElements().click();
		
	}

	public WebElement getForms() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[3]/h5"));//koristim xpath zato što svi elementi na home page imaju isti naziv klase, id-a nema
	}

	public void clickOnForms() {
		this.getForms().click();
	}

	public WebElement getAlertsFrameWindows() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div/div[3]/h5"));
	}

	public void clickOnAlertsFrameWindows () {
		
		this.getAlertsFrameWindows().click();
		
	}

	public WebElement getWidgets() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div/div[3]/h5"));
	}

	public void clickOnWidgets () {
		
		this.getWidgets().click();
		
	}

	public WebElement getInteractions() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[5]/div/div[3]/h5"));
	}

	public void clickOnInteractions () {
		
		
		this.getInteractions().click();
	}

	public WebElement getBookStoreApp() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div/div[3]/h5"));
	}

	public void clickOnBookStoreApp () {
		
		this.getBookStoreApp().click();
	}
	
	
	
	
	
}
