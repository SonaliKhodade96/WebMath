package com.pom.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlotsandGeometryButtonPage {
	 WebDriver driver;
	 By poltsGeomertybtn = By.id("navBox-5");
	 By subtracting = By.xpath("//*[@id=\"topicItem\"]/option[11]");
	 By problemhere = By.name("s");
	 By subtractbtn = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/font/b/form/center/p[2]/input[1]");
	
	 By righttriangles = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[2]/td[2]/font/font/a[7]");
	 By triangle = By.name("param_value");
	 By height = By.name("param_value1");
	 By dobtn = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/p/input[4]");	 
	 
	 
	 
	 
	 
	 public PlotsandGeometryButtonPage (WebDriver driver){
  	   this.driver = driver;
     }

     public void ClickonpoltsGeomertybtn () {
  	   driver.findElement(poltsGeomertybtn).click();
     }
     
     public void Clickonsubtracting () {
    	   driver.findElement(subtracting).click();
       }
	
     public void enterproblemhere(String name) {
			driver.findElement(problemhere).sendKeys(name);
		}
	
     public void Clickonsubtractbtn () {
    	   driver.findElement(subtractbtn).click();
       }
	
     public void Clickonrighttriangles() {
  	   driver.findElement(righttriangles).click();
     }

     public void entertriangle(String name) {
			driver.findElement(triangle).sendKeys(name);
		}
     
     public void enterheight(String name) {
			driver.findElement(height).sendKeys(name);
		}
    		 
     public void Clickondobtn() {
    	   driver.findElement(dobtn).click();
       }
	 	
	
}
