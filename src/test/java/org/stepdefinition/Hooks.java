package org.stepdefinition;

import org.help.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{
	@Before
	public void bfexe() {
		chromeBrowser();
	}
	
	@After
	public void aftexe() {
		//closeBrowser();
	}
	
	
}
