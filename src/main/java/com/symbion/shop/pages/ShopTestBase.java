package com.symbion.shop.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.symbion.shop.util.TimeUtil;

public class ShopTestBase {
	
	public static Properties prop;
	public static FileInputStream fis;
	public static WebDriver driver;
	static String driverPath = "D:\\chromedriver_win32\\chromedriver.exe";
	
	public static void Home_Page_Launch() throws IOException, InterruptedException{
		prop = new Properties();
		fis = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\SymbionShop\\src\\main\\java\\com\\symbion\\shop\\config\\Config.Properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser") ;
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
		} 
		else { 
			System.out.println("No browser is returned");
		   }
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TimeUtil.PAGE_lOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TimeUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.get(prop.getProperty("url"));
		Thread.sleep(2000);
		String expectedTitle = "Symbion";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

}
	public static void main(String[] args) throws IOException, InterruptedException 
    { 
		Home_Page_Launch();
    } 
	
}
