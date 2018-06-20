Feature: Create account of Facebook2
As a user you need to open facebook home page and do the validations

Scenario Outline: Validate create user multiple fields21
Given User need to be on Facebook login page
When User enters user "<firstname>" first name
And User enters user "<surname>" surname
Then User checks user "<firstname>" first name is present
Then User Mobile field should be blank
Then Close browser
Examples:
	| firstname | surname |
	| Tom				| Jerry		|
	| Lorren		| Hardy		|