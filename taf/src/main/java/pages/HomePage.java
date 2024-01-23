package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;

import java.io.PrintStream;
import java.util.Collections;
import java.util.List;

public class HomePage extends PageBase
{
	public HomePage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver; 
		action = new Actions(driver); 
	}
	
	@FindBy(id="country-btn")
	WebElement countryBtn ;

	@FindBy(id="country-selct")
	WebElement countryList ;

	@FindBy(id="name-لايت")
	WebElement lightPkg;
	@FindBy(xpath = "//*[@id=\"currency-لايت\"]/b")
	WebElement lightpkgPrice;
	@FindBy(xpath = "//*[@id=\"currency-لايت\"]/i")
	WebElement lightpkgCurrency;
	@FindBy(id="name-الأساسية")
	WebElement mainPkg;
	@FindBy(xpath = "//*[@id=\"currency-الأساسية\"]/b")
	WebElement mainpkgPrice;
	@FindBy(xpath = "//*[@id=\"currency-الأساسية\"]/i")
	WebElement mainpkgCurrency;


	@FindBy(id="name-بريميوم")
	WebElement premPkg;
	@FindBy(xpath = "//*[@id=\"currency-بريميوم\"]/b")
	WebElement prempkgPrice;
	@FindBy(xpath = "//*[@id=\"currency-بريميوم\"]/i")
	WebElement prempkgCurrency;





	String[] countriescodes = {"eg", "ae", "dj"};


	public void getCountryOffers() throws InterruptedException, IOException {
		PrintStream fileStream = new PrintStream(new File("file.txt"));

		clickButton(countryBtn);

		for (int i = 0; i < countriescodes.length; i++) {

			List<WebElement> countries
					= countryList.findElements(By.tagName("a"));

			for( WebElement country : countries)

		{
			//
            if(country.getAttribute("id").equals(countriescodes[i]))
			{
			System.out.println(country.getAttribute("id"));



			clickButton(country);
			Thread.sleep(10000);
				fileStream.println(lightPkg.getText()+" "+lightpkgPrice.getText()+" "+lightpkgCurrency.getText()+" "+mainPkg.getText()+" "+mainpkgPrice.getText()+" "+mainpkgCurrency.getText()+" "+premPkg.getText()+" "+prempkgPrice.getText()+" "+prempkgCurrency.getText());



			clickButton(countryBtn);
			//output.close();

			break;}


		}}


	}
	



	

	

	

}
