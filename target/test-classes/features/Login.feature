Feature: Application Log in

Scenario: Home page default log in
Given: User is on Netbanking landing page
When: User log in to application with username and password
Then: Home page is populated
And: Cards are displayed