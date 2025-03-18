package day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownConcept {

	WebDriver driver =null;
	public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://playground.intellectsoftwareacademy.com/dropdown");
	}

	public void selectByIndex()
	{
		WebElement indexEle= driver.findElement(By.name("dropdown1"));
		Select st= new Select(indexEle);
		st.selectByIndex(4);
		//st.deSelectByContainsVisibleText("APPI");

	}
	public void selectVisibleByText()
	{
		WebElement textEle= driver.findElement(By.name("dropdown1"));
		Select tk= new Select(textEle);
		tk.selectByVisibleText("APPIUM");
	}
	public void selectByValue()
	{
		WebElement valueEle= driver.findElement(By.name("dropdown1"));
		Select vt= new Select(valueEle);
		vt.selectByValue("3");
	}
	public void getnumberofDropdownOptionsList()
	{
		WebElement numberoflistEle= driver.findElement(By.name("dropdown1"));
		Select num= new Select(numberoflistEle);
		List <WebElement> numlist =  num.getOptions();
		int sizes =numlist.size();
		System.out.println("number of list is" + sizes);
	}
	public void sendkeyToSelect()
	{
		WebElement searchEle= driver.findElement(By.name("dropdown1"));
		searchEle.sendKeys("LOADRUNNER");
	}
	public void multipleValueSelect()
	{
		WebElement multiEle= driver.findElement(By.xpath("(//Select[@name='dropdown1'])[2]"));
		Select ms= new Select(multiEle);
		ms.selectByIndex(0);
		ms.selectByIndex(1);
		ms.selectByIndex(2);
	}
	public void selecteddDeafultValue()
	{
		WebElement valueEle= driver.findElement(By.name("dropdown1"));
		Select vt= new Select(valueEle);
	    String dfvalue =vt.getFirstSelectedOption().getText();
	    System.out.println(dfvalue);
	}
	

	public static void main(String[] args) {

		DropdownConcept obj = new DropdownConcept();
		obj.openBrowser();
		//obj.selectByIndex();
		//obj.selectVisibleByText();
		//  obj.selectByValue();
		// obj.getnumberofDropdownOptionsList();
		//obj.sendkeyToSelect();
		// obj.multipleValueSelect();
		 obj.selecteddDeafultValue();




	}
}
