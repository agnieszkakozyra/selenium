Feature: Login page test

Scenario: Open main page and clickin the top bar links
Given I open main page
When I click SIGN-ON link
Then I should see the the login page 

Scenario: Fill the reservation form
Given I open main page
When I click SIGN-ON link
Then I should see the the login page 
When I log in as "admdz" with password "qwe123" 
And I fill one passenger flight 
And Dates for tomorrow 
And From flight: "Frankfurt" at day "10" month "07"
And To flight: "Paris"  at day "11" month "07"
And Close the browser