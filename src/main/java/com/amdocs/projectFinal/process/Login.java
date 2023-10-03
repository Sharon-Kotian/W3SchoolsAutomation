package com.amdocs.projectFinal.process;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	public static void automateLogin(WebDriver dr) {
		/* Login */

		// Click the Login Button
		dr.findElement(By.xpath("//*[@id=\"pagetop\"]/div[3]/a[1]")).click();

		// Insert the registered Email ID
		dr.findElement(By.xpath("//*[@id=\"modalusername\"]")).sendKeys("sonusonu.5.4.1998@gmail.com");

		// Insert the Password
		dr.findElement(By.xpath("//*[@id=\"current-password\"]")).sendKeys("Marina@1975");

		// Click the Submit Button
		dr.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[1]/div/div[4]/div[1]/button")).click();

	}
}
