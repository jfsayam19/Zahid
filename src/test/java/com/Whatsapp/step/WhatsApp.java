package com.Whatsapp.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WhatsApp {
        WebDriver driver;
        
        

@Given("I am on faccebook homepage")
public void i_am_on_faccebook_homepage() {
    WebDriverManager.chromedriver().setup();
    
    
    		driver = new ChromeDriver();
    		driver.get("https://www.facebook.com/");
    		driver.manage().window().fullscreen();		
}

@When("I enter {string} and {string}")
public void i_enter_and(String string, String string2) {
  WebElement Sayam = driver.findElement(By.id("email"));
  Sayam.sendKeys(string);
  WebElement Sayam2= driver.findElement(By.id("pass"));
  Sayam2.sendKeys(string2);
	
}

@When("I click on login button")
public void i_click_on_login_button() {
   WebElement sayam3 = driver.findElement(By.name("login"));
   sayam3.submit();
   
	
	
	
}

@Then("I see my facebook profile")
public void i_see_my_facebook_profile() {
   
	//driver.close();
	
}
	
	
	
	
	
}
