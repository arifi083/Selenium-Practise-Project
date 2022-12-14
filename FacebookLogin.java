package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		login with id
//		driver.get("http://www.facebook.com");
//	    driver.findElement(By.id("email")).sendKeys("arif@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("123456");
//	    driver.findElement(By.name("login")).click();
//        driver.findElement(By.linkText("Forgotten password?")).click();
		
		
		//facebook login with xpath and css selector  generate css selector
//		driver.get("http://www.facebook.com");
//		driver.findElement(By.cssSelector("#email")).sendKeys("aarif@gmail.com");
//		driver.findElement(By.cssSelector("#pass")).sendKeys("123456");
//		driver.findElement(By.cssSelector("button[name='login']")).click();  
		
        //facebook login with generate xpath
//		driver.get("http://www.facebook.com");
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("arif@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("123456");
//		driver.findElement(By.xpath("//button[@name='login']")).click();  
		
		
		//own xpath facebook login
//		driver.get("http://www.facebook.com");
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("arif@gmail.com");
//		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123456");
//		driver.findElement(By.xpath("//button[@name='login']")).click(); 
		
		//xpath regular expression with facebook login
//		 driver.get("http://www.facebook.com");
//		 driver.findElement(By.xpath("//*[@id='email']")).sendKeys("arif@gmail.com");
//		 driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123456");
//		 driver.findElement(By.xpath("//*[@name='login']")).click();
		 
		//xpath regular expresssion and contains with facebook login
//		 driver.get("http://www.facebook.com");
//		 driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("arif@gmail.com");
//		 driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("123456");
//     	 driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
		
		
		//facebook login with Own css selector
//     	driver.get("http://www.facebook.com");
//		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("arif@gmail.com");
//		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123456");
//		driver.findElement(By.cssSelector("button[name='login']")).click();
		
		
		//facebook login with Own css selector
//     	driver.get("http://www.facebook.com");
//     	driver.findElement(By.cssSelector("input#email")).sendKeys("arif@gmail.com");
//     	driver.findElement(By.cssSelector("input#pass")).sendKeys("123456");
//     	driver.findElement(By.cssSelector("button[name='login']")).click();
     	
     	//facebook login with Own css selector but skip attribute
//     	driver.get("http://www.facebook.com");
//     	driver.findElement(By.cssSelector("[name='email']")).sendKeys("arif@gmail.com");
//     	driver.findElement(By.cssSelector("[type='password']")).sendKeys("123456");
//     	driver.findElement(By.cssSelector("[name='login']")).click();
     	
     	//regular expression css selector with facebook login
//     	driver.get("http://www.facebook.com");
//    	driver.findElement(By.cssSelector("input[name*='email']")).sendKeys("arif@gmail.com");
//    	driver.findElement(By.cssSelector("input[id*='pass']")).sendKeys("123456");
//    	driver.findElement(By.cssSelector("button[name*='login']")).click();
     	
	}

}
