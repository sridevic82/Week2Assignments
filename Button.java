package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='pages/Button.html']")).click();
		Point location = driver.findElement(By.id("position")).getLocation();
		System.out.println(location);
		String cssValue = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println(cssValue);
		Dimension size = driver.findElement(By.id("size")).getSize();
		System.out.println(size);
		driver.findElement(By.id("home")).click();
		

	}

}
