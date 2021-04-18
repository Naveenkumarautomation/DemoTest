package com.symbion.shop.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.symbion.shop.util.TimeUtil;


public class ShopHomePage extends ShopTestBase{
	
	@FindBy(xpath="//*[@id=\"menuContainer\"]/div/ul/li[3]/a")
	WebElement selectElement;
	
	@FindBy(xpath="//a[contains(text(), 'Product Search/ Place Order')]")
	WebElement elementClick;
	
		
	public ShopHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public ShopProductOrderingPage OrderingMenuSelect() throws InterruptedException {
		selectElement.click();
		Thread.sleep(2000);
		elementClick.click();
		driver.manage().timeouts().implicitlyWait(TimeUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		return new ShopProductOrderingPage();
	}


}
