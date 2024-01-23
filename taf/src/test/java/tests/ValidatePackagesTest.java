package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;

import java.io.IOException;

public class ValidatePackagesTest extends TestBase
{

	/*
	 * 1- User registration
	 * 2- Search for product
	 * 3- Add reivew 
	 * 4- Logout
	 */

	HomePage homeObject ; 


	// 1- User Registration 
	@Test(priority=1,alwaysRun=true)
	public void UserCanRegisterSuccssfully() throws InterruptedException, IOException {
		homeObject = new HomePage(driver); 
		homeObject.getCountryOffers();
	}}


