Feature: feature to verify the Home Page of WebSite 

Scenario: Verify Home Page 
	Given Open Chrome browser and Lanch site					
	Then verify Home page of site
	And verify the text "subscriptions and onetime payment"
	When click on Company dropdown and click on blog
	Then verify blog page
	And verify Home page of site
#	And close the window