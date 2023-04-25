package com.pom.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GeneralMathButtonPage {
	 WebDriver driver;
	 By generalmathbtn = By.id("navBox-2");
	 By conversionspeed = By.xpath("//*[@id=\"topicItem\"]/option[16]");
	 By convertvalue = By.name("param0");
	 By convertbtn = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/font/b/form/center/p[3]/input[1]");
	 
     By fractionreduce = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr[1]/td[2]/font/font/a[1]");
     By top = By.name("top");
     By bottom = By.name("bottom");
     By reducebtn = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/center/p/input[3]");
	 
	 public GeneralMathButtonPage (WebDriver driver){
  	   this.driver = driver;
     }
	 
	 
	 public void Clickongeneralmathbtn () {
  	   driver.findElement(generalmathbtn).click();
     }
     
	 public void Clickonconversionspeed () {
	  	   driver.findElement(conversionspeed).click();
	     }
	
	 public void enterconvertvalue(String name) {
			driver.findElement(convertvalue).sendKeys(name);
		}
	 
	 public void Clickonconvertbtn () {
	  	   driver.findElement(convertbtn).click();
	     }
	 
	 public void Clickonfractionreduce () {
	  	   driver.findElement(fractionreduce).click();
	     }
	 
	 public void entertop(String name) {
			driver.findElement(top).sendKeys(name);
		}
	 
	 public void enterbottom(String name) {
			driver.findElement(bottom).sendKeys(name);
		}
	 public void Clickonreducebtn () {
	  	   driver.findElement(reducebtn).click();
	     }
	 
}
