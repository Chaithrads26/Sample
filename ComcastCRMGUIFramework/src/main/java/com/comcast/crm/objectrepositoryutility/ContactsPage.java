package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
	
	

	public ContactsPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@alt='Create Contact...']")
	private WebElement CreateNewContactBtn;

	public WebElement getCreateNewContactBtn() {
		return CreateNewContactBtn;
	}

}