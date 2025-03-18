package day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcepts {
    WebDriver driver =null;
public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://playground.intellectsoftwareacademy.com/navigation");
	}
	
	public void gotoHomepage()   
	{
		WebElement linkEle =driver.findElement(By.linkText("HOMEPAGE"));
		linkEle.click();
		driver.navigate().back();
	}
	public void findwhereiamWithoutClickingMe()
	{
		WebElement wherwfindEle =driver.findElement(By.partialLinkText("FIND"));
		String where = wherwfindEle.getDomAttribute("href");
		System.out.println("this is link going to "+ where);
	}
	public void verifyiamBroken()
	{
		WebElement brokeEle =driver.findElement(By.linkText("AM I BROKEN ?"));
		brokeEle.click();
		String tl=driver.getTitle();
		if(tl.contains("404")) {
			System.out.println("Link is broken ");
		}
		driver.navigate().back();
	}
	public void interactWithSamelink()   //noted
	{
		
	}
	public void howmanylinksAvailableThispage()
	{
		List<WebElement> totalLinks =driver.findElements(By.tagName("a"));
		int counts = totalLinks.size();
		System.out.println("total link count is "+ counts);
		
	}
	
	public static void main(String[] args) {

		NavigationConcepts obj = new NavigationConcepts();
		obj.openBrowser();
		obj.gotoHomepage();
		obj.findwhereiamWithoutClickingMe();
		obj.verifyiamBroken();
		obj.interactWithSamelink();
		obj.howmanylinksAvailableThispage();
		
		
	}

}
