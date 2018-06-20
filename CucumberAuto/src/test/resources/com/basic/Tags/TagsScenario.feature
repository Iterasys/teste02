@Important
Feature: Create account of Facebook12
As a user you need to open facebook home page and do the validations

@Smoke
Scenario: Validate First Name Field121
Given User need to be on Facebook login page
When User enters user "David" first name
Then User checks user "David" first name is present
Then Close browser

@Smoke @Regression
Scenario: Validate create user multiple fields122
Given User need to be on Facebook login page
When User enters user "Ryan" first name
And User enters user "Jack" surname
Then User checks user "Ryan" first name is present
Then User Mobile field should be blank
Then Close browser

Scenario: Validate First Name Field123
Given User need to be on Facebook login page
When User enters user "David" first name
Then User checks user "David" first name is present
Then Close browser

@Regression
Scenario: Validate First Name Field124
Given User need to be on Facebook login page
When User enters user "David" first name
Then User checks user "David" first name is present
Then Close browser

@Smoke
Scenario: Validate First Name Field125
Given User need to be on Facebook login page
When User enters user "David" first name
Then User checks user "David" first name is present
Then Close browser