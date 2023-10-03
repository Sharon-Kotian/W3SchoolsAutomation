package com.amdocs.projectFinal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.amdocs.projectFinal.process.AddToCart;
import com.amdocs.projectFinal.process.Login;
import com.amdocs.projectFinal.process.PythonExercise;
import com.amdocs.projectFinal.process.PythonQuiz;

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

		Login.automateLogin(dr);
		PythonExercise.automatePythonExercise(dr);
		AddToCart.automateAddToCart(dr);
		PythonQuiz.automatePythonQuiz(dr);

	}

}
