package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
    	driver.get("https://jqueryui.com/droppable/");
    	
    	//frame 
//    	driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
//    	Actions a = new Actions(driver);
//    	WebElement source = driver.findElement(By.id("draggable"));
//    	WebElement target = driver.findElement(By.id("droppable"));
//    	a.dragAndDrop(source, target).build().perform();
    	
    	//index wise frame
    	//System.out.println(driver.findElements(By.tagName("iframe")).size());     size of the frame
    	 driver.switchTo().frame(0);
    	 Actions a = new Actions(driver);
     	 WebElement source = driver.findElement(By.id("draggable"));
     	 WebElement target = driver.findElement(By.id("droppable"));
     	 a.dragAndDrop(source, target).build().perform();
    	
	}

}
