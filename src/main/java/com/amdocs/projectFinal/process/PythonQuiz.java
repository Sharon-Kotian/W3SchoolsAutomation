package com.amdocs.projectFinal.process;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PythonQuiz {
	public static void automatePythonQuiz(WebDriver dr) {
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
