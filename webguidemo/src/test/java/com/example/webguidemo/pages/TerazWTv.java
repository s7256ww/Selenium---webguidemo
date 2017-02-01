package com.example.webguidemo.pages;

import java.util.concurrent.TimeUnit;

import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;

public class TerazWTv extends WebDriverPage{

	public TerazWTv(WebDriverProvider driverProvider) {
		super(driverProvider);
	}
	
	//private final static String FILMY_LINK_TEXT = "TERAZ";
	
	public void open() {
		get("http://www.teleman.pl/teraz");
		manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void showOnlyMovies(){
		findElement(By.cssSelector("a.button.cat-fil")).click();
	}
}
