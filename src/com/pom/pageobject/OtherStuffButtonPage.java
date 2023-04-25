package com.pom.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OtherStuffButtonPage {
	 WebDriver driver;
	 By Otherstuffbtn = By.id("navBox-7");
	 By mass = By.xpath("//*[@id=\"topicItem\"]/option[14]");
	 By covert = By.name("param0");
	 By miligram = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/font/form/b/center/p[1]/select/option[2]");
	 By convertbtn = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/font/form/b/center/p[4]/input[1]");
	 
	 
	    public OtherStuffButtonPage (WebDriver driver){
	    	   this.driver = driver;
	       }

	       public void ClickonOtherstuffbtn () {
	    	   driver.findElement(Otherstuffbtn).click();
	       }
	       
	       public void Clickonmass() {
	    	   driver.findElement(mass).click();
	       }
	       
	       public void entercovert(String name) {
				driver.findElement(covert).sendKeys(name);
			}
	
	       
	       public void Clickonmiligram() {
	    	   driver.findElement(miligram).click();
	       }
	
	
	       public void Clickonconvertbtn() {
	    	   driver.findElement(convertbtn).click();
	       }
	
	       
	
	
	
	

	
	
	
	
	
	
}
