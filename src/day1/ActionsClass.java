package day1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	   WebDriver driver =null;
	   public void openBrowser()
	   	{
	   		driver = new ChromeDriver();
	   		driver.manage().window().maximize();
	   		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   		driver.get("https://playground.intellectsoftwareacademy.com/actionclass");
	   		//driver.get("https://www.intellectsoftwaretechnologies.com/");
	   	}
	   	
	   	public void rightClick() throws AWTException, InterruptedException
	   	{
	   		Actions act =new Actions(driver);
	   		WebElement ele=driver.findElement(By.id("int110"));
	   		act.moveToElement(ele).contextClick().build().perform();
	   		
	   		Robot rt =new Robot();
	   		rt.keyPress(KeyEvent.VK_DOWN);
	   		rt.keyRelease(KeyEvent.VK_DOWN);
	   		Thread.sleep(3000);
	   		rt.keyPress(KeyEvent.VK_DOWN);
	   		rt.keyRelease(KeyEvent.VK_DOWN);
	   		Thread.sleep(3000);
	   		rt.keyPress(KeyEvent.VK_DOWN);
	   		rt.keyRelease(KeyEvent.VK_DOWN);
	   		Thread.sleep(3000);
	   		rt.keyPress(KeyEvent.VK_ENTER);
	   		rt.keyRelease(KeyEvent.VK_ENTER);		
	   	}
	   	public void mouseovertoScreenshot1() throws InterruptedException
	   	{
	   		Actions act =new Actions(driver);
	   		WebElement firstele=driver.findElement(By.xpath("//a[contains(text(),'Courses')]"));
	   		act.moveToElement(firstele).perform();
	   		Thread.sleep(3000);
	   		WebElement secele=driver.findElement(By.xpath("//a[contains(text(),'Software Testing')]"));
	   		act.moveToElement(secele).perform();
	   		Thread.sleep(3000);
	   		WebElement thirdele=driver.findElement(By.xpath("//a[contains(text(),'Selenium')]"));
	   		act.moveToElement(thirdele).click().build().perform();
	   		
	   	}
	   	public void mouseovertoScreenshot2() throws InterruptedException
	   	{
	   		Actions act =new Actions(driver);
	   		WebElement firstele=driver.findElement(By.id("int130"));
	   		WebElement secEle=driver.findElement(By.id("int150"));
	   		
	   		act.moveToElement(firstele).moveToElement(secEle).click().build().perform();
	   		
	   	}
	   	public void doubleClick()
	   	{
	   		Actions act =new Actions(driver);
	   		WebElement Ele=driver.findElement(By.xpath("//strong[contains(text(),'Double Click')]"));
	   		act.moveToElement(Ele).doubleClick().perform();
	   		//act.moveToElement(Ele).doubleClick().build().perform();	
	   	}
		public void DragAndDrop()
	   	{
			driver.navigate().to("https://www.intellectsoftwaretechnologies.com/");
	   		Actions act =new Actions(driver);
	   		WebElement Ele1=driver.findElement(By.id("int121"));
	   		WebElement Ele2=driver.findElement(By.id("int130"));
	   		act.dragAndDrop(Ele1, Ele2).perform();
	   			
	   	}
	   	
	   	
	   	public static void main(String[] args) throws AWTException, InterruptedException {

	   		ActionsClass obj = new ActionsClass();
	   		obj.openBrowser();
	   		//obj.rightClick();
	   		//obj.mouseovertoScreenshot1();
	   		obj.mouseovertoScreenshot2();
	   		//obj.doubleClick();
	   		//obj.DragAndDrop();
	   		
	   		
	   	}
}
