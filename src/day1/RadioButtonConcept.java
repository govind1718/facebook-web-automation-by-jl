package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonConcept {

	WebDriver driver =null;
	public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://playground.intellectsoftwareacademy.com/radio");
	}

	public void yesorno()  //noted
	{
		WebElement yesNo =driver.findElement(By.id("radio1"));
		yesNo.click();
	}
	public void findDefaultSelectedRadiobutton()
	{
		WebElement uncheckedEle =driver.findElement(By.id("radio3"));
		WebElement checkedEle =driver.findElement(By.id("radio4"));
		boolean status1 =uncheckedEle.isSelected();
		boolean status2 =checkedEle.isSelected();

		System.out.println(status1);
		System.out.println(status2);
	}
	public void Selectyouragegroup()
	{
		WebElement anyone =driver.findElement(By.id("int191"));
		anyone.click();
	}

	public static void main(String[] args) {

		RadioButtonConcept obj = new RadioButtonConcept();
		obj.openBrowser();
		obj.yesorno();
		obj.findDefaultSelectedRadiobutton();
		obj.Selectyouragegroup();



	}
}
