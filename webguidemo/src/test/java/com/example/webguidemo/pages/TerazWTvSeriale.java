package com.example.webguidemo.pages;

import java.util.concurrent.TimeUnit;

import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;

@SuppressWarnings("unused")
public class TerazWTvSeriale extends WebDriverPage{
	
	public TerazWTvSeriale(WebDriverProvider driverProvider) {
		super(driverProvider);
	}
	
	public void open() {
		get("http://www.teleman.pl/teraz?cat=ser");
		manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
}
