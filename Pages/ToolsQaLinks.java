package Pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToolsQaLinks {
	
	WebDriver driver;
	WebElement linksLabel;
	WebElement HomeLink;
	WebElement linkMessage;
	ArrayList<String>tabs;
	JavascriptExecutor js;
	String url;
	String newTab;
	WebElement homeA57On;
	WebElement createdLink;
	WebElement linkResponse;
	WebElement noContentLink;
	WebElement movedLink;
	WebElement badRequestLink;
	WebElement unauthorizedLink;
	WebElement forbiddenLink;
	WebElement notFoundLink;
	
	
	
	public ToolsQaLinks(WebDriver driver) {
		
		this.driver = driver;
		
		this.js=(JavascriptExecutor)driver;
	}
	public WebElement getLinksLabel() {
		return driver.findElement(By.className("main-header"));
	}
	
	
	
	
	public WebElement getHomeLink() {
		return driver.findElement(By.id("simpleLink"));
	}
	
	
	
	public WebElement getLinkMessage() {
		return driver.findElement(By.id("linkResponse"));
	}
	
	
	
	
	public WebElement getHomeA57On() {
		return driver.findElement(By.id("dynamicLink"));
	}
	
	
	
	public WebElement getCreatedLink() {
		return driver.findElement(By.id("created"));
	}
	
	
	
	
	
	
	
	public WebElement getLinkResponse() {
		return driver.findElement(By.id("linkResponse"));
	}
	
	
	
	public WebElement getNoContentLink() {
		return driver.findElement(By.id("no-content"));
	}
	
	
	
	
	public WebElement getMovedLink() {
		return driver.findElement(By.id("moved"));
	}
	
	
	
	
	public WebElement getBadRequestLink() {
		return driver.findElement(By.id("bad-request"));
	}
	
	
	
	
	public WebElement getUnauthorizedLink() {
		return driver.findElement(By.id("unauthorized"));
	}
	
	
	
	
	public WebElement getForbiddenLink() {
		return driver.findElement(By.id("forbidden"));
	}
	
	
	public WebElement getNotFoundLink() {
		return driver.findElement(By.id("invalid-url"));
	}
	public String getLinksText () {
		
		return this.getLinksLabel().getText();
	}
	

	public String getNewTab() {
		return newTab;
	}
	public void clickOnHomeLink () {
		
		this.getHomeLink().click();
		
	}
	
	
	public String getLinkMessageText () {
		
		return this.getLinkMessage().getText();
	}
	
	public void changeTab (int a) {
		
		this.tabs=new ArrayList<String>(driver.getWindowHandles());
		for (int i=0; i<tabs.size();i++) {
			System.out.println(tabs.get(i));
			
			
			
		}
		
		driver.switchTo().window(tabs.get(a));
		
		
		
	}
	
	public String getUrlText () {
		
		return url=driver.getCurrentUrl();
		
		
	}

	
	public int getTabsSize () {
		int a;
		return  a=tabs.size();
		
		
		
	} 
	
	public void clickOnHomeA57OnLink () {
		
		this.getHomeA57On().click();
		
		
	}
	
	
	public void clickOnCreatedLink() {
		
		this.getCreatedLink().click();
		
		
	}
	
	
	public String getLinkResponseText () {
		
		return this.getLinkResponse().getText();
	}
	
	public void clickNoContentLink() {
		
		this.getNoContentLink().click();
		
		
	}
	
	public void clickMovedLink() {
		
		this.getMovedLink().click();
		
		
	}
	
	public void clickBadRequestLink () {
		
		this.getBadRequestLink().click();
	}
	
	public void clickUnauthorizedLink () {
		
		this.getUnauthorizedLink().click();
		
		
	}
	
	public void clickForbiddenLink () {
		
		this.getForbiddenLink().click();
	}
	
	public void clickNotFoundLink () {
		
		this.getNotFoundLink().click();
		
	}

}
