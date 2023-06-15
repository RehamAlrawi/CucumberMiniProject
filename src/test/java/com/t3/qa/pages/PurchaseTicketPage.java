package com.t3.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.t3.qa.utils.Constants;



public class PurchaseTicketPage {
	@FindBy(id = "inputName")
	WebElement fullNameField;
	
	@FindBy(id = "address")
	WebElement addressField;
	
	@FindBy(id = "city")
	WebElement cityField;
	
	@FindBy(id = "state")
	WebElement stateField;
	
	@FindBy(id = "zipCode")
	WebElement zipCodeField;
	
	@FindBy(id = "cardType")
	WebElement chooseCardType;
	
	@FindBy(id = "creditCardNumber")
	WebElement creditCardNumField;
	
	@FindBy(id = "creditCardMonth")
	WebElement monthField;
	
	@FindBy(id = "creditCardYear")
	WebElement yearField;
	
	@FindBy(id = "nameOnCard")
	WebElement nameOnCardField;
	
	@FindBy (id = "rememberMe")
	WebElement clickRemember ;
	
	@FindBy (xpath = "//input[@class='btn btn-primary']")
	WebElement clickPurchaseFlight ;
	
	@FindBy (xpath = "//h1[text()='Thank you for your purchase today!']")
	WebElement textVerification;
	
	
	public PurchaseTicketPage() {
		PageFactory.initElements(Constants.driver, this);
	}
	
	public void enterName (String name) {
		fullNameField.sendKeys(name);
	}
	
	public void enterAddress (String address) {
		addressField.sendKeys(address);
	}
	
	public void enterCity (String city) {
		cityField.sendKeys(city);
	}
	
	public void enterState (String state) {
		stateField.sendKeys(state);
	}
	
	public void enterZipCode (String zipCode) {
		zipCodeField.sendKeys(zipCode);
	}
	
	public void chooseCardType (String cardType ) {
		Select select = new Select (chooseCardType);
		select.selectByVisibleText(cardType);
		
	}
	
	public void enterCreditCardNum (String creditCardNum) {
		creditCardNumField.sendKeys(creditCardNum);
	}
	
	public void enterMonthField(String month) {
		monthField.sendKeys(month);
	}
	
	public void enterYearField(String year) {
		yearField.sendKeys(year);
	}
	public void enterNameOnCardField (String name) {
		nameOnCardField.sendKeys(name);
	}
	
	public void clickRemember () {
		clickRemember.click();
	}
	
	public void clickPurchaseFlight () {
		clickPurchaseFlight.click();
	}
	
	public void textVerify (){
		System.out.println(textVerification.getText());
		
	}
	

	
	
	
	
	
	
	

}
