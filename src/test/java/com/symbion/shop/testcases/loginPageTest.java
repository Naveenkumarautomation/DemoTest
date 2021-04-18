package com.symbion.shop.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.symbion.shop.pages.ShopHomePage;
import com.symbion.shop.pages.ShopLoginPage;
import com.symbion.shop.pages.ShopTestBase;

public class loginPageTest extends ShopTestBase{
	
		public static ShopLoginPage loginPage;
		ShopHomePage homePage;
		
		public loginPageTest() {
			super();
		}

		@BeforeMethod
		public void setUp() throws IOException, InterruptedException {
			Home_Page_Launch();
			loginPage = new ShopLoginPage();
			
		}
		
		@Test
		public void loginTest() throws InterruptedException {
			homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		}
		
		@AfterMethod
		public void teardown() {
			driver.quit();
		}

		
	}

