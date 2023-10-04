package com.amdocs.projectFinal.process;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AddToCart {
	public static void automateAddToCart(WebDriver dr) throws InterruptedException {		
		// Add Certifications to Cart
		dr.navigate().to("https://campus.w3schools.com/en-in/collections/course-catalog/products/python-course");

		// Select 2 as a quantity from the dropdown list of quantities
		Select quantity = new Select(dr.findElement(By.xpath("//*[@id=\"product-quantity-select\"]")));
		quantity.selectByIndex(1);

		// Click Buy It Now button
		dr.findElement(By.xpath("//*[@id=\"product_form_4695231004729\"]/div[2]/button")).click();

		// Click the Checkout Button
		dr.findElement(By.xpath("//*[@id=\"shopify-section-static-header\"]/div[2]/div[1]/a/div")).click();
		
		//Search for Data Analytics Certification
		dr.findElement(By.xpath("//*[@id=\"shopify-section-static-header\"]/div[2]/div[1]/div[2]/form/div[1]/input")).sendKeys("Data Analytics");
		Thread.sleep(5000);
		dr.findElement(By.xpath("//*[@id=\"shopify-section-static-header\"]/div[2]/div[1]/div[2]/form/div[2]/div[2]/div[1]/a[2]")).click();
		
		//Change quantity to 3
		Select quantity2 = new Select(dr.findElement(By.xpath("//*[@id=\"product-quantity-select\"]")));
		quantity2.selectByIndex(2);
		
		//Add to cart button click
		dr.findElement(By.xpath("//*[@id=\"product_form_6784792657977\"]/div[2]/button")).click();
		
		//Checkout button
		Thread.sleep(5000);
		dr.findElement(By
				.xpath("//*[@id=\"shopify-section-template--15923756924985__main\"]/form/div[2]/header/div[2]/button"))
				.click();

		// Fill in email
		dr.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sharonkotian2000@gmail.com");

		// select Credit/Debit card option
		dr.findElement(By.xpath("//*[@id=\"basic-Pay by credit/debit card and more\"]")).click();

		//Fill in all the other details
		dr.findElement(By.xpath("//*[@id=\"TextField0\"]")).sendKeys("Sharon");
		dr.findElement(By.xpath("//*[@id=\"TextField1\"]")).sendKeys("Kotian");
		dr.findElement(By.xpath("//*[@id=\"TextField2\"]")).sendKeys("Amdocs");
		dr.findElement(By.xpath("//*[@id=\"billing-address1\"]")).sendKeys("Rose Villa, Bangalore");
		dr.findElement(By.xpath("//*[@id=\"TextField3\"]")).sendKeys("Bangalore");

		//Change state to Karnataka
		Select state = new Select(dr.findElement(By.xpath("//*[@id=\"Select1\"]")));
		state.selectByVisibleText("Karnataka");
		
		dr.findElement(By.xpath("//*[@id=\"TextField4\"]")).sendKeys("560001");
		dr.findElement(By.xpath("//*[@id=\"TextField5\"]")).sendKeys("8987665443");

		// click Pay Now Button
		Thread.sleep(2000);
		dr.findElement(By.xpath("//*[@id=\"pay-button-container\"]/div/div/button")).click();
		dr.findElement(By.xpath("//*[@id=\"pay-button-container\"]/div/div/button")).click();

	}
}
