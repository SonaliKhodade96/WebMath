package com.pom.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;






public class HomeButtonPage {
       WebDriver driver;
       By homebtn = By.id("navBox-0");
       By divide = By.xpath("//*[@id=\"topicItem\"]/option[66]");
       By divisor = By.name("divisor");
       By dividend = By.name ("dividend");
       By dividebtn = By.xpath("//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/b/form/center/input");
       By logo = By.id("d-logo");
       
       
       
       public HomeButtonPage (WebDriver driver){
    	   this.driver = driver;
       }

       public void Clickonhomebtn () {
    	   driver.findElement(homebtn).click();
       }
       
       public void Clickondivide() {
    	   driver.findElement(divide).click();
       }
       
       public void enterdivisor(String name) {
			driver.findElement(divisor).sendKeys(name);
		}
       
       public void enterdividend(String name) {
			driver.findElement(dividend).sendKeys(name);
		}
       
       public void Clickondividebtn () {
    	   driver.findElement(dividebtn).click();
       }
       
       public void Clickonlogo() {
    	   driver.findElement(logo).click();
       }
       
}  


