package com.symbion.shop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class submitOrderConfirmationPage extends ShopTestBase{

	@FindBy(id="ctl00_cplMain_txtCustomerReference")
	WebElement orderRefSelection;
	
	@FindBy(id="ctl00_cplMain_btnSubmitOrder")
	WebElement submitOrderBtn;
	
			
	public submitOrderConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public orderStatusPage ordConfirmation() throws InterruptedException {
		orderRefSelection.sendKeys(prop.getProperty("orderRefNumber"));
		Thread.sleep(2000);
		submitOrderBtn.click();
		Thread.sleep(2000);
		return new orderStatusPage();
	}
	
}

