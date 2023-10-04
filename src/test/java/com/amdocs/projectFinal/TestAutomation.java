package com.amdocs.projectFinal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestAutomation {

	@Test
	public void testOperations() {
		WebDriver dr=new EdgeDriver();
		
		dr.get("https://www.w3schools.com/");
		String expUrl="https://www.w3schools.com/";
		String actUrl=dr.getCurrentUrl();
		assertEquals(expUrl, actUrl);
		
		String expTitle="W3Schools Online Web Tutorials";
		String actTitle=dr.getTitle();
		assertEquals(expTitle, actTitle);
		
		String expBtnText="Log in";
		String actBtnText=dr.findElement(By.xpath("//*[@id=\"pagetop\"]/div[3]/a[1]")).getText();
		assertEquals(expBtnText, actBtnText);
		
	}
}
