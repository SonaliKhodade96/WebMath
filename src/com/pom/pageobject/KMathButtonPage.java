package com.pom.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KMathButtonPage {
    WebDriver driver;
	By kmathbtn = By.id("navBox-3");
	By compoundinterset = By.xpath("//*[@id=\"topicItem\"]/option[53]");
	By borrowed = By.name("principal");
	By percentage = By.name("interest");
	By peryear = By.name("compound");
	By afteryear = By.name("desired_time");
	By newamtbtn = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/font/b/form/center[5]/input");
	
	By numberline = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr/td/table/tbody/tr[1]/td[1]/font/font/a[7]");
	By numberhere = By.name("n");
	By showme = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/center/p[2]/input[1]");
	
	public KMathButtonPage (WebDriver driver){
 	   this.driver = driver;
    }

    public void Clickonkmathbtn () {
 	   driver.findElement(kmathbtn).click();
    }
    
    public void Clickoncompoundinterset () {
  	   driver.findElement(compoundinterset).click();
     }
	
    public void enterborrowed(String name) {
		driver.findElement(borrowed).sendKeys(name);
	}
   
	public void enterpercentage(String name) {
		driver.findElement(percentage).sendKeys(name);
	}
	
	public void enterperyear(String name) {
		driver.findElement(peryear).sendKeys(name);
	}
	
	public void enterafteryear(String name) {
		driver.findElement(afteryear).sendKeys(name);
	}
	
	 public void Clickonnewamtbtn () {
	 	   driver.findElement(newamtbtn).click();
	    }
	    
	 public void Clickonnumberline () {
	 	   driver.findElement(numberline).click();
	    }
	 
	 public void enternumberhere(String name) {
			driver.findElement(numberhere).sendKeys(name);
		}
	 
	 
	 public void Clickonshowme () {
	 	   driver.findElement(showme).click();
	    }
	 
	 
	 
	 
	 
	
	
	
	
}
