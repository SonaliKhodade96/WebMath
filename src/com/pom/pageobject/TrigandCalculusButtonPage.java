package com.pom.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrigandCalculusButtonPage {
	 WebDriver driver;
	 By trigcalculusbtn = By.id("navBox-6");
	 By windchill = By.xpath("//*[@id=\"topicItem\"]/option[104]");
	 By temperature = By.name("param0");
	 By speed = By.name("param1");
	 By coldbtn = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/center/p/input[1]");
	 
	 By trigonometry = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td[1]/font/font/a[1]");
	 By expressionhere = By.name("s");
	 By clickherebtn = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/center/p[2]/input[1]");
	 
	 
	 
	 
	 public TrigandCalculusButtonPage (WebDriver driver){
  	   this.driver = driver;
     }

     public void Clickontrigcalculusbtn () {
  	   driver.findElement(trigcalculusbtn).click();
     }
     
     public void Clickonwindchill () {
    	   driver.findElement(windchill).click();
       }
     
     public void entertemperature(String name) {
			driver.findElement(temperature).sendKeys(name);
		}
     
     public void enterspeed(String name) {
			driver.findElement(speed).sendKeys(name);
		}
     
     public void Clickoncoldbtn () {
    	   driver.findElement(coldbtn).click();
       }
     
     
     public void Clickontrigonometry () {
  	   driver.findElement(trigonometry).click();
     }
     
     public void enterexpressionhere(String name) {
			driver.findElement(expressionhere).sendKeys(name);
		}
     
     public void Clickonclickherebtn () {
    	   driver.findElement(clickherebtn).click();
       }
     
      
	   
	  
}
