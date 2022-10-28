package org.help;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmzPojo extends BaseClass{
	public AmzPojo() {
	PageFactory.initElements(driver, this);	
	
	}
	@FindBy(id="ap_email")
	private WebElement txtUser;

	@FindBy(id="ap_password")
	private WebElement txtpass;
	
	@FindBy(xpath="(//a[@class='nav-a nav-a-2   nav-progressive-attribute'])[1]")
	private WebElement bt;

	@FindBy(name="login")
	private WebElement login;
	
	public WebElement getBt() {
		return bt;
	}
	@FindBy(id="continue")
	private WebElement continuebtn;
	
	@FindBy(id="signInSubmit")
	private WebElement signinbtn;
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchbox;
	
	@FindBy(id="nav-search-submit-button")
	private WebElement searchicon;
	
	@FindBy(xpath="//span[text()='Apple iPhone 12 (128GB) - Blue']")
	private WebElement iphoneicon;
	
	@FindBy(id="buy-now-button")
	private WebElement buynow;
	
	@FindBy(xpath="//span[text()=' Colour: ']")
	private WebElement colouricon;
	
	@FindBy(xpath="//a[text()='Mobiles']")
	private WebElement mobileicon;
	
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[7]")
	private WebElement appleicon;
	//(//span[text()='59,999'])[2]
	//(//span[text()='₹59,999.00'])[6]		
	@FindBy(xpath="(//span[text()='₹59,999.00'])[6]")
	private WebElement amt;
	

	public WebElement getAmt() {
		return amt;
	}

	public WebElement getAppleicon() {
		return appleicon;
	}

	public WebElement getMobileicon() {
		return mobileicon;
	}

	public WebElement getColouricon() {
		return colouricon;
	}

	public WebElement getBuynow() {
		return buynow;
	}

	public WebElement getIphoneicon() {
		return iphoneicon;
	}

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getSearchicon() {
		return searchicon;
	}

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

	public WebElement getSigninbtn() {
		return signinbtn;
	}
	
	

	
//rightclik-src-generate getter and setters

}
