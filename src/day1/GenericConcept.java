package day1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GenericConcept {
WebDriver driver = null;
	
	public void openbrowser(String i,String j) {
		
		if( i.equals("chrome"))
		{ 
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(j);			
		}
		else if (i.equals("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(j);		
		}
		
		else if (i.equals("ie")) {
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(j);
			
		}
		else {
			System.out.println("only chrome, firfox, ie");
		}		
		
	}
	public void closebrowser() {
		
		driver.close();
		
	}
	public static void main(String[] args) {
		GenericConcept obj = new GenericConcept();
		obj.openbrowser("chrome","https://playground.intellectsoftwareacademy.com/");
		//obj.closebrowser();
	}
}
