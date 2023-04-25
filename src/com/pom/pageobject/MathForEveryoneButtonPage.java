package com.pom.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MathForEveryoneButtonPage {
	WebDriver driver;
    By mathbtn = By.id("navBox-1");
    By conversion = By.xpath("//*[@id=\"topicItem\"]/option[12]");
    By convert = By.name("param0");
    By tosquinch = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/form/center/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/font/b/p[3]/select/option[3]");
    By covertbtn = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/form/center/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/font/p/b/input[1]");

    By saleprize = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table/tbody/tr[1]/td[1]/font/font/a[2]");
    By originalcost = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/center/p[1]/input");
    By percentoff = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/center/p[2]/input");
    By figurecostbtn = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/center/p[3]/input[1]");
    
    public MathForEveryoneButtonPage (WebDriver driver){
 	   this.driver = driver;
    }
    
    public void Clickonmathbtnbtn () {
 	   driver.findElement(mathbtn).click();
    }
    
    public void Clickonconversion() {
    	driver.findElement(conversion).click();
    }
    
	public void entercconvert(String name) {
			driver.findElement(convert).sendKeys(name);
	}		
	
	public void Clickontosquinch() {
		driver.findElement(tosquinch).click ();
		
	}
	

	public void Clickoncovertbtn() {
		driver.findElement(covertbtn).click ();
		
	}

	 public void Clickonsaleprize() {
			driver.findElement(saleprize).click ();
			
		}
		
		public void enteroriginalcost(String name) {
			driver.findElement(originalcost).sendKeys(name);
			
		}

		public void enterpercentoff(String name) {
			driver.findElement(percentoff).sendKeys(name);
			
		}

		public void Clickonfigurecostbtn() {
			driver.findElement(figurecostbtn).click ();
			
		}
	
	
	
	
	
	
	
	
	
	
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


