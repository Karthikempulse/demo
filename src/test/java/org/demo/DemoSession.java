package org.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSession {
public static void main(String[] args) {
	

	WebDriver driver=new ChromeDriver();
	
		driver.get("http://192.168.5.147/#/main-page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		 WebElement login = driver.findElement(By.xpath("//h6[text()=' LogIn ']"));
		   login.click();
			WebElement usrmail = driver.findElement(By.id("Mail"));
			usrmail.sendKeys("karthik.anandan@empulseone.com");
			WebElement usrpwd = driver.findElement(By.id("Password"));
			usrpwd.sendKeys("Karthik@123");
			WebElement login1 = driver.findElement(By.xpath("//button[text()='Login']"));
			login1.click();
}
}