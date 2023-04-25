package com.pom.main;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import com.pom.pageobject.AlgebraButtonPage;
import com.pom.pageobject.ContactUSLink;
import com.pom.pageobject.GeneralMathButtonPage;
import com.pom.pageobject.HomeButtonPage;
import com.pom.pageobject.KMathButtonPage;
import com.pom.pageobject.MathForEveryoneButtonPage;
import com.pom.pageobject.OtherStuffButtonPage;
import com.pom.pageobject.PlotsandGeometryButtonPage;
import com.pom.pageobject.TrigandCalculusButtonPage;

public class WebMathPOMMain {

	public static void main(String[] args) {
		try {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://webmath.com/index.html");
			Thread.sleep(2000);

//Home Button //
			HomeButtonPage homebtn = new HomeButtonPage(driver);
			Thread.sleep(2000);
			homebtn.Clickonhomebtn();
			Thread.sleep(2000); 
			homebtn.Clickondivide();
			Thread.sleep(2000); 
			homebtn.enterdivisor("5"); 
			Thread.sleep(2000);
			homebtn.enterdividend("20");
			Thread.sleep(2000); 
			homebtn.Clickondividebtn();
			Thread.sleep(2000); 
			homebtn.Clickonlogo(); 
			Thread.sleep(1000);
			 

//Math For Everyone//

			
			
			  MathForEveryoneButtonPage mathforeveryone = new MathForEveryoneButtonPage(driver); 
			  Thread.sleep(2000); 
			  mathforeveryone.Clickonmathbtnbtn ();
			  Thread.sleep(2000); 
			  mathforeveryone.Clickonconversion ();
			  Thread.sleep(2000);
			  mathforeveryone.entercconvert ("100"); 
			  Thread.sleep(2000);
			  mathforeveryone.Clickontosquinch(); 
			  Thread.sleep(2000);
			  mathforeveryone.Clickoncovertbtn(); 
			  Thread.sleep(2000);
			  homebtn.Clickonlogo(); 
			  Thread.sleep(1000);
			  
			  mathforeveryone.Clickonmathbtnbtn (); 
			  Thread.sleep(2000);
			  mathforeveryone.Clickonsaleprize(); 
			  Thread.sleep(2000);
			  mathforeveryone.enteroriginalcost("45000"); 
			  Thread.sleep(2000);
			  mathforeveryone.enterpercentoff("3"); 
			  Thread.sleep(2000);
			  mathforeveryone.Clickonfigurecostbtn(); 
			  Thread.sleep(2000);
			  homebtn.Clickonlogo(); 
			  Thread.sleep(1000);
			 
//General Math //

			
			
			  GeneralMathButtonPage generalmathbtn = new GeneralMathButtonPage (driver);
			  generalmathbtn.Clickongeneralmathbtn (); 
			  Thread.sleep(2000);
			  generalmathbtn.Clickonconversionspeed(); 
			  Thread.sleep(2000);
			  generalmathbtn.enterconvertvalue ("60"); 
			  Thread.sleep(2000);
			  generalmathbtn.Clickonconvertbtn(); 
			  Thread.sleep(2000);
			  homebtn.Clickonlogo(); 
			  Thread.sleep(1000);
			  
			  generalmathbtn.Clickongeneralmathbtn ();
			  Thread.sleep(2000);
			  generalmathbtn.Clickonfractionreduce(); 
			  Thread.sleep(2000);
			  generalmathbtn.entertop("10"); 
			  Thread.sleep(2000);
			  generalmathbtn.enterbottom("42"); 
			  Thread.sleep(2000);
			  generalmathbtn.Clickonreducebtn(); 
			  homebtn.Clickonlogo(); 
			  Thread.sleep(1000);
			 
			  

//K-8 Math//

			
			
			  KMathButtonPage kmathbtn = new KMathButtonPage (driver);
			  kmathbtn.Clickonkmathbtn(); 
			  Thread.sleep(2000);
			  kmathbtn.Clickoncompoundinterset(); 
			  Thread.sleep(2000);
			  kmathbtn.enterborrowed("5000"); 
			  Thread.sleep(2000);
			  kmathbtn.enterpercentage("3"); 
			  Thread.sleep(2000);
			  kmathbtn.enterperyear("2"); 
			  Thread.sleep(2000); 
			  kmathbtn.enterafteryear("1");
			  Thread.sleep(2000); 
			  kmathbtn.Clickonnewamtbtn();
			  Thread.sleep(2000);
			  homebtn.Clickonlogo(); 
			  Thread.sleep(1000);
			  
			  
			  kmathbtn.Clickonkmathbtn(); 
			  Thread.sleep(2000); 
			  kmathbtn.Clickonnumberline();
			  Thread.sleep(2000); 
			  kmathbtn.enternumberhere("2,5,6,8,9,7");
			  Thread.sleep(2000); 
			  kmathbtn.Clickonshowme(); 
			  Thread.sleep(2000);
			  homebtn.Clickonlogo(); 
			  Thread.sleep(1000);
			 
			  
			  
//Algebra //

			
			
			  AlgebraButtonPage algebrabtn = new AlgebraButtonPage (driver);
			  algebrabtn.Clickonalgebrabtn(); 
			  Thread.sleep(2000);
			  algebrabtn.Clickoncomplexnumber(); 
			  Thread.sleep(2000);
			  algebrabtn.enterproblemhere("4i-5+12i-(5+6)(52-32)"); 
			  Thread.sleep(2000);
			  algebrabtn.Clickonacomputebtn(); 
			  Thread.sleep(2000); 
			  homebtn.Clickonlogo();
			  Thread.sleep(1000);
			  
			  algebrabtn.Clickonalgebrabtn(); 
			  Thread.sleep(2000);
			  algebrabtn.Clickonpowerofi(); 
			  Thread.sleep(2000);
			  algebrabtn.entersquareroot("25"); 
			  algebrabtn.Clickdoitbtn();
			  Thread.sleep(2000); 
			  homebtn.Clickonlogo(); 
			  Thread.sleep(1000);
			 
			
//Plots and Geometry //
			
			
			  PlotsandGeometryButtonPage plotsgeometrybtn = new PlotsandGeometryButtonPage
			  (driver); plotsgeometrybtn.ClickonpoltsGeomertybtn(); 
			  Thread.sleep(2000);
			  plotsgeometrybtn.Clickonsubtracting(); 
			  Thread.sleep(2000);
			  plotsgeometrybtn.enterproblemhere("(6i+2)-(9+3i)"); 
			  Thread.sleep(2000);
			  plotsgeometrybtn.Clickonsubtractbtn(); 
			  Thread.sleep(2000);
			  homebtn.Clickonlogo(); 
			  Thread.sleep(1000);
			  
			  plotsgeometrybtn.ClickonpoltsGeomertybtn(); 
			  Thread.sleep(2000);
			  plotsgeometrybtn.Clickonrighttriangles(); 
			  Thread.sleep(2000);
			  plotsgeometrybtn.entertriangle("100"); 
			  Thread.sleep(2000);
			  plotsgeometrybtn.enterheight("65"); 
			  Thread.sleep(2000);
			  plotsgeometrybtn.Clickondobtn(); 
			  Thread.sleep(2000); 
			  homebtn.Clickonlogo();
			  Thread.sleep(1000);
			 
			
			
//Trig and Calculus //
			
			  TrigandCalculusButtonPage tricalculus = new TrigandCalculusButtonPage
			  (driver); tricalculus.Clickontrigcalculusbtn(); 
			  Thread.sleep(2000);
			  tricalculus.Clickonwindchill(); 
			  Thread.sleep(2000);
			  tricalculus.entertemperature("45"); 
			  Thread.sleep(2000);
			  tricalculus.enterspeed("13"); 
			  Thread.sleep(2000);
			  tricalculus.Clickoncoldbtn(); 
			  Thread.sleep(2000); 
			  homebtn.Clickonlogo();
			  Thread.sleep(1000);
			 
			  tricalculus.Clickontrigcalculusbtn(); 
			  Thread.sleep(2000);
			  tricalculus.Clickontrigonometry();
			  Thread.sleep(2000);
			  tricalculus.enterexpressionhere("sin(6)^2+cos(18)^2");
			  Thread.sleep(2000);
			  tricalculus.Clickonclickherebtn();
			  Thread.sleep(2000);
			  homebtn.Clickonlogo();
			  Thread.sleep(1000);
			  
//Other Stuff //

			
			  OtherStuffButtonPage otherstuff = new OtherStuffButtonPage (driver);
			  otherstuff.ClickonOtherstuffbtn(); 
			  Thread.sleep(2000);
			  otherstuff.Clickonmass(); 
			  Thread.sleep(2000); 
			  otherstuff.entercovert("50");
			  Thread.sleep(2000); 
			  otherstuff.Clickonmiligram(); 
			  Thread.sleep(2000);
			  otherstuff.Clickonconvertbtn(); 
			  Thread.sleep(2000); 
			  homebtn.Clickonlogo();
			  Thread.sleep(1000);
			 
			
			
			
//Contact Us //
     
			
			  ContactUSLink contactus = new ContactUSLink(driver);
			  contactus.Clickongeneralmathbtn(); 
			  Thread.sleep(2000); 
			  homebtn.Clickonlogo();
			  Thread.sleep(1000);
			 
			
			
			
			
		} catch (Exception e) {
		}

	}

}
