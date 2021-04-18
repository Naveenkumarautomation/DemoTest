package com.symbion.shop.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.symbion.shop.pages.ShopAddingProductsToCart;
import com.symbion.shop.pages.ShopHomePage;
import com.symbion.shop.pages.ShopLoginPage;
import com.symbion.shop.pages.ShopProductOrderingPage;
import com.symbion.shop.pages.ShopTestBase;

public class AddingProductsToCartTest extends ShopTestBase{
	
	ShopLoginPage loginPage;
	ShopHomePage homePage;
	ShopProductOrderingPage productOrderingPage;
	ShopAddingProductsToCart addingProducts;
	
	public AddingProductsToCartTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		Home_Page_Launch();
		loginPage = new ShopLoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		productOrderingPage = new ShopProductOrderingPage();
		addingProducts = new ShopAddingProductsToCart();
}
		
	@Test
	public void addProducts() throws InterruptedException {
		homePage.OrderingMenuSelect();
		Thread.sleep(5000);
		productOrderingPage.searchProducts();
		Thread.sleep(5000);
		addingProducts.addProductsToCart();
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
		
	}

}
