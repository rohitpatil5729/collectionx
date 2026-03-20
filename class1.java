package rohit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class class1 {
	public static void main(String[] args) {
		ChromeDriver d1=new ChromeDriver();
		d1.get("https://www.amazon.in/");
		d1.manage().window().maximize();
	WebElement e1=	d1.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	Select s1=new Select(e1);
	//s1.selectByValue("search-alias=alexa-skills");
	//s1.selectByIndex(2);
	s1.selectByVisibleText("Amazon Pharmacy");
		
		
		
		
		
		
	}

}




