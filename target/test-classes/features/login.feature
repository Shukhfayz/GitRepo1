Feature: Login
As a user 
  I want to login to the application 
  so that I can add products to the shopping cart

  Scenario Outline: Validate login with correct user name and correct password
 	  Given User is on login page
	  When User enters correct <userName>
	  And enters correct <password>
	  Then User successfully login and see user information
 Examples:
  | userName | password |
  | slja@hd.com | asdljkalsjd2t46 |
  | gjja@hd.com | asdljkalssad446 |
  