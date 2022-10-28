package org.help;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.collect.Table.Cell;

import io.cucumber.java.ca.Cal;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	static Actions a;
	
	//public static JavascriptExecutor js = (JavascriptExecutor)driver;
	
	public static void chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		

	}
	public static void closeBrowser() {
		driver.close();

	}
	public static void maxWindow() {
		driver.manage().window().maximize();

	}
	public static void getTitle() {
		String s=driver.getTitle();
		System.out.println("title "+s);
		
	}
	public static void getUrl() {
		String s1= driver.getCurrentUrl();
		System.out.println("Url "+s1);
	}
	public static void loadUrl(String url) {
		driver.get(url);
		
	}
	public static void fill(WebElement webelement ,String text) {
		
		webelement.sendKeys(text);
	
	}
	public static void btnClick(WebElement element) {
		
		element.click();

	}
	public static void windowMaximize() {
		
		driver.manage().window().maximize();

	}
	public static void waitToAllElement() {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	public static void takeSnap(String filename) throws IOException  {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src=tk.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\HP\\eclipse prg\\Ja\\Screenshot.png");
		FileUtils.copyFile(src,des);
	}
	
	
	
	
	public static void moveToElement(WebElement element) {
		a=new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	public static void doubleClick(WebElement element) {
		a=new Actions(driver);
		a.doubleClick(element).perform();
	}
	
	public static void contextClick(WebElement element) {
		a=new Actions(driver);
		a.contextClick(element).perform();
	}
	
	public static void dragAndDrop(WebElement source,WebElement target) {
		a=new Actions(driver);
		a.dragAndDrop(source, target).perform();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
			}