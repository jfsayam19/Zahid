Feature: Login to facebook account 
Scenario Outline: Logiin to facebook for checking facebook status 
Given I am on faccebook homepage  
When I enter "<email address>" and "<password>" 
And I click on login button 
Then I see my facebook profile 
Examples: 
| email address         |   password			|	 
| jfsayam19@gmail.com		| Jf01717869893		|					