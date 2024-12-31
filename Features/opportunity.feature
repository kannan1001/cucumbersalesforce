Feature: SalesForce opportunity features with scenarios

Background: 
Given User launches the application
Given User is on "loginpage" 
Then User Waits and enters the text in textbox "username" "geethu@company.com"
Then User enters the text in textbox "password" "salesForce1!"
Then User clicks on Button "Login"

Scenario: verify opportunity dropdown
Given User is on "homepage"
Then User waits
Then User clicks on "opportunitiestab"
Then User is on "opportunitiespage"
Then User clicks on "viewdropdown"
Then User closes the browser

Scenario: create new opportunity
Given User is on "homepage"
Then User waits
Then User clicks on "opportunitiestab"
Then User is on "opportunitiespage"
Then User clicks on Button "NewButton"
Then User enters the text in textbox "OpportunityName" "QA Testing2"
Then User enters the text in textbox "AccountName" "IT"
Then User clicks on "closeDate"
Then User clicks on "today"
Then User clicks on "anywhereonpage"
Then User clicks on "stage"
Then User selects "stage" "Qualification"
Then User clicks on "anywhereonpage"
Then User clears and enters the text in textbox "probability" "85"
Then User selects "LeadSource" "Web"
Then User enters the text in textbox "PrimaryCampaignSource" "campaign1"
Then User clicks on Button "saveButton"
Then User closes the browser

Scenario: test opportunity pipeline 
Given User is on "homepage"
Then User waits
Then User clicks on "opportunitiestab"
Then User is on "opportunitiespage"
Then User clicks on "opportunitypipeline"
Then User closes the browser

Scenario: test stuckOpportunities 
Given User is on "homepage"
Then User waits
Then User clicks on "opportunitiestab"
Then User is on "opportunitiespage"
Then User clicks on "stuckOpportunities"
Then User closes the browser

Scenario: Test Quarterly Summary Report
Given User is on "homepage"
Then User waits
Then User clicks on "opportunitiestab"
Then User is on "opportunitiespage"
Then User selects "Interval" "Current and Next FQ"
Then User selects "Include" "Open Opportunities"
Then User clicks on Button "RunReportButton"
Then User closes the browser



















