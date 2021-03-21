package week2.day1;

import java.util.concurrent.TimeUnit;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Account")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("accountName")).sendKeys("genesis");
		driver.findElement(By.id("groupNameLocal")).sendKeys("testing");
		driver.findElement(By.id("annualRevenue")).sendKeys("120000");
		driver.findElement(By.id("sicCode")).sendKeys("CMA");
		driver.findElement(By.id("officeSiteName")).sendKeys("DLF");
		driver.findElement(By.id("numberEmployees")).sendKeys("10,000");
		//driver.findElement(By.name("parentPartyId")).sendKeys("1006");
		driver.findElement(By.id("tickerSymbol")).sendKeys("LNT");
		driver.findElement(By.name("description")).sendKeys("Creating an account");
	driver.findElement(By.name("importantNote")).sendKeys("account should be created in a day");
	WebElement element1=driver.findElement(By.name("industryEnumId"));
	Select option1=new Select(element1);
	option1.selectByVisibleText("Computer Hardware");
	WebElement element2=driver.findElement(By.name("ownershipEnumId"));
	Select option2=new Select(element2);
	option2.selectByVisibleText("LLC/LLP");
	WebElement element3=driver.findElement(By.name("dataSourceId"));
	Select option3=new Select(element3);
	option3.selectByVisibleText("Cold Call");
	WebElement element4=driver.findElement(By.name("initialTeamPartyId"));
	Select option4=new Select(element4);
	option4.selectByVisibleText("Demo Sales Team No. 2");
	WebElement element5=driver.findElement(By.name("currencyUomId"));
	Select option5=new Select(element5);
	option5.selectByVisibleText("AED - United Arab Emirates Dirham");
	WebElement element6=driver.findElement(By.name("marketingCampaignId"));
	Select option6=new Select(element6);
	option6.selectByVisibleText("Automobile");
	driver.findElement(By.id("primaryPhoneAreaCode")).sendKeys("2");
	driver.findElement(By.id("primaryPhoneExtension")).sendKeys("2020");
	driver.findElement(By.id("primaryEmail")).sendKeys("sridevic82@gmail.com");
	driver.findElement(By.id("primaryPhoneNumber")).sendKeys("657845676");
	driver.findElement(By.id("primaryPhoneAskForName")).sendKeys("Bob");
	driver.findElement(By.id("primaryWebUrl")).sendKeys("Http:sri.com");
	driver.findElement(By.id("generalToName")).sendKeys("devi");
	driver.findElement(By.id("generalAttnName")).sendKeys("devi sri");
	driver.findElement(By.id("generalAddress1")).sendKeys("906 ,600 lolita gardens");
	driver.findElement(By.id("generalAddress2")).sendKeys("missisauga,canada");
	driver.findElement(By.id("generalPostalCode")).sendKeys("L5A3K1");
	driver.findElement(By.id("generalPostalCodeExt")).sendKeys("009");
	WebElement element7=driver.findElement(By.id("generalCountryGeoId"));
	Select option7=new Select(element7);
	option7.selectByVisibleText("Canada");
	driver.findElement(By.id("generalCity")).sendKeys("Missisauga");
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	WebElement element8=driver.findElement(By.id("generalStateProvinceGeoId"));
	Select option8=new Select(element8);
    option8.selectByValue("ON");;
	driver.findElement(By.className("smallSubmit")).click();	

	}

}
