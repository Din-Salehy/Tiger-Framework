Feature: Register
@register
Scenario: Register with Test Environment Website
		
	 Given I am on Test Environment Home Page
	 When I click on My Account button
	 And I click on register link
	 And i fill registration form
	 |firstname|lastname|email|telephone|password|confrimpassword|
	 |tigers|tekschool|tigerstekschool233@gmail.com|4332882490|tigers123|tigers123|
	 And i suscribe to newsletter
	 And i agree to privacy policy
	 And i click on continue button
	 And i validate my account is created sucessfully
	 
