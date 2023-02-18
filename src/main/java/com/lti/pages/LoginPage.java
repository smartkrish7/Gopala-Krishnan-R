package com.lti.pages;


	import org.openqa.selenium.By;

	import com.lti.Base.LTIBase;

	public class LoginPage extends LTIBase {
		
		public String getTitle() {
			return driver.getTitle();
		}
		
		public DashboardPage login() {
			driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
			driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
			driver.findElement(By.xpath("//button[@type = 'submit']")).click();
			return new DashboardPage();
			
		}
		

}
