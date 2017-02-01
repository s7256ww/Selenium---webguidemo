package com.example.webguidemo;

import org.jbehave.web.selenium.WebDriverProvider;

import com.example.webguidemo.pages.TerazWTv;
import com.example.webguidemo.pages.TerazWTvSeriale;
import com.example.webguidemo.pages.Sport;
import com.example.webguidemo.pages.Home;

public class Strony {

	private WebDriverProvider driverProvider;
	
	//Pages
	private Home home;
	private Sport sport;
	private TerazWTv terazwtv;
	private TerazWTvSeriale terazwtvseriale;
	// ...

	public Strony(WebDriverProvider driverProvider) {
		super();
		this.driverProvider = driverProvider;
	}

	public Home home() {
		if (home == null) {
			home = new Home(driverProvider);
		}
		return home;
	}
	
	public Sport sport(){
		if (sport == null) {
			sport = new Sport(driverProvider);
		}
		return sport;
	}
	
	public TerazWTv terazwtv(){
		if (terazwtv == null) {
			terazwtv = new TerazWTv(driverProvider);
		}
		return terazwtv;
	}
	
	public TerazWTvSeriale terazwtvfilmy(){
		if (terazwtvseriale == null) {
			terazwtvseriale = new TerazWTvSeriale(driverProvider);
		}
		return terazwtvseriale;
	}
}
