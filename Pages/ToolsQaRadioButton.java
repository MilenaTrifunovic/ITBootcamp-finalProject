package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToolsQaRadioButton {
	
	WebDriver driver;
	WebElement radioButtonLabel;
	WebElement yesRadioButton;
	WebElement chosenRadioButton;
	WebElement impressiveRadioButton;
	WebElement noRadioButton;

	public ToolsQaRadioButton(WebDriver driver) {
		
		this.driver = driver;
	}

	public WebElement getRadioButtonLabel() {
		return driver.findElement(By.className("main-header"));
	}
	
	
	public WebElement getYesRadioButton() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[2]/label"));
	}
	
	

	public WebElement getImpressiveRadioButton() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/label"));
	}
	
	

	public WebElement getNoRadioButton() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[4]/label"));
	}

	public String getRadioButtonText () {
		
		
		return this.getRadioButtonLabel().getText();
	}
	
	
	public WebElement getChosenRadioButton() {
		return driver.findElement(By.className("mt-3"));
	}

	public void clickYesRadioButton () {
		
		this.getYesRadioButton().click();
		
		
	}
	
	
	public String getTextFromChosenRadioButton () {
		
		return this.getChosenRadioButton().getText();
	}
	
	
	public void clickImpressiveRadioButton() {
		
		this.getImpressiveRadioButton().click();
		
	}
	
	public void clickNoRadioButton () {
		
		this.getNoRadioButton().click();
		
		
	}
	

}
