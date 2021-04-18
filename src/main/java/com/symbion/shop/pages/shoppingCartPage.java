package com.symbion.shop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shoppingCartPage extends ShopTestBase{
	
	@FindBy(id="ctl00_cplMain_btnOrderCart2")
	WebElement placeOrderBtn;
	
			
	public shoppingCartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public submitOrderConfirmationPage placeOrder() throws InterruptedException {
		placeOrderBtn.click();
		Thread.sleep(2000);
		return new submitOrderConfirmationPage();
	}

}
