package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToolsQaBrokenLinksImages {

	WebDriver driver;
	WebElement brokenLinksImagesLabel;
	WebElement validImage;
	WebElement brokenImage;
	WebElement validLink;
	WebElement brokenLink;
	WebElement brokenLinkMessage;//za ovaj element bi trebala da se napravi nova stranica,to je stranica na koju je korisnik redirektovan nakon klika na broken link, nisam je pravila zbog preglednosti
	
	
	public ToolsQaBrokenLinksImages(WebDriver driver) {
		
		this.driver = driver;
	}
	public WebElement getBrokenLinksImagesLabel() {
		return driver.findElement(By.className("main-header"));
	}
	
	public WebElement getValidImage () {
		
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/img[1]"));
	}
	
	public WebElement getBrokenImage () {
		
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/img[2]"));
		
	}
	
	public WebElement getValidLink () {
		
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/a[1]"));
	}
	
	public WebElement getBrokenLink () {
		
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/a[2]"));
	}
	
	public WebElement getBrokenLinkMessage() {
		
		return driver.findElement(By.className("example"));
	}
	
	public String getBrokenLinksImagesText () {
		
		
		return this.getBrokenLinksImagesLabel().getText();
		
		
	}
	
	public void clickValidImage () {
		
		
		this.getValidImage().click();
	}
	
	public void clickOnValidLink () {
		
		this.getValidLink().click();
	}
	
	public void clickBrokenLink () {
		
		this.getBrokenLink().click();
	}
	
	public String getBrokenLinkMessageText() {
		
		return this.getBrokenLinkMessage().getText();
	}
	
	public String isImageBroken (WebElement image) {
		
		String a=""; // ubacujem ovo da bi mi metoda vraæala vrednost Stringa koju æu moæi da koristim za Assert equals-ako je u pitanju test za validnu sliku oèekivaæu da mi metoda vrati "not broken" a ako je u pitanju test za broken image oèekivaæu da mi metoda vrati vrednost "broken"
		
		if (image.getAttribute("naturalWidth").equals("0")) {
			
			System.out.println(image.getAttribute("outerHTML")+" is broken");
			return a="broken";
			
		}
		else {
			
			return a="not broken";
		}
	}
	
	
	
	
	
	
}
