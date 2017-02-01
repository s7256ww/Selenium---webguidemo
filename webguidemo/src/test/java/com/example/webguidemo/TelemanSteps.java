package com.example.webguidemo;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;

import static org.junit.Assert.*;

@SuppressWarnings("unused")
public class TelemanSteps {
	
	private final Strony pages;

	public TelemanSteps(Strony pages) {
		this.pages = pages;
	}
	
	@Given("user is on Home page")
    public void userIsOnHomePage(){        
        pages.home().open();        
    }
 
    @When("user opens Sport link")
    public void userClicksOnSportLink(){        
        pages.home().clickSportLink();
    }
 
    @Then("Sport page is shown")
    public void sportPageIsShown(){
       assertEquals("Sport w Programie TV - Program telewizyjny Teleman.pl", pages.sport().getTitle());
    }
    
    @When("user opens TerazWTv link")
    public void userClicksOnTerazWTvLink(){        
        pages.home().clickTerazWTvLink();
    }
 
    @Then("terazWTv page is shown")
    public void terazWTvPageIsShown(){
       assertEquals("Teraz i za Chwilę w Programie TV - Aktualny Program TV - Program telewizyjny Teleman.pl", pages.terazwtv().getTitle());
    }	
    
    @Given("user is on TerazWTv page")
    public void userIsOnTerazWTVPage(){        
        pages.terazwtv().open();        
    }
    
    @When("user filtered only movies")
    public void userFilteredOnlyMovies(){        
        pages.terazwtv().showOnlyMovies();
    }
 
    @Then("only movies are shown")
    public void onlyMoviesAreShown(){
       	assertEquals("http://www.teleman.pl/teraz?cat=ser", pages.terazwtv().getCurrentUrl());
    }	
}
