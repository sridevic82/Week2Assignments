package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("email")).sendKeys("sridevic82gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Hello");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		
		String text=driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("value");
		System.out.println(text);
		boolean enablebutton=driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		if (enablebutton==true)
		{
			System.out.println("The button is not disabled");
		}
		else
		{
			System.out.println("Disabled is confirmed");
		}
		}
	}


