Scenario: User searches for a single step
 
Given user is on Home page
When user opens Sport link
Then Sport page is shown
When user opens TerazWTv link
Then terazWTv page is shown
Given user is on TerazWTv page
When user filtered only movies
Then only movies are shown