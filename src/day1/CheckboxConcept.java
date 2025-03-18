package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxConcept {
	  WebDriver driver =null;
	  public void openBrowser()
	  	{
	  		driver = new ChromeDriver();
	  		driver.manage().window().maximize();
	  		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  		driver.get("https://playground.intellectsoftwareacademy.com/checkbox");
	  	}
	  	
	  	public void selectLanguage()
	  	{
	  		WebElement selectLanguageEle = driver.findElement(By.id("int00"));
	  		selectLanguageEle.click();
	  		WebElement selectLanguageEle1 = driver.findElement(By.id("int09"));
	  		selectLanguageEle1.click();
	  		WebElement selectLanguageEle2 = driver.findElement(By.id("int010"));
	  		selectLanguageEle2.click();
	  		WebElement selectLanguageEle3 = driver.findElement(By.id("int011"));
	  		selectLanguageEle3.click();
	  	}

		public void confirmIntellectIsChecked()
		{
			WebElement checkedEle =driver.findElement(By.id("int033"));
		    boolean sl =checkedEle.isSelected();
		    System.out.println("intellect is selected"+sl);
		
		    
		}

		public void deSelectOnlyChecked()    //noted
		{
			WebElement firstEle =driver.findElement(By.id("int044"));
			if(firstEle.isSelected()) {
				firstEle.click();
			}
			WebElement secondEle =driver.findElement(By.id("int055"));
			if(secondEle.isSelected()) {
				secondEle.click();
			}
			 
		}

		public void selectAllChecBox()    //noted
		{
			
		}
	  	
	  	public static void main(String[] args) {
	  		
	  		CheckboxConcept obj = new CheckboxConcept();
			obj.openBrowser();
	  		obj.selectLanguage();
	  		obj.confirmIntellectIsChecked();
	  		obj.selectAllChecBox();
	  		
	  	}

}
