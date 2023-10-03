package com.amdocs.projectFinal;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebsiteAutomation {
	public static String browser = "Edge";
	public static WebDriver dr;

	public static void main(String[] args) throws InterruptedException {

		if (browser.equals("Chrome")) {
			dr = new ChromeDriver();
		} else if (browser.equals("Firefox")) {
			dr = new ChromeDriver();
		} else if (browser.equals("Edge")) {
			dr = new EdgeDriver();
		}

		dr.get("https://www.w3schools.com/");

		dr.manage().window().maximize();

		login();
		Thread.sleep(10000);
		pythonExercise();
		addToCart();
		pythonQuiz();

	}

	private static void login() {
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

	private static void pythonExercise() {
		// Working Python Variables Exercise 1
		// Navigate to the Python Exercise page
		dr.navigate().to("https://www.w3schools.com/python/exercise.asp?filename=exercise_variables1");

		// Insert answers in the particular textboxes by using sendKeys() of WebElement
		// class
		WebElement answer = dr.findElement(By.xpath("//*[@id=\"assignmentcontainer\"]/input[1]"));

		answer.sendKeys("carname");

		WebElement answer2 = dr.findElement(By.xpath("//*[@id=\"assignmentcontainer\"]/input[2]"));

		answer2.sendKeys("Volvo");

		// Click the Submit Answer Button
		dr.findElement(By.xpath("//*[@id=\"answerbutton\"]")).click();

		// Click the Next Question Button
		dr.findElement(By.xpath("//*[@id=\"answerbutton\"]")).click();

		// Python Variables Exercise 2
		WebElement answer3 = dr.findElement(By.xpath("//*[@id=\"assignmentcontainer\"]/input[1]"));
		answer3.sendKeys("x");

		WebElement answer4 = dr.findElement(By.xpath("//*[@id=\"assignmentcontainer\"]/input[2]"));
		answer4.sendKeys("50");

		dr.findElement(By.xpath("//*[@id=\"answerbutton\"]")).click();

		dr.findElement(By.xpath("//*[@id=\"answerbutton\"]")).click();

		// Python Variables Exercise 3
		WebElement answer5 = dr.findElement(By.xpath("//*[@id=\"assignmentcontainer\"]/input[1]"));
		answer5.sendKeys("x");

		WebElement answer6 = dr.findElement(By.xpath("//*[@id=\"assignmentcontainer\"]/input[2]"));
		answer6.sendKeys("5");

		WebElement answer7 = dr.findElement(By.xpath("//*[@id=\"assignmentcontainer\"]/input[3]"));
		answer7.sendKeys("+");

		dr.findElement(By.xpath("//*[@id=\"answerbutton\"]")).click();

		dr.findElement(By.xpath("//*[@id=\"answerbutton\"]")).click();

		// Python Variables Exercise 4
		WebElement answer8 = dr.findElement(By.xpath("//*[@id=\"assignmentcontainer\"]/input[1]"));
		answer8.sendKeys("z");

		WebElement answer9 = dr.findElement(By.xpath("//*[@id=\"assignmentcontainer\"]/input[2]"));
		answer9.sendKeys("z");

		dr.findElement(By.xpath("//*[@id=\"answerbutton\"]")).click();

		dr.findElement(By.xpath("//*[@id=\"answerbutton\"]")).click();

		// Python Variable Exercise 5
		// Find the particular TextArea where we want to perform Keyboard Actions
		WebElement answer10 = dr.findElement(By.xpath("//*[@id=\"assignmentcontainer\"]"));
		answer10.sendKeys(Keys.ARROW_DOWN);

		answer10.sendKeys(Keys.ARROW_DOWN);

		answer10.sendKeys(Keys.HOME);

		answer10.sendKeys(Keys.DELETE);

		answer10.sendKeys(Keys.ARROW_RIGHT);

		answer10.sendKeys(Keys.ARROW_RIGHT);

		answer10.sendKeys(Keys.DELETE);

		// Click the Submit Button
		dr.findElement(By.xpath("//*[@id=\"answerbutton\"]")).click();

		// Click the Next Question Button
		dr.findElement(By.xpath("//*[@id=\"answerbutton\"]")).click();

		// Python Variable Exercise 6
		WebElement answer11 = dr.findElement(By.xpath("//*[@id=\"assignmentcontainer\"]/input[1]"));
		answer11.sendKeys("=");

		WebElement answer12 = dr.findElement(By.xpath("//*[@id=\"assignmentcontainer\"]/input[2]"));
		answer12.sendKeys("=");

		WebElement answer13 = dr.findElement(By.xpath("//*[@id=\"assignmentcontainer\"]/input[3]"));
		answer13.sendKeys("=");

		dr.findElement(By.xpath("//*[@id=\"answerbutton\"]")).click();

		dr.findElement(By.xpath("//*[@id=\"answerbutton\"]")).click();

		// Python Variable Exercise 7
		WebElement answer14 = dr.findElement(By.xpath("//*[@id=\"assignmentcontainer\"]/input[1]"));
		answer14.sendKeys("global");

		dr.findElement(By.xpath("//*[@id=\"answerbutton\"]")).click();

		dr.findElement(By.xpath("//*[@id=\"answerbutton\"]")).click();

	}

	private static void addToCart() throws InterruptedException {
//		Thread.sleep(10000);
////		WebElement searchBox=dr.findElement(By.xpath("//*[@id=\"tnb-google-search-input\"]"));
//		
//		dr.findElement(By.id("tnb-google-search-input")).sendKeys("Python Certificate");

//		searchBox.sendKeys(Keys.ENTER);
//		searchBox.sendKeys("Python Certificate");

		// Add Python Course to Cart Working 2 quantity

		dr.navigate().to("https://campus.w3schools.com/en-in/collections/course-catalog/products/python-course");

		// Select 2 as a quantity from th dropdown list of quantities
		Select quantity = new Select(dr.findElement(By.xpath("//*[@id=\"product-quantity-select\"]")));
		quantity.selectByIndex(1);

		// Click Buy It Now button
		dr.findElement(By.xpath("//*[@id=\"product_form_4695231004729\"]/div[2]/button")).click();

		// Click the Checkout Button
		dr.findElement(By
				.xpath("//*[@id=\"shopify-section-template--15923756924985__main\"]/form/div[2]/header/div[2]/button"))
				.click();

		// Fill in email
		dr.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sharonkotian2000@gmail.com");

		// select Credit/Debit card option
		dr.findElement(By.xpath("//*[@id=\"basic-Pay by credit/debit card and more\"]")).click();

		dr.findElement(By.xpath("//*[@id=\"TextField0\"]")).sendKeys("Sharon");

		dr.findElement(By.xpath("//*[@id=\"TextField1\"]")).sendKeys("Kotian");

		dr.findElement(By.xpath("//*[@id=\"TextField2\"]")).sendKeys("Amdocs");

		dr.findElement(By.xpath("//*[@id=\"billing-address1\"]")).sendKeys("Rose Villa, Bangalore");

		dr.findElement(By.xpath("//*[@id=\"TextField3\"]")).sendKeys("Bangalore");

		Select state = new Select(dr.findElement(By.xpath("//*[@id=\"Select1\"]")));

		state.selectByVisibleText("Karnataka");

		dr.findElement(By.xpath("//*[@id=\"TextField4\"]")).sendKeys("560001");

		dr.findElement(By.xpath("//*[@id=\"TextField5\"]")).sendKeys("8987665443");

		// click Pay Now Button
		dr.findElement(By.xpath("//*[@id=\"pay-button-container\"]/div/div/button")).click();
		dr.findElement(By.xpath("//*[@id=\"pay-button-container\"]/div/div/button")).click();

	}

	private static void pythonQuiz() {
		// PYTHON QUIZ

		dr.navigate().to("https://www.w3schools.com/python/python_quiz.asp");

		dr.findElement(By.xpath("//*[@id=\"main\"]/div[3]/p[2]/a")).click();

		List<String> answerIds = Arrays.asList("1", "2", "4", "2", "2", "2", "3", "2", "1", "3", "2", "4", "1", "2",
				"3", "4", "3", "2", "1", "3", "1", "2", "1", "1", "2");

		for (String item : answerIds) {
			dr.findElement(By.id(item)).click();
			dr.findElement(By.xpath("//*[@id=\"answerbuttoncontainer\"]/button")).click();
		}

	}
}
