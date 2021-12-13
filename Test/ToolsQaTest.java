package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import Base.BaseToolsQa;
import Pages.ToolsQaHomePage;

public class ToolsQaTest extends BaseToolsQa{


	
	@BeforeMethod
	public void pageSetUp() {
		
		driver.navigate().to("https://demoqa.com/");
		driver.manage().window().maximize();
		
	}


	@Test (priority=10)
	public void verifyThatLinkedPictureElementsOnHomePageIsValidAndOpensElementsPage () throws Exception {
		
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getElements());//uraditi metodu za ovo, ponavlja se u svakom testu
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
		toolsQaHomePage.clickOnElement();
		
		Thread.sleep(5000);
		
		String elements= "Elements";
		
		Assert.assertEquals(toolsQaElementsPage.getElemetsText(), elements);//potvrda da klik na linkovanu sliku Elements otvara stranicu Elements
		
	}


	@Test (priority=20)
	public void verifyThatLinkedPictureFormsOnHomePageIsValidAndOpensFormsPage () throws Exception {
		
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getForms());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getForms()));
		toolsQaHomePage.clickOnForms();
		
		Thread.sleep(10000);
		
		String forms= "Forms";
		
		Assert.assertEquals(toolsQaFormsPage.getFormsText(), forms);//potvrda da klik na linkovanu sliku Elements otvara stranicu Elements
		
	}

	@Test (priority=30)
	public void verifyThatLinkedPictureAlertsFrameWindowsOnHomePageIsValidAndOpensAlertsFrameWindowsPage () throws Exception {
		
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getAlertsFrameWindows());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getAlertsFrameWindows()));
		toolsQaHomePage.clickOnAlertsFrameWindows();;
		
		Thread.sleep(10000);
		
		String alertsFrameWindows= "Alerts, Frame & Windows";
		
		Assert.assertEquals(toolsQaAlertsFrameWindowsPage.getAlertsFrameWindowsText(), alertsFrameWindows);//potvrda da klik na linkovanu sliku Alerts, Fram & Windows otvara stranicu Alerts, Fram & Windows
		
	}

	@Test (priority=40)
	public void verifyThatLinkedPictureWidgetsOnHomePageIsValidAndOpensWidgetsPage () throws Exception {
		
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getWidgets());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getWidgets()));
		toolsQaHomePage.clickOnWidgets();
		
		Thread.sleep(10000);
		
		String widgets= "Widgets";
		
		Assert.assertEquals(toolsQaWidgetsPage.getWidgetsText(), widgets);//potvrda da klik na linkovanu sliku Widgets otvara stranicu Widgets
		
	} 


	@Test (priority=50)
	public void verifyThatLinkedPictureInteractionsOnHomePageIsValidAndOpensInteractionsPage () throws Exception {
		
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getInteractions());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getInteractions()));
		toolsQaHomePage.clickOnInteractions();
		
		Thread.sleep(10000);
		
		String interactions= "Interactions";
		
		Assert.assertEquals(toolsQaInteractions.getInteractionsText(), interactions);//potvrda da klik na linkovanu sliku Widgets otvara stranicu Widgets
		
	} 

	@Test (priority=60)
	public void verifyThatLinkedPictureBookStoreAppOnHomePageIsValidAndOpensBookStoreAppPage () throws Exception {
		
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getBookStoreApp());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getBookStoreApp()));
		toolsQaHomePage.clickOnBookStoreApp();
		
		Thread.sleep(10000);
		
		String bookStoreApp= "Book Store";
		
		Assert.assertEquals(toolsQaBooksStoreApp.getBooksStoreAppText(), bookStoreApp);//potvrda da klik na linkovanu sliku Widgets otvara stranicu Widgets
		
	} 

	@Test (priority=70)
	public void verifyThatLinkedBoxOnElementPageTextBoxIsValidAndOpensTextBoxPage () throws Exception {
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getElements());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
		toolsQaHomePage.clickOnElement();
		
		Thread.sleep(5000);
		
		toolsQaElementsPage.clickTextBoxButton();
		
		String textBox= "Text Box";
		Assert.assertEquals(toolsQaTextBox.getTextBoxLabelText(), textBox);
		
	} 

	@Test (priority=80)
	public void verifyThatLinkedBoxOnElementPageCheckBoxIsValidAndOpensCheckBoxPage () throws Exception {
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getElements());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
		toolsQaHomePage.clickOnElement();
		
		Thread.sleep(5000);
		
		toolsQaElementsPage.clickCheckBox();;
		
		String checkBox= "Check Box";
		Assert.assertEquals(toolsQaCheckBox.getCheckBoxText(), checkBox);
		
	}

 
	@Test (priority=90)
	public void verifyThatLinkedBoxOnElementPageRadioButtonIsValidAndOpensRadioButtonPage () throws Exception {
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getElements());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
		toolsQaHomePage.clickOnElement();
		
		Thread.sleep(5000);
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaElementsPage.getRadioButton());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaElementsPage.getRadioButton()));
		toolsQaElementsPage.clickRadioButton();
		
		String radioButton= "Radio Button";
		Assert.assertEquals(toolsQaRadioButton.getRadioButtonText(), radioButton);
		
	} 

	@Test (priority=100)
	public void verifyThatLinkedBoxOnElementPageWebTablesIsValidAndOpensWebTablesPage () throws Exception {
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getElements());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
		toolsQaHomePage.clickOnElement();
		
		Thread.sleep(5000);
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaElementsPage.getWebTables());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaElementsPage.getWebTables()));
		toolsQaElementsPage.clickOnWebTables();
		
		String webTables= "Web Tables";
		Assert.assertEquals(toolsQaWebTables.getWebTablesText(), webTables);
		
	} 

	@Test (priority=110)
	public void verifyThatLinkedBoxOnElementPageButtonsIsValidAndOpensButtonsPage () throws Exception {
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getElements());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
		toolsQaHomePage.clickOnElement();
		
		Thread.sleep(5000);
		
		
		toolsQaElementsPage.clickButtons();
		
		
		
		String buttons= "Buttons";
		Assert.assertEquals(toolsQaButtons.getButtonsText(), buttons);
		
	} 


	@Test (priority=120)
	public void verifyThatLinkedBoxOnElementPageLinksIsValidAndOpensLinksPage () throws Exception {
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getElements());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
		toolsQaHomePage.clickOnElement();
		
		Thread.sleep(5000);
		
		
		toolsQaElementsPage.clickLinks();
		
		
		
		String links= "Links";
		Assert.assertEquals(toolsQaLinks.getLinksText(), links);

	}


	@Test (priority=130)
	public void verifyThatLinkedBoxOnElementPageBrokenLinksImagesIsValidAndOpensBrokenLinksImagesPage () throws Exception {
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getElements());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
		toolsQaHomePage.clickOnElement();
		
		Thread.sleep(5000);
		
		
		toolsQaElementsPage.clickBrokenLinksImages();;
		
		
		
		String brokenLinksImages= "Broken Links - Images";
		Assert.assertEquals(toolsQaBrokenLinksImages.getBrokenLinksImagesText(), brokenLinksImages);

	}

	@Test (priority=140)
	public void verifyThatLinkedBoxOnElementPageUploadAndDownLoadIsValidAndOpensUploadAndDownloadPage () throws Exception {
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getElements());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
		toolsQaHomePage.clickOnElement();
		
		Thread.sleep(5000);
		
		
		toolsQaElementsPage.clickUploadAndDownload();
		
		
		
		String uploadAndDownload= "Upload and Download";
		Assert.assertEquals(toolsQaUploadAndDownload.getUploadAndDownloadText(), uploadAndDownload);

	} 

	@Test (priority=150)
	public void verifyThatLinkedBoxOnElementPageDynamicPropertiesIsValidAndOpensDynamicPropertiesPage () throws Exception {
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getElements());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
		toolsQaHomePage.clickOnElement();;
		
		Thread.sleep(5000);
		
		
		toolsQaElementsPage.clickDynamicProperties();
		
		
		
		String dynamicProperties= "Dynamic Properties";
		Assert.assertEquals(toolsQaDynamicProperties.getDynamicPropertiesText(), dynamicProperties);

	}

  @Test (priority=160)
   public void verifyThatUserCanSubmitDataTextBoxWhenAllFieldsFilledInAndEmailValid () throws Exception {
	   
	   js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getElements());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
		toolsQaHomePage.clickOnElement();
		
		Thread.sleep(5000);
		
		toolsQaElementsPage.clickTextBoxButton();
		Thread.sleep(3000);
		
		try {
			
			js.executeScript("arguments[0].scrollIntoView(true);", toolsQaTextBox.getOutputTextBox());
			Thread.sleep(3000);
			Assert.assertFalse(toolsQaTextBox.getOutputTextBox().isDisplayed());
		} catch (org.openqa.selenium.NoSuchElementException e) {} // prvo dokayujemo da elementa nema pre nego [to se popune podaci i klikne Submit, da bi kasniji test prisustva ovog elementa bio validan dokaz da se klikom na Submit pojavio novi element 
		
		String fullName=excel.getStringValue("Sheet1", 2, 0);
		String validEmail=excel.getStringValue("Sheet1", 2, 1);
		String currentAddress= excel.getStringValue("Sheet1", 2, 2);
		String permanentAddress = excel.getStringValue("Sheet1", 2, 3);
		
	    toolsQaTextBox.insertFullNameData(fullName);
	    toolsQaTextBox.insertEmailData(validEmail);
	    toolsQaTextBox.insertCurrentAddressData(currentAddress);
	    toolsQaTextBox.insertPermanentAddressData(permanentAddress);
	    toolsQaTextBox.clickSubmitButton();
	    Thread.sleep(3000);
	    Assert.assertTrue(toolsQaTextBox.getOutputTextBox().isDisplayed()); // element koji se pojavljuje tek kada se unese neki od podataka i klikne na dugme "Submit"
	    Assert.assertTrue(toolsQaTextBox.getTextFromOutputBox().contains(fullName));
	    Assert.assertTrue(toolsQaTextBox.getTextFromOutputBox().contains(validEmail));
	    Assert.assertTrue(toolsQaTextBox.getTextFromOutputBox().contains(currentAddress));
	    Assert.assertTrue(toolsQaTextBox.getTextFromOutputBox().contains(permanentAddress));
   } 


	 @Test (priority=170)
	   public void verifyThatUserCanSubmitDataTextBoxWhenOneFieldFilledIn () throws Exception {
		   
		   js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getElements());
			wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
			toolsQaHomePage.clickOnElement();
			
			Thread.sleep(5000);
			
			toolsQaElementsPage.clickTextBoxButton();
			Thread.sleep(3000);
			
			try {
				
				js.executeScript("arguments[0].scrollIntoView(true);", toolsQaTextBox.getOutputTextBox());
				Thread.sleep(3000);
				Assert.assertFalse(toolsQaTextBox.getOutputTextBox().isDisplayed());
			} catch (org.openqa.selenium.NoSuchElementException e) {} // prvo dokayujemo da elementa nema pre nego [to se popune podaci i klikne Submit, da bi kasniji test prisustva ovog elementa bio validan dokaz da se klikom na Submit pojavio novi element 
			
			
			String validEmail=excel.getStringValue("Sheet1", 2, 1);
			
			
		    
		    toolsQaTextBox.insertEmailData(validEmail);
		    
		    toolsQaTextBox.clickSubmitButton();
		    Thread.sleep(3000);
		    
		    Assert.assertTrue(toolsQaTextBox.getOutputTextBox().isDisplayed()); // element koji se pojavljuje tek kada se unese neki od podataka i klikne na dugme "Submit"
		    
		    Assert.assertTrue(toolsQaTextBox.getTextFromOutputBox().contains(validEmail));
	 } 


	@Test (priority=180)
	   public void verifyThatUserCannotSubmitDataTextBoxWhenEmailIsInvalid () throws Exception {
		   
		   js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getElements());
			wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
			toolsQaHomePage.clickOnElement();
			
			Thread.sleep(5000);
			
			toolsQaElementsPage.clickTextBoxButton();
			Thread.sleep(3000);
			
			try {
				
				js.executeScript("arguments[0].scrollIntoView(true);", toolsQaTextBox.getOutputTextBox());
				Thread.sleep(5000);
				Assert.assertFalse(toolsQaTextBox.getOutputTextBox().isDisplayed());
			} catch (org.openqa.selenium.NoSuchElementException e) {} // prvo dokayujemo da elementa nema pre nego [to se popune podaci i klikne Submit, da bi kasniji test prisustva ovog elementa bio validan dokaz da se klikom na Submit pojavio novi element 
			
			
			String invalidEmail=excel.getStringValue("Sheet1", 2, 4);
			
			
		    
		    toolsQaTextBox.insertEmailData(invalidEmail);
		    
		    toolsQaTextBox.clickSubmitButton();
		    Thread.sleep(5000);
		    
try {
				
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaTextBox.getOutputTextBox());
		Thread.sleep(3000);
		Assert.assertFalse(toolsQaTextBox.getOutputTextBox().isDisplayed());
			} catch (org.openqa.selenium.NoSuchElementException e) {} // elementa nema jer je email neispravan, i nije prihvacen 
			
	} 



	@Test (priority=190)//OVAJ TEST PADA
	   public void verifyThatUserCannotSubmitDataTextBoxWhenAllTextBoxesLeftEmpty () throws Exception {
		   
		   js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getElements());
			wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
			toolsQaHomePage.clickOnElement();
			
			Thread.sleep(5000);
			
			toolsQaElementsPage.clickTextBoxButton();
			Thread.sleep(3000);
			
			try {
				
				js.executeScript("arguments[0].scrollIntoView(true);", toolsQaTextBox.getOutputTextBox());
				Thread.sleep(3000);
				Assert.assertFalse(toolsQaTextBox.getOutputTextBox().isDisplayed());
			} catch (org.openqa.selenium.NoSuchElementException e) {} // prvo dokayujemo da elementa nema pre nego [to se popune podaci i klikne Submit, da bi kasniji test prisustva ovog elementa bio validan dokaz da se klikom na Submit pojavio novi element 
			
			
			
		    
		    toolsQaTextBox.clickSubmitButton();
		    Thread.sleep(3000);
		    
try {
				
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaTextBox.getOutputTextBox());
		Thread.sleep(3000);
		Assert.assertFalse(toolsQaTextBox.getOutputTextBox().isDisplayed());
			} catch (org.openqa.selenium.NoSuchElementException e) {} // elementa nema jer ni jedan podatak nije unet
			
	} 



@Test (priority=200)
public void verifyThatUserCanCheckHomeCheckboxOnCeckboxPage () throws Exception {
	 js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getElements());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
		toolsQaHomePage.clickOnElement();
		
		Thread.sleep(5000);
		
		toolsQaElementsPage.clickCheckBox();;
		Thread.sleep(3000);
		
	Assert.assertFalse(toolsQaCheckBox.getHomeCheckBox().isSelected());//potvrda da checkbox nije cekiran 
	toolsQaCheckBox.clickHomeCheckbox();
	Thread.sleep(10000);
	Assert.assertTrue(toolsQaCheckBox.getHomeCheckBox().isSelected());//potvrda da smo cekirali Home checkbox
	
}

@Test (priority=210)
public void verifyThatUserCanOpenSubHomeCheckboxes () throws Exception {
	
	js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getElements());
	wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
	toolsQaHomePage.clickOnElement();
	
	Thread.sleep(5000);
	
	toolsQaElementsPage.clickCheckBox();
	Thread.sleep(3000);
    try {
    	Assert.assertFalse(toolsQaCheckBox.getDesktopSubCheckbox().isDisplayed());
    } catch (org.openqa.selenium.NoSuchElementException e) {} // element desktob subcheckbox se otvara tek kad kliknemo na strelicu kod Home checkbox
    
	toolsQaCheckBox.clickArrowHomeCheckbox();
	
	Thread.sleep(3000);
	
	Assert.assertTrue(toolsQaCheckBox.getDesktopSubCheckbox().isDisplayed());// potvrda je klik na strelicu otvorio subCheckboxove
	
	
}
	
@Test (priority=220)
public void verifyThatUserCanCheckDesktopSubCheckbox () throws InterruptedException {
	
	js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getElements());
	wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
	toolsQaHomePage.clickOnElement();
	
	Thread.sleep(5000);
	
	toolsQaElementsPage.clickCheckBox();
	Thread.sleep(3000);
	
	toolsQaCheckBox.clickArrowHomeCheckbox();
	Thread.sleep(3000);
	
	Assert.assertTrue(toolsQaCheckBox.getDesktopSubCheckboxUnchecked().isDisplayed());
	
	toolsQaCheckBox.clickDesktopSubCheckbox();
	
	Assert.assertTrue(toolsQaCheckBox.getDesktopSubCheckboxChecked().isDisplayed());
	
	
}

@Test (priority=230)
public void verifyThatUserCanOpenDesktopSubCheckboxes () throws Exception {
	
	js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getElements());
	wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
	toolsQaHomePage.clickOnElement();
	
	Thread.sleep(5000);
	
	toolsQaElementsPage.clickCheckBox();
	Thread.sleep(3000);
	
	toolsQaCheckBox.clickArrowHomeCheckbox();
	Thread.sleep(3000);
	try {Assert.assertFalse(toolsQaCheckBox.getNoteSubCheckbox().isDisplayed());}
	catch (org.openqa.selenium.NoSuchElementException e) {}
	toolsQaCheckBox.clickDesktopArrow();
	Assert.assertTrue(toolsQaCheckBox.getNoteSubCheckbox().isDisplayed());
}
	
@Test (priority=240)
public void verifyThatUserCanCheckYesRadioButtonOnRadioButtonPage () throws Exception {
	
	js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getElements());
	wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
	toolsQaHomePage.clickOnElement();
	
	Thread.sleep(5000);
	
	js.executeScript("arguments[0].scrollIntoView(true);", toolsQaElementsPage.getRadioButton());
	wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaElementsPage.getRadioButton()));
	
	toolsQaElementsPage.clickRadioButton();
	Thread.sleep(5000);
	try {
		Assert.assertFalse(toolsQaRadioButton.getChosenRadioButton().isDisplayed());
	} catch (org.openqa.selenium.NoSuchElementException e) {}
	toolsQaRadioButton.clickYesRadioButton();
	Assert.assertTrue(toolsQaRadioButton.getTextFromChosenRadioButton().contains("Yes"));
	
	
}

@Test (priority=250)
public void verifyThatUserCanCheckImpressiveButtonOnRadioButtonPage () throws Exception {
	
	js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getElements());
	wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
	toolsQaHomePage.clickOnElement();
	
	Thread.sleep(5000);
	
	js.executeScript("arguments[0].scrollIntoView(true);", toolsQaElementsPage.getRadioButton());
	wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaElementsPage.getRadioButton()));
	
	toolsQaElementsPage.clickRadioButton();
	Thread.sleep(5000);
	try {
		Assert.assertFalse(toolsQaRadioButton.getChosenRadioButton().isDisplayed());
	} catch (org.openqa.selenium.NoSuchElementException e) {}
	toolsQaRadioButton.clickImpressiveRadioButton();;
	Assert.assertTrue(toolsQaRadioButton.getTextFromChosenRadioButton().contains("Impressive"));
	
	
}

	@Test (priority=260)// manuelno ne moye da se klikne no, trebalo bi da postoji ta mogucnost, test pada
	public void verifyThatUserCanCheckNoButtonOnRadioButtonPage () throws Exception {
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getElements());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
		toolsQaHomePage.clickOnElement();
		
		Thread.sleep(5000);
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaElementsPage.getRadioButton());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaElementsPage.getRadioButton()));
		
		toolsQaElementsPage.clickRadioButton();
		Thread.sleep(5000);
		try {
			Assert.assertFalse(toolsQaRadioButton.getChosenRadioButton().isDisplayed());
		} catch (org.openqa.selenium.NoSuchElementException e) {}
		
		toolsQaRadioButton.clickNoRadioButton();
		Assert.assertTrue(toolsQaRadioButton.getTextFromChosenRadioButton().contains("No"));
	} 
	
	
	@Test (priority=270)
	public void verifyThatUserCanAddDataToTableOnWeBTablesPageWhenAllDataAreEnteredAndValid () throws Exception {
	
	js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getElements());
	wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
	toolsQaHomePage.clickOnElement();
	
	Thread.sleep(5000);
	
	js.executeScript("arguments[0].scrollIntoView(true);", toolsQaElementsPage.getWebTables());
	wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaElementsPage.getWebTables()));
	
	toolsQaElementsPage.clickOnWebTables();
	Thread.sleep(3000);
	toolsQaWebTables.clickAddButton();
	Thread.sleep(2000);
	
	String firstName= excel.getStringValue("Sheet1", 6, 0);
	String lastName= excel.getStringValue("Sheet1", 6, 1);
	String validEmail= excel.getStringValue("Sheet1", 6, 2);
	int age= excel.getIntValue("Sheet1", 6, 3);
	int salary= excel.getIntValue("Sheet1", 6, 4);
	String department= excel.getStringValue("Sheet1", 6, 5);
	
	Assert.assertFalse(toolsQaWebTables.getTableText().contains(firstName));//potvrda da u tabeli nemamo ime korisnika koga æemo kasnije uneti
	Assert.assertTrue(toolsQaWebTables.getAddedUserText().isBlank());//element u èetvrtom redu, koji treba da bude prazan pre nego što dodamo podatke korisnika
	
	
	toolsQaWebTables.insertFirstNameData(firstName);
	toolsQaWebTables.insertLastNameData(lastName);
	toolsQaWebTables.insertUserEmail(validEmail);
	toolsQaWebTables.insertAge(age);
	toolsQaWebTables.insertSalary(salary);
	toolsQaWebTables.insertDepartment(department);
	
	
	toolsQaWebTables.clickSubmitButton();
	
	Assert.assertFalse(toolsQaWebTables.getAddedUserText().isBlank());//element u cetvrtom redu koji je posle dodavanja podataka popunjen
	Assert.assertTrue(toolsQaWebTables.getAddedUserText().contains(firstName));//potvrda da su u cetvrti red uneti podaci koje smo mi uneli
	
	Assert.assertTrue(toolsQaWebTables.getTableText().contains(firstName));// ovo se odnosi na celu tabelu, u slucaju da se promeni difoltni broj korisnika koji imamo u tabeli, onda ce podaci koje mi dodajemo zavrsiti u nekom drugom, a ne u cetvrtom redu, potvrda da u tabeli postoje uneti podaci, mada ovo nije potvrda da su svi vezani za jednu osobu
	Assert.assertTrue(toolsQaWebTables.getTableText().contains(lastName));
	Assert.assertTrue(toolsQaWebTables.getTableText().contains(validEmail));
	Assert.assertTrue(toolsQaWebTables.getTableText().contains(""+age));
	Assert.assertTrue(toolsQaWebTables.getTableText().contains(""+salary));
	Assert.assertTrue(toolsQaWebTables.getTableText().contains(department));
	
	
	
	
	
	}
	
	
	@Test (priority=280)
	public void verifyThatUserCanDeleteRecordFromTableOnWebTablesPage () throws Exception {
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getElements());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
		toolsQaHomePage.clickOnElement();
		
		Thread.sleep(5000);
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaElementsPage.getWebTables());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaElementsPage.getWebTables()));
		
		toolsQaElementsPage.clickOnWebTables();
		Thread.sleep(3000);
		String beforeDelete= toolsQaWebTables.getFirstRowText();
		toolsQaWebTables.clickDeleteRow1Button();
		String afterDelete = toolsQaWebTables.getFirstRowText();
		
		Assert.assertNotEquals(beforeDelete, afterDelete); //potvrda da je unos iz prvog reda obrisan, i da je sad u prvom redu neki drugi unos
		
		
	}
	
	@Test (priority=290)
	public void verifyThatUserCanEditRecordFromTableOnWebTablesPage () throws Exception {
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getElements());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
		toolsQaHomePage.clickOnElement();
		
		Thread.sleep(5000);
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaElementsPage.getWebTables());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaElementsPage.getWebTables()));
		
		toolsQaElementsPage.clickOnWebTables();
		Thread.sleep(3000);
		
		String beforeEdit= toolsQaWebTables.getFirstRowText();
		
		toolsQaWebTables.clickEditRow1Button();
		String firstName= excel.getStringValue("Sheet1", 6, 0);
		toolsQaWebTables.editFirstNameWebTables(firstName);
		String afterEdit= toolsQaWebTables.getFirstRowText();
		
		Assert.assertNotEquals(firstName, afterEdit); // potvrda da smo izmenili prvi red
		
		Assert.assertTrue(toolsQaWebTables.getFirstRowText().contains(firstName));//potvrda da prvi red posle izmena sadrži firstName koji smo uneli
		
	}
	
	
	@Test (priority=300)
	public void verifyThatUserCanSearchTableDataWhenEnterWhenEnterDataFromExistingRecordInSearchTextBoxOnWebTablesPage () throws Exception {
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getElements());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
		toolsQaHomePage.clickOnElement();
		
		Thread.sleep(5000);
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaElementsPage.getWebTables());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaElementsPage.getWebTables()));
		
		toolsQaElementsPage.clickOnWebTables();
		Thread.sleep(3000);
		
		String searchboxText="Alden";
		toolsQaWebTables.insertTextInSearchBox(searchboxText);
		toolsQaWebTables.clickOnSearchBoxIcon();
		
		Assert.assertTrue(toolsQaWebTables.getFirstRowText().contains(searchboxText));//ovako potvrðujemo da je u prvom redu rezultat naše pretrage
		
		
	}
	
	@Test (priority=310)
	public void verifyThatButtonDoubleClickMeOnPageButtonsRespondsOnDoubleClick () throws Exception {
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getElements());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
		toolsQaHomePage.clickOnElement();
		
		Thread.sleep(5000);
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaElementsPage.getButtons());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaElementsPage.getButtons()));
		
		toolsQaElementsPage.clickButtons();
		Thread.sleep(3000);
		
		toolsQaButtons.doubleClickDoubleClickButton();
		
		String expectedMessage= excel.getStringValue("Buttons", 1, 0);
		
		Assert.assertEquals(toolsQaButtons.getDoubleClickMessageText(), expectedMessage);
		
		
	}
	
	@Test (priority=320)
	public void verifyThatButtonRightClickMeOnPageButtonsRespondsOnRightClick () throws Exception {
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getElements());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
		toolsQaHomePage.clickOnElement();
		
		Thread.sleep(5000);
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaElementsPage.getButtons());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaElementsPage.getButtons()));
		
		toolsQaElementsPage.clickButtons();
		Thread.sleep(3000);
		
		toolsQaButtons.rightClickOnRightClickButton();
		
		String expectedMessage= excel.getStringValue("Buttons", 1, 1);
		
		Assert.assertEquals(toolsQaButtons.getRightClickMessageText(), expectedMessage);
	
}
	
	@Test (priority=330)
	public void verifyThatButtonClickMeOnPageButtonsRespondsOnClick () throws Exception {
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getElements());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
		toolsQaHomePage.clickOnElement();
		
		Thread.sleep(5000);
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaElementsPage.getButtons());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaElementsPage.getButtons()));
		
		toolsQaElementsPage.clickButtons();
		Thread.sleep(3000);
		
		toolsQaButtons.clickOnClickMeButton();
		
		String expectedMessage= excel.getStringValue("Buttons", 1, 2);
		
		Assert.assertEquals(toolsQaButtons.getClickMeMessageText(), expectedMessage);	
	
	}
	
	@Test (priority=340)
	public void verifyThatClickOnLinkHomeOnPageLinksOpensNewTab () throws Exception {
		
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getElements());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
		toolsQaHomePage.clickOnElement();
		
		Thread.sleep(5000);
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaElementsPage.getLinks());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaElementsPage.getLinks()));
		
		toolsQaElementsPage.clickLinks();
		Thread.sleep(3000);
		
		toolsQaLinks.clickOnHomeLink();
		
		toolsQaLinks.changeTab(1);//prelayimo u novootvoreni tab, da bismo potvrdili da link radi, i da otvara demoqa.com
		
		String url=driver.getCurrentUrl();//ovo je url novootvorenog taba
		System.out.println(url);
		
		String expectedUrl=excel.getStringValue("Links", 1, 0);
		
		Assert.assertEquals(url,expectedUrl);
		
		
		
		
	}
	
	
	@Test (priority=350)
	public void verifyThatClickOnLinkHomeA57OnOnPageLinksOpensNewTab () throws Exception {
		
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaHomePage.getElements());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
		toolsQaHomePage.clickOnElement();
		
		Thread.sleep(5000);
		
		js.executeScript("arguments[0].scrollIntoView(true);", toolsQaElementsPage.getLinks());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaElementsPage.getLinks()));
		
		toolsQaElementsPage.clickLinks();
		Thread.sleep(3000);
		
		toolsQaLinks.clickOnHomeA57OnLink();;
		
		toolsQaLinks.changeTab(1);//prelayimo u novootvoreni tab, da bismo potvrdili da link radi, i da otvara demoqa.com
		
		String url=driver.getCurrentUrl();//ovo je url novootvorenog taba
		System.out.println(url);
		
		String expectedUrl=excel.getStringValue("Links", 1, 0);
		
		Assert.assertEquals(url,expectedUrl);
		
		
		
		
	}
	
	@Test (priority=360)
	public void verifyThatclickOnLinkCreatedRespondsWithApiStatus201 () throws Exception {
		
		scrollTo(toolsQaHomePage.getElements());
		Thread.sleep(5000);
		toolsQaHomePage.clickOnElement();
		
		scrollTo(toolsQaElementsPage.getLinks());
		
		toolsQaElementsPage.clickLinks();
		
		Thread.sleep(3000);
		
		toolsQaLinks.clickOnCreatedLink();
		
		
		
		String expectedMessage=excel.getStringValue("Links", 1, 1);
		scrollTo(toolsQaLinks.getLinkResponse());
		Thread.sleep(3000);
		Assert.assertEquals(toolsQaLinks.getLinkResponseText(), expectedMessage);
		
		
		
	} 
	
	@Test (priority=370)
	public void verifyThatclickOnLinkNoContentRespondsWithApiStatus201 () throws Exception {
		
		scrollTo(toolsQaHomePage.getElements());
		Thread.sleep(5000);
		toolsQaHomePage.clickOnElement();
		
		scrollTo(toolsQaElementsPage.getLinks());
		
		toolsQaElementsPage.clickLinks();
		
		Thread.sleep(3000);
		
		toolsQaLinks.clickNoContentLink();
		
		
		Thread.sleep(3000);
		String expectedMessage=excel.getStringValue("Links", 1, 2);
		scrollTo(toolsQaLinks.getLinkResponse());
		Thread.sleep(3000);
		Assert.assertEquals(toolsQaLinks.getLinkResponseText(), expectedMessage);
		
	}
	
	@Test (priority=380)
	public void verifyThatclickOnLinkMovedRespondsWithApiStatus301 () throws Exception {
		
		scrollTo(toolsQaHomePage.getElements());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
		toolsQaHomePage.clickOnElement();
		
		scrollTo(toolsQaElementsPage.getLinks());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaElementsPage.getLinks()));
		toolsQaElementsPage.clickLinks();
		
	    scrollTo(toolsQaLinks.getMovedLink());
	    wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaLinks.getMovedLink()));
	    toolsQaLinks.clickMovedLink();
		
		Thread.sleep(3000);
		String expectedMessage=excel.getStringValue("Links", 1, 3);
		Assert.assertEquals(toolsQaLinks.getLinkResponseText(), expectedMessage);
		
	}
	
	@Test (priority=390)
	public void verifyThatclickOnLinkBadRequestRespondsWithApiStatus400 () throws Exception {
		
		scrollTo(toolsQaHomePage.getElements());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
		toolsQaHomePage.clickOnElement();
		
		scrollTo(toolsQaElementsPage.getLinks());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaElementsPage.getLinks()));
		toolsQaElementsPage.clickLinks();
		
	    scrollTo(toolsQaLinks.getBadRequestLink());
	    wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaLinks.getBadRequestLink()));
	    toolsQaLinks.clickBadRequestLink();
		
		Thread.sleep(3000);
		String expectedMessage=excel.getStringValue("Links", 1, 4);
		Assert.assertEquals(toolsQaLinks.getLinkResponseText(), expectedMessage);
		
	}
	
	@Test (priority=400)
	public void verifyThatclickOnLinkUnauthorizedRespondsWithApiStatus401 () throws Exception {
		
		scrollTo(toolsQaHomePage.getElements());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
		toolsQaHomePage.clickOnElement();
		
		scrollTo(toolsQaElementsPage.getLinks());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaElementsPage.getLinks()));
		toolsQaElementsPage.clickLinks();
		
	    scrollTo(toolsQaLinks.getUnauthorizedLink());
	    wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaLinks.getUnauthorizedLink()));
	    toolsQaLinks.clickUnauthorizedLink();
		
		Thread.sleep(3000);
		String expectedMessage=excel.getStringValue("Links", 1, 5);
		Assert.assertEquals(toolsQaLinks.getLinkResponseText(), expectedMessage);	
		
		
	}
	
	@Test (priority=410)
	public void verifyThatClickOnLinkForbiddenRespondsWithApiStatus403 () throws Exception {
		
		scrollTo(toolsQaHomePage.getElements());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
		toolsQaHomePage.clickOnElement();
		
		scrollTo(toolsQaElementsPage.getLinks());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaElementsPage.getLinks()));
		toolsQaElementsPage.clickLinks();
		
	    scrollTo(toolsQaLinks.getForbiddenLink());
	    wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaLinks.getForbiddenLink()));
	    toolsQaLinks.clickForbiddenLink();
		
		Thread.sleep(3000);
		String expectedMessage=excel.getStringValue("Links", 1, 6);
		Assert.assertEquals(toolsQaLinks.getLinkResponseText(), expectedMessage);	
		
		
	}
	
	
	@Test (priority=420)
	public void verifyThatclickOnLinkForbiddenRespondsWithApiStatus403 () throws Exception {
		
		scrollTo(toolsQaHomePage.getElements());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
		toolsQaHomePage.clickOnElement();
		
		scrollTo(toolsQaElementsPage.getLinks());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaElementsPage.getLinks()));
		toolsQaElementsPage.clickLinks();
		
	    scrollTo(toolsQaLinks.getNotFoundLink());
	    wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaLinks.getNotFoundLink()));
	    toolsQaLinks.clickNotFoundLink();
		
		Thread.sleep(3000);
		String expectedMessage=excel.getStringValue("Links", 1, 7);
		Assert.assertEquals(toolsQaLinks.getLinkResponseText(), expectedMessage);	
	
	
	
}
	
	
	@Test (priority=430)
	public void verifyThatValidImageIsValid () throws Exception {
		
		scrollTo(toolsQaHomePage.getElements());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
		toolsQaHomePage.clickOnElement();
		
		scrollTo(toolsQaElementsPage.getBrokenLinksImages());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaElementsPage.getBrokenLinksImages()));
		toolsQaElementsPage.clickBrokenLinksImages();;
		
	    scrollTo(toolsQaBrokenLinksImages.getValidImage());
	    
	    toolsQaBrokenLinksImages.isImageBroken(toolsQaBrokenLinksImages.getValidImage());
		
		Assert.assertEquals(toolsQaBrokenLinksImages.isImageBroken(toolsQaBrokenLinksImages.getValidImage()), "not broken");
	
	
	
}
	
	@Test (priority=440)
	public void verifyThatBrokenImageIsBroken () throws Exception {
		
		scrollTo(toolsQaHomePage.getElements());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
		toolsQaHomePage.clickOnElement();
		
		scrollTo(toolsQaElementsPage.getBrokenLinksImages());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaElementsPage.getBrokenLinksImages()));
		toolsQaElementsPage.clickBrokenLinksImages();;
		
	    scrollTo(toolsQaBrokenLinksImages.getBrokenImage());
	    
	    toolsQaBrokenLinksImages.isImageBroken(toolsQaBrokenLinksImages.getBrokenImage());
		
		Assert.assertEquals(toolsQaBrokenLinksImages.isImageBroken(toolsQaBrokenLinksImages.getBrokenImage()), "broken");
	
	
	
}

	@Test (priority=450)
	public void verifyThatValidLinkIsValid () throws InterruptedException {
	
	scrollTo(toolsQaHomePage.getElements());
	wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
	toolsQaHomePage.clickOnElement();
	
	
	scrollTo(toolsQaElementsPage.getBrokenLinksImages());
	wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaElementsPage.getBrokenLinksImages()));
	toolsQaElementsPage.clickBrokenLinksImages();
	
	scrollTo(toolsQaBrokenLinksImages.getValidLink());
	wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaBrokenLinksImages.getValidLink()));
	toolsQaBrokenLinksImages.clickOnValidLink();
	
	Thread.sleep(3000);
	
	String url=driver.getCurrentUrl();
	Assert.assertEquals(url, "https://demoqa.com/"); //prva potvrda da smo redirektovani na ToolsQaHomePage
	
	scrollTo(toolsQaHomePage.getElements());
	Assert.assertTrue(toolsQaHomePage.getElements().isDisplayed()); //druga potvrda da je korisnik redirektovan, jer ovaj element postojisamo na HomePage 
	
	
	}
	
	@Test (priority=460)
	public void verifyThatBrokenLinkIsBroken () throws Exception {
	
	scrollTo(toolsQaHomePage.getElements());
	wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
	toolsQaHomePage.clickOnElement();
	
	
	scrollTo(toolsQaElementsPage.getBrokenLinksImages());
	wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaElementsPage.getBrokenLinksImages()));
	toolsQaElementsPage.clickBrokenLinksImages();
	
	scrollTo(toolsQaBrokenLinksImages.getValidLink());
	wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaBrokenLinksImages.getBrokenLink()));
	toolsQaBrokenLinksImages.clickBrokenLink();
	
	Thread.sleep(3000);
	
	String url=driver.getCurrentUrl();
	Assert.assertEquals(url, "http://the-internet.herokuapp.com/status_codes/500");//prva potvrda je link na koji smo redirektovani
	
	String expectedText=  "This page returned a 500 status code.";
	
	Assert.assertTrue(toolsQaBrokenLinksImages.getBrokenLinkMessageText().contains(expectedText));//druga potvrda je tekst koji treba da nam se pojavi kada smo redirektovani na stranicu koja odgovara sa statusnim kodom 500
	
	
	
	
	
	
	}
	
	@Test (priority=470)
	
	public void verifyThatClickOnButtonDownloadDownloadsCorrectFile () throws Exception {
		
		scrollTo(toolsQaHomePage.getElements());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaHomePage.getElements()));
		toolsQaHomePage.clickOnElement();
		
		
		scrollTo(toolsQaElementsPage.getUploadAndDownLoad());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaElementsPage.getUploadAndDownLoad()));
		toolsQaElementsPage.clickUploadAndDownload();;
		
		scrollTo(toolsQaUploadAndDownload.getDownloadButton());
		wdwait.until(ExpectedConditions.elementToBeClickable(toolsQaUploadAndDownload.getDownloadButton()));
		toolsQaUploadAndDownload.clickDownloadButton();;
		
		Thread.sleep(5000);	
		
		String filePath= "C:\\Users\\Jeca\\Downloads";
		
		
		
		Assert.assertTrue(toolsQaUploadAndDownload.isFileDownloaded(filePath,"sampleFile.jpeg"));
		
	}
	
	
	
}
