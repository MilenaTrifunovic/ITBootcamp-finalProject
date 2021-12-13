package Pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToolsQaUploadAndDownload {
	
WebDriver driver;
File dir;
	
	WebElement uploadAndDownloadLabel;
	WebElement downloadButton;

	public ToolsQaUploadAndDownload(WebDriver driver) {
		
		this.driver = driver;
	}

	public WebElement getUploadAndDownloadLabel() {
		return driver.findElement(By.className("main-header"));
	}
	
	public WebElement getDownloadButton () {
		
		return driver.findElement(By.id("downloadButton"));
	}
	
	public void clickDownloadButton () {
		
		this.getDownloadButton().click();
	}
	
	public String getUploadAndDownloadText () {
		
		return this.getUploadAndDownloadLabel().getText();
		
		
	}
	
	public boolean isFileDownloaded (String filePath, String fileName)  {
		
		
		boolean n=false;
		
		dir=new File (filePath);
		File[] dir_contents = dir.listFiles();
		
		 for (int i = 0; i < dir_contents.length; i++) {
		
		if (dir_contents[i].getName().equals(fileName)) {
			
			return n=true;
		}
	} return n;
	}
	

}
