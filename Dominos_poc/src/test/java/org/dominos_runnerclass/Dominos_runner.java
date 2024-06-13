package org.dominos_runnerclass;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\Dominos_feature\\Dominos.feature", glue="org.Dominos_stepdef")

public class Dominos_runner {

	public static WebDriver driver;
	
	@BeforeClass
	
	public static void Start() {
		driver = new ChromeDriver();

	}
	
}
