package Pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToolsQaWebTables {

	WebDriver driver;
	WebElement webTablesLabel;
	WebElement addButton;
	WebElement firstName;
	WebElement lastName;
	WebElement userEmail;
	WebElement age;
	WebElement salary;
	WebElement department;
	WebElement submitButton;
	WebElement table;
	ArrayList <String> users;
	WebElement addedUser; // to je element u cetrvtom redu tabele, tabela uvek ima tri popunjena reda pre dodavanja novog korisnika
	WebElement firstRow;
	WebElement deleteRow1Button;
	WebElement editRow1Button;
	WebElement searchTextBox;
	WebElement searchBoxIcon;

	public ToolsQaWebTables(WebDriver driver) {
		
		this.driver = driver;
		users=new ArrayList<String> ();
	}

	public WebElement getWebTablesLabel() {
		return driver.findElement(By.className("main-header"));
	}
	
	

	public WebElement getAddButton() {
		return driver.findElement(By.id("addNewRecordButton"));
	}
	
	

	public WebElement getFirstName() {
		return driver.findElement(By.id("firstName"));
	}
	
	

	public WebElement getLastName() {
		return driver.findElement(By.id("lastName"));
	}
	
	

	public WebElement getUserEmail() {
		return driver.findElement(By.id("userEmail"));
	}
	
	

	public WebElement getAge() {
		return driver.findElement(By.id("age"));
	}
	
	

	public WebElement getSalary() {
		return driver.findElement(By.id("salary"));
	}
	
	
	

	public WebElement getDepartment() {
		return driver.findElement(By.id("department"));
	}
	
	

	public WebElement getSubmitButton() {
		return driver.findElement(By.id("submit"));
	}
	
	

	public WebElement getTable() {
		return driver.findElement(By.className("rt-table"));
	}
	
	

	public WebElement getUsersFromTable() {
		return driver.findElement(By.cssSelector(".rt-tr.-odd"));
	}
	
	

	public WebElement getAddedUser() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]/div/div[1]"));
	}
	
	

	public WebElement getFirstRow() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div"));
	}
	
	

	public WebElement getDeleteRow1Button() {
		return driver.findElement(By.id("delete-record-1"));
	}
	
	
	

	public WebElement getEditRow1Button() {
		return driver.findElement(By.id("edit-record-1"));
	}

	public String getWebTablesText () {
		
		return this.getWebTablesLabel().getText();
	}	
		
	
	
	
	
	public WebElement getSearchTextBox() {
		return driver.findElement(By.id("searchBox"));
	}

	
	
	public WebElement getSearchBoxIcon() {
		return driver.findElement(By.id("basic-addon2"));
	}

	public void clickAddButton () {
		
		this.getAddButton().click();
	}
	
	public void insertFirstNameData (String firstName) {
		
		
		
		this.getFirstName().clear();
		this.getFirstName().sendKeys(firstName);
		
	}
	
	public void insertLastNameData (String lastName) {
		
		this.getLastName().clear();
		this.getLastName().sendKeys(lastName);
	}
	
	public void insertUserEmail (String email) {
		
		this.getUserEmail().clear();
		this.getUserEmail().sendKeys(email);
		
	}
	
	
	public void insertAge (int age) {
		
		this.getAge().clear();
		this.getAge().sendKeys(""+age);
		
		
		
	}
	
	
	public void insertSalary (int salary) {
		
		this.getSalary().clear();
		this.getSalary().sendKeys(""+salary);
		
	}
	
	
	public void insertDepartment (String department) {
		
		this.getDepartment().clear();
		this.getDepartment().sendKeys(department);
		
	}
	
	public void clickSubmitButton () {
		
		this.getSubmitButton().click();
		
	}
	
	public String getTableText () {
		
		
		return this.getTable().getText();
	}
	
	public String getUsersFromTableText () {
		
		
		return this.getUsersFromTable().getText();
	}
	
	/*public void addCustomersInList () {
		
		for (int i=0; i<10; i++) {
			
			users.get(i);
			users.add(this.getUsersFromTableText());
			
		}*/
	
	public String getAddedUserText () {
		
		return this.getAddedUser().getText();
		
	}
	
	
	public void clickDeleteRow1Button () {
		
		this.getDeleteRow1Button().click();
		
	}
	
	public String getFirstRowText () {
		
		return this.getFirstRow().getText();
		
		
	}
	
	
	public void clickEditRow1Button () {
		
		this.getEditRow1Button().click();
	}
	
	public void editFirstNameWebTables (String firstName) {
		
		this.getFirstName().clear();
		this.getFirstName().sendKeys(firstName);
		this.getSubmitButton().click();
		
		
		
	}
	
	
	public void insertTextInSearchBox (String searchText) {
		
		this.getSearchTextBox().clear();
		this.getSearchTextBox().sendKeys(searchText);
		
	}
	
	public void clickOnSearchBoxIcon () {
		
		this.getSearchBoxIcon().click();
		
	}
	
	}
	
		
	

