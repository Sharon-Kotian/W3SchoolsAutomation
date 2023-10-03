package com.amdocs.projectFinal.process;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PythonExercise {
	public static void automatePythonExercise(WebDriver dr) {
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
}
