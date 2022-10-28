package org.stepdefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import io.cucumber.core.cli.Main;

import org.help.AmzPojo;
import org.help.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef extends BaseClass {
	public WebDriver driver;
	AmzPojo a;
	@Given("user is in amazon page")
	public void userIsInAmazonPage() {
	    loadUrl("https://www.amazon.in/");
	    maxWindow();
	}

	@When("user has in mobiles")
	public void userHasInMobiles() {
		a = new AmzPojo();
		btnClick(a.getMobileicon());
		btnClick(a.getAppleicon());
	}

	@When("user in apple page")
	public void userInApplePage() {
	    fill(a.getSearchbox(), "iphone12");
	    btnClick(a.getSearchicon());
	}

	@When("user in iphone page")
	public void userInIphonePage() throws InterruptedException {
		btnClick(a.getIphoneicon());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(10000);
		
		String parentId = driver.getTitle();
		System.out.println(parentId);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> li = new ArrayList<String>();
		li.addAll(windowHandles);
		driver.switchTo().window(li.get(2));
		btnClick(a.getBuynow());
	   	}

	@When("user in address page")
	public void userInAddressPage() {
	    
	}


	
	}
