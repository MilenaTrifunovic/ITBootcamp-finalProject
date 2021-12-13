package Base;



import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.http.HttpClient;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import Pages.ToolsQaAlertsFrameWindowsPage;
import Pages.ToolsQaBooksStoreApp;
import Pages.ToolsQaBrokenLinksImages;
import Pages.ToolsQaButtons;
import Pages.ToolsQaCheckBox;
import Pages.ToolsQaDynamicProperties;
import Pages.ToolsQaElementsPage;
import Pages.ToolsQaFormsPage;
import Pages.ToolsQaHomePage;
import Pages.ToolsQaInteractions;
import Pages.ToolsQaLinks;
import Pages.ToolsQaRadioButton;
import Pages.ToolsQaTextBox;
import Pages.ToolsQaUploadAndDownload;
import Pages.ToolsQaWebTables;
import Pages.ToolsQaWidgetsPage;


public class BaseToolsQa {


	public WebDriver driver;

	public ToolsQaHomePage toolsQaHomePage;

	public ToolsQaElementsPage toolsQaElementsPage;

	

	public JavascriptExecutor js;

	public WebDriverWait wdwait;

	public ToolsQaFormsPage toolsQaFormsPage;

	public ToolsQaAlertsFrameWindowsPage toolsQaAlertsFrameWindowsPage;

	public ToolsQaWidgetsPage toolsQaWidgetsPage;

	public ToolsQaInteractions toolsQaInteractions;

	public ToolsQaBooksStoreApp toolsQaBooksStoreApp;

	public ToolsQaTextBox toolsQaTextBox;

	public ToolsQaCheckBox  toolsQaCheckBox;

	public ToolsQaRadioButton toolsQaRadioButton; 

	public ToolsQaWebTables toolsQaWebTables;

	public ToolsQaButtons toolsQaButtons; 

	public ToolsQaLinks toolsQaLinks; 

	public ToolsQaBrokenLinksImages toolsQaBrokenLinksImages;

	public ToolsQaUploadAndDownload toolsQaUploadAndDownload;

	public ToolsQaDynamicProperties toolsQaDynamicProperties; 
	
	public Excel excel;
	
	public Actions act;
	
	public HttpClient client;
	
	





	@BeforeClass
	public void setUp() throws Exception  {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver=new ChromeDriver ();
		toolsQaHomePage=new ToolsQaHomePage(driver);
		toolsQaElementsPage= new ToolsQaElementsPage (driver);
		
		wdwait= new WebDriverWait (driver, 20);
		js=(JavascriptExecutor)driver;
		toolsQaFormsPage = new ToolsQaFormsPage (driver);
		toolsQaAlertsFrameWindowsPage =new ToolsQaAlertsFrameWindowsPage (driver);
		toolsQaWidgetsPage=new ToolsQaWidgetsPage (driver);
		toolsQaInteractions = new ToolsQaInteractions (driver);
		toolsQaBooksStoreApp=new ToolsQaBooksStoreApp (driver);
		toolsQaTextBox= new ToolsQaTextBox (driver);
		toolsQaCheckBox = new ToolsQaCheckBox (driver);
		toolsQaRadioButton= new ToolsQaRadioButton (driver);
		toolsQaWebTables = new ToolsQaWebTables (driver);
		toolsQaButtons = new ToolsQaButtons (driver);
		toolsQaLinks = new ToolsQaLinks (driver);
		toolsQaBrokenLinksImages = new ToolsQaBrokenLinksImages (driver);
		toolsQaUploadAndDownload = new ToolsQaUploadAndDownload (driver);
		toolsQaDynamicProperties = new ToolsQaDynamicProperties (driver);
		excel = new Excel ("C:\\Users\\Jeca\\Desktop\\ToolsQA.xlsx");
		act=new Actions(driver);
		
		
	
		
	}



	 public void scrollTo (WebElement element) { //ovu metodu stavljam u Base klasu zato što je pozivam u svakom testu, druga opcija je da je pišem u svakoj Page stranici koju posle importujem u Base, ovo je kraæi naèin
	    	
	    	js.executeScript("arguments[0].scrollIntoView(true);", element);
			wdwait.until(ExpectedConditions.elementToBeClickable(element));//umesto ovoga negde je potrebno da se umesto Clickable koristi Visible, ali radi i na ovaj naèin
			
	    	
	    	
	    }

  







}
