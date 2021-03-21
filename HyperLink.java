package week2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href=\'pages/Link.html\']")).click();
		driver.findElement(By.xpath("(//a[@href='../home.html'])[2]")).click();
		driver.findElement(By.xpath("//a[@href=\'pages/Link.html\']")).click();
		String attribute = driver.findElement(By.xpath("//a[@href='Button.html']")).getAttribute("href");
		System.out.println(attribute);
		driver.findElement(By.xpath("(//a[@href='../home.html'])[3]")).click();
		driver.findElement(By.xpath("//a[@href=\'pages/Link.html\']")).click();
		 String attribute2 = driver.findElement(By.xpath("//a[@href='error.html']")).getAttribute("href");
		 if (attribute2.contains("error"))
		 {
			 System.out.println("broken is verified");
			 
		 }
		 else
		 {
			 System.out.println("it is not broken");
		 }
		 List<WebElement> findElements = driver.findElements(By.xpath("//a[@href]"));
		 int size = findElements.size();
		 System.out.println(size);
		 }

	}


