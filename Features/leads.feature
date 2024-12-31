Feature: SalesForce leads features with scenarios

Background: 
Given User launches the application
Given User is on "loginpage" 
Then User Waits and enters the text in textbox "username" "geethu@company.com"
Then User enters the text in textbox "password" "salesForce1!"
Then User clicks on Button "Login"

Scenario: check leads tab link
Given User is on "homepage"
Then User waits
Then User clicks on "LeadsTab"
Then User is on "leadspage"
Then User closes the browser

Scenario: Validate 'View' drop down list contents
Given User is on "homepage"
Then User waits
Then User clicks on "LeadsTab"
Then User is on "leadspage"
Then User clicks on "view"
Then User closes the browser

Scenario: Functionality of the Go Button
Given User is on "homepage"
Then User waits
Then User clicks on "LeadsTab"
Then User is on "leadspage"
Then User selects "view" "Today's Leads"
Then User is on "homepage"
Then User clicks on Button "usermenubutton"
Then User clicks on "Logout"
Given User is on "loginpage" 
Then User waits
Then User enters the text in textbox "username" "geethu@company.com"
Then User enters the text in textbox "password" "salesForce1!"
Then User clicks on Button "Login"
Then User is on "homepage"
Then User waits
Then User clicks on "LeadsTab"
Then User is on "leadspage"
Then User clicks on Button "Gobutton"
Then User closes the browser

Scenario: check the list item "Todays Leads" 
Given User is on "homepage"
Then User waits
Then User clicks on "LeadsTab"
Then User is on "leadspage"
Then User selects "view" "Today's Leads"
Then User clicks on Button "Gobutton"
Then User closes the browser

Scenario: Check "New" button on Leads Home
Given User is on "homepage"
Then User waits
Then User clicks on "LeadsTab"
Then User is on "leadspage"
Then User clicks on Button "NewButton"
Then User enters the text in textbox "lastName" "Abcd"
Then User enters the text in textbox "companyName" "Abcd"
Then User clicks on Button "saveButton"
Then User closes the browser









