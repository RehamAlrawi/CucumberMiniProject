package com.t3.qa.steps;

import org.openqa.selenium.chrome.ChromeDriver;

import com.t3.qa.utils.Constants;
import com.t3.qa.pages.PurchaseTicketPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PurchaseTicketSteps {
	PurchaseTicketPage flight;
	
	@Given("User Navigate to URL {string}")
	public void userNavigateToUrl(String url) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		Constants.driver = new ChromeDriver();
		Thread.sleep(2000);
		Constants.driver.manage().window().maximize();
		Constants.driver.get(url);
		Thread.sleep(2000);
		
		flight = new PurchaseTicketPage();
		
	}

	@When("User enter fullName {string}")
	public void userEnterFullName(String name) {
	   flight.enterName(name);
	}

	@When("User enter Address {string}")
	public void userEnterAddress(String address) {
		flight.enterAddress(address);
	
	}

	@When("User enter city {string}")
	public void userEnterCity(String city) {
	    flight.enterCity(city);
	}

	@When("User enter state {string}")
	public void userEnterState(String state) {
		flight.enterState(state);
	  
	}

	@When("User enter zipcode {string}")
	public void userEnterZipcode(String zipCode) {
	    flight.enterZipCode(zipCode);
	}

	@When("User chosse card type {string}")
	public void userChosseCardType(String cardType) {
	    flight.chooseCardType(cardType);
	}

	@When("User enter credit card number {string}")
	public void userEnterCreditCardNumber(String cardNum) {
	    flight.enterCreditCardNum(cardNum);
	}

	@When("User enter Month {string}")
	public void userEnterMonth(String month) {
	flight.enterMonthField(month);
	}

	@When("User enter year {string}")
	public void userEnterYear(String year) {
	   flight.enterYearField(year);
	}

	@When("User enter name on card {string}")
	public void userEnterNameOnCard(String name) {
	    flight.enterNameOnCardField(name);
	}

	@When("User click remember me")
	public void userClickRememberMe() {
		flight.clickRemember();
	   
	}

	@When("User click purchase flight button")
	public void userClickPurchaseFlightButton() {
	 flight.clickPurchaseFlight();
	}

	@Then("User verify text {string}")
	public void userVerifyText(String text) throws InterruptedException {
	   flight.textVerify();
	   
	   Thread.sleep(2000);
	   Constants.driver.quit();
	}



}
