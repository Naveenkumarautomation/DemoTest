package com.symbion.shop.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.symbion.shop.pages.ShopHomePage;
import com.symbion.shop.pages.ShopLoginPage;
import com.symbion.shop.pages.ShopProductOrderingPage;
import com.symbion.shop.pages.ShopTestBase;

public class ProductOrderingPageTest extends ShopTestBase{
	
		ShopLoginPage loginPage;
		ShopHomePage homePage;
		ShopProductOrderingPage productOrderingPage;
		
		public ProductOrderingPageTest() {
			super();
		}
		
		@BeforeMethod
		public void setUp() throws IOException, InterruptedException {
			Home_Page_Launch();
			loginPage = new ShopLoginPage();
			homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
			productOrderingPage = new ShopProductOrderingPage();
	}
			
		@Test
		public void OrderingSelection() throws InterruptedException {
			homePage.OrderingMenuSelect();
			Thread.sleep(5000);
			productOrderingPage.searchProducts();
			Thread.sleep(2000);
		}
		
		@AfterMethod
		public void teardown() {
			driver.quit();
			
		}



}
