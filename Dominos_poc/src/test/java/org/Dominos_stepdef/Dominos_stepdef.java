package org.Dominos_stepdef;

import java.util.concurrent.TimeUnit;

import org.baseclass.BaseClass_Dominos;
import org.dominos_runnerclass.Dominos_runner;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import domino_pom.dominos_pom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dominos_stepdef extends BaseClass_Dominos{
	
	WebDriver driver = Dominos_runner.driver;
	
	dominos_pom dp = new dominos_pom(driver);
			
	@Given("Launh the url and maximize")
	public void launh_the_url_and_maximize() {
	   url(driver, "https://www.dominos.co.in/");
	   maximize(driver);
	   driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("click order online button")
	public void click_order_online_button() {
	   toClick(dp.getClickorderonline());
	}

	@Then("Locate the delivery address")
	public void locate_the_delivery_address() {
		toClick(dp.getEnterdeliveryaddress());
		toClick(dp.getEnterarea());
		toSendValues(dp.getEnterarea(), "Old perungalathur,West Tambaram");
		toClick(dp.getSuggestions());
	}

	@Then("select vegpizza and add require quantity")
	public void select_vegpizza_and_add_require_quantity() {
	 toClick(dp.getVegpizza());
	 toClick(dp.getMargherita());
	 toClick(dp.getMargherita2());
	 toClick(dp.getGourmetpizza());
	 toClick(dp.getGourmet2());
	 toClick(dp.getPeppypanner());
	 toClick(dp.getPaneer2());
	}

	@Then("Select beverages and add require quantity")
	public void select_beverages_and_add_require_quantity() {
		toClick(dp.getBeverages());
		toClick(dp.getPepsi());
		for (int i = 1; i < 12; i++) {
			dp.getPespiqty().click();
		}
     }

	@Then("Remove quantity")
	public void remove_quantity() {
	    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	    driver.manage().deleteAllCookies();
	    toClick(dp.getMarghrem());
	    for (int i = 1; i < 7; i++) {
			toClick(dp.getPepsiremove());
		}
	}

	@Then("Click Checkout")
	public void click_checkout() {
		driver.findElement(By.xpath("//button[@data-label='miniCartCheckout']")).click();
		WebElement scroll=driver.findElement(By.xpath("//div[@class='ftr-img']//img[@alt='dominos logo']"));
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView()", scroll);
	   
	}


}
