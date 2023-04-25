package com.pom.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUSLink {
	WebDriver driver;
	By contact = By.xpath("//*[@id=\"d-innerBottomContainer\"]/div[1]/a[2]"); 
	
	public ContactUSLink (WebDriver driver){
	  	   this.driver = driver;
	     }
		 
		 
		 public void Clickongeneralmathbtn () {
	  	   driver.findElement(contact).click();
	     }
	     
	
	
	
	
	
	
	
	
	
	
	
	
}
