package day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;

public class OptionsValueValidate {
	   WebDriver driver =null;
	   public void openBrowser()
	   	{
	   		driver = new ChromeDriver();
	   		driver.manage().window().maximize();
	   		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   		driver.get("https://playground.intellectsoftwareacademy.com/dropdown");
	   	}
	   	
	   	public void optionValueValidate()
	   	{
	   
	   		List<String> addingValue = new ArrayList<String>();
	   		addingValue.add("SELENIUM");
	   		addingValue.add("GOVIND");
	   		addingValue.add("APPIUM");
	   		addingValue.add("UFT/QTP");
	   		addingValue.add("LOADRUNNER");
	  // 		System.out.println(addingValue);
	   		  		
	   	WebElement	btnEle =driver.findElement(By.xpath("//a[@href='dropdown']"));
	   	btnEle.click();
	     	
	   	List<WebElement> optionlist =driver.findElements(By.xpath("/select[id='int101']/option"));
	   	List<String> actaldropdown = new ArrayList<String>();
	    for(WebElement opl :optionlist)
	    {
	    	System.out.println(opl.getText());
	    	actaldropdown.add(opl.getText());
	    	if(addingValue.equals(actaldropdown))
	    	{
	    		System.out.println("dropdwon list is same");
	    	}else
	    	{
	    		System.out.println("dropdwon list  not same");
	    	}
	    }
	  
	   	}
	   	
	   	public static void main(String[] args) {

	   		OptionsValueValidate obj = new OptionsValueValidate();
	   		obj.openBrowser();
	   		obj.optionValueValidate();
	   		
	   		
	   	}
}
