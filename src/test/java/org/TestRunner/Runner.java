package org.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\resources", glue = "org.stepdefinition", monochrome = true, dryRun = false, snippets = io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE, strict = true, plugin= {"html:target","junit:junit\\file1.xml","json:jsonreport\\file2.json"})

public class Runner {

}
