package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Baseclass {
public static WebDriver driver;

public static  WebDriver launchbrowser(String browsername) {
	if(browsername.equalsIgnoreCase("Chrome")) {
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\Lokesh Naidu\\eclipse-workspace\\lerantest\\driver\\chromedriver.exe");
		    driver=new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Lokesh Naidu\\eclipse-workspace\\lerantest\\driver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}else if(browsername.equalsIgnoreCase("InternetExplorer")) {
			System.setProperty("webdriver.ie.driver","C:\\Users\\Lokesh Naidu\\eclipse-workspace\\lerantest\\driver\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
	 driver.manage().window().maximize();
	 return driver;
	   	
	}

}


