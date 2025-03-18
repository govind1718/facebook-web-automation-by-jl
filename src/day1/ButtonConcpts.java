package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonConcpts {

	  WebDriver driver = null;
	public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://playground.intellectsoftwareacademy.com/buttons");
	}
	//this is button
	public void goToHomePage()
	{
	WebElement goHomeEle =	driver.findElement(By.id("int133"));
	goHomeEle.click();
	}
	public void xyPosition() {
	WebElement xyEle  =	driver.findElement(By.id("int155"));
	Point xypoint =xyEle.getLocation();
	int xvalue=xypoint.getX();
	int yvalue =xypoint.getY();
	System.out.println("x value is" +xvalue);
	System.out.println("y value is" +yvalue);
	}
	public void backgroundColour() {
	WebElement colourEle =	driver.findElement(By.name("color01"));
	String sc=colourEle.getCssValue("background-color");
	System.out.println("backgroundcolor is" +sc);
	}
	public void buttonSize() {
	WebElement btSize =	driver.findElement(By.id("int199"));
	int height=btSize.getSize().getHeight();
	int width=btSize.getSize().getWidth();
	System.out.println("height is" +height + "widh is"+ width); 
	}
	
	public static void main(String[] args) {
		
		ButtonConcpts obj = new ButtonConcpts();
		obj.openBrowser();
		obj.goToHomePage();
		obj.xyPosition();
		obj.backgroundColour();
		obj.buttonSize();
		
		
	}
}
