package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.page.HomePage;

public class HomePageTestCases extends TestBase{
	HomePage homePage;
  public HomePageTestCases() {
	  super();
  }
  @BeforeClass
  public void setUp() {
	  Initialization();
	  homePage = new HomePage();
  }
  @Test(enabled=false)
  public void clickOnSignUpButton() throws InterruptedException {
	  homePage.clicksSignUpButton();
	  //homePage.clicksSignUpCloseButton();
	  homePage.clicksignupNameEnterText("Name@1234");
	  homePage.clicksignupPasswordEnterText("Password");
	  homePage.clicksignupButton();
	  
  }
  @Test
  public void clickOnLoginButton() throws InterruptedException {
	  homePage.clicksLoginButton();
	  homePage.clickLoginUsername("Test");
	  homePage.clickLoginPassword("Test");
	  homePage.clickLoginCreateButton();
	  homePage.clicksLoginCloseButton();
  }
  @Test(enabled=false)
  public void clickOnContactButton() throws InterruptedException {
	  homePage.clicksContactButton();
	  homePage.contactEmailEnterText("Testmail");
	  homePage.contactNameEnterText("Testname");
	  homePage.contactMessageEnterText("Testmessage");
	  homePage.clickSendMessage();
  } 
  
}
