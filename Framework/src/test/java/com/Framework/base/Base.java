package com.Framework.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	private static  String GECKO_DRIVER = "webdriver.gecko.driver";
	private static  String GECKO_DRIVER_LOCATION = System.getProperty("user.dir")+ "/src/test/resources"
			+ "/geckodriver";
	private static  String CHROME_DRIVER = "webdriver.chrome.driver";
	private static  String CHROME_DRIVER_LOCATION = System.getProperty("user.dir")+ "/src/test/resources"
			+ "/chromedriver";
	
	
	public Base(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/test/java/com/framework"
					+ "/base/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
