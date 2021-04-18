package com.symbion.shop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orderStatusPage extends ShopTestBase{
	
	@FindBy(xpath="//*[@id=\"wrap\"]/div[4]/div[2]/div[5]/div[1]")				   
	WebElement ordStatusInfo;
	
	public orderStatusPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String orderStatus() throws InterruptedException {
		String OrderStatus = ordStatusInfo.getText();
		Thread.sleep(1000);
		System.out.println(OrderStatus);
		return OrderStatus;
	}

}
