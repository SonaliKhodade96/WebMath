package com.pom.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlgebraButtonPage {
	 WebDriver driver;	
	 By algebrabtn = By.id("navBox-4");
	 By complexnumber = By.xpath("//*[@id=\"topicItem\"]/option[8]");
	 By problemhere = By.name("s");
	 By computebtn = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/font/b/form/center/p[2]/input[1]");
	
	 By powerofi = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[4]/td[1]/font/font/a[1]");
	 By squareroot = By.name("power");
	 By doitbtn = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/font/b/form/center/p/input");
	 
	 
	 
	 public AlgebraButtonPage (WebDriver driver){
  	   this.driver = driver;
     }

     public void Clickonalgebrabtn () {
  	   driver.findElement(algebrabtn).click();
     }
	
     public void Clickoncomplexnumber () {
    	 driver.findElement(complexnumber).click();
    }
	
     public void enterproblemhere(String name) {
			driver.findElement(problemhere).sendKeys(name);
		}
    
     public void Clickonacomputebtn () {
    	   driver.findElement(computebtn).click();
       }
	
     public void Clickonpowerofi () {
  	   driver.findElement(powerofi).click();
     }
	
     public void entersquareroot(String name) {
			driver.findElement(squareroot).sendKeys(name);
		}
     
     public void Clickdoitbtn () {
    	   driver.findElement(doitbtn).click();
       }
     
	
	
}
