Feature: Application Login

Scenario: Home page default login
Given User is on Netbanking landing page
When User login into application with "abc" and "123"
Then Home page is populated
And Cards are displayed