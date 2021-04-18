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
import com.symbion.shop.pages.shoppingCartMiniWindowPage;

public class shoppingCartMiniWindowTest extends ShopTestBase{

	ShopLoginPage loginPage;
	ShopHomePage homePage;
	ShopProductOrderingPage productOrderingPage;
	ShopAddingProductsToCart addingProducts;
	shoppingCartMiniWindowPage cartMiniWindow;
	
	public shoppingCartMiniWindowTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		Home_Page_Launch();
		loginPage = new ShopLoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		productOrderingPage = new ShopProductOrderingPage();
		addingProducts = new ShopAddingProductsToCart();
		cartMiniWindow = new shoppingCartMiniWindowPage();
}
		
	@Test
	public void cartViewButtonClick() throws InterruptedException {
		homePage.OrderingMenuSelect();
		Thread.sleep(5000);
		productOrderingPage.searchProducts();
		Thread.sleep(2000);
		addingProducts.addProductsToCart();
		Thread.sleep(2000);
		cartMiniWindow.viewBtnClick();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
		
	}

}
