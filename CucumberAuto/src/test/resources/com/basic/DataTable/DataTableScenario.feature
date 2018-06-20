Feature: Login Facebook3
As a user you need to open facebook home page and do the validations

Scenario: Login with multiple users31
Given User need to be on Facebook login page
When enter following data
	| firstName | surName | mobile |
	| Tom				| Hanks		| 1234	 |
	| Jack			| Daniel	| 5678	 |
Then Close browser