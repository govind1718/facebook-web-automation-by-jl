package day1;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CondtionsConcept {
    WebDriver driver =null;
public void openBrowser()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("https://playground.intellectsoftwareacademy.com/send_keys");
}	
public void isEnabledButtonOrElement()
{
WebElement ele1 =	driver.findElement(By.name("cofirm")); //already disabled
//WebElement ele1 =	driver.findElement(By.name("emailcontent"));   //before is enable after typing govind
if(ele1.isEnabled() == true)
{
	ele1.sendKeys("govind");
}
else {
	System.out.print("element is disabled");
}
}

public void isSelectedCheckboxRadio()
{
	driver.navigate().to("https://playground.intellectsoftwareacademy.com/checkbox");
	WebElement ele2 =	driver.findElement(By.id("int033"));  // already checkbox selected
 //WebElement ele2 =	driver.findElement(By.id("int00")); //before checkbox not selected...after To select
	if(ele2.isSelected() == true)
	{
		System.out.print("element already selected");
	}
	else {
		
		ele2.click();
	}
}

public void isDisplayedElements()  //else path not there
{
	driver.navigate().to("https://playground.intellectsoftwareacademy.com/checkbox");
	try {
	WebElement ele3 =	driver.findElement(By.name("234"));  //wrong element -after no such element
	//WebElement ele3 =	driver.findElement(By.id("int00")); //right element after element is available
	if(ele3.isDisplayed() == true)
	{
		System.out.print("element is avaiable or display");
	}
	}
	catch (NoSuchElementException e) {
		System.out.print("element not availble");
	}	
	
}
public static void main(String[] args) {

	CondtionsConcept obj = new CondtionsConcept();
	obj.openBrowser();	
	//obj.isEnabledButtonOrElement();
	//obj.isSelectedCheckboxRadio();
	obj.isDisplayedElements();
}
}
