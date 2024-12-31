Feature: SalesForce account features with scenarios

Background: 
Given User launches the application
Given User is on "loginpage" 
Then User Waits and enters the text in textbox "username" "geethu@company.com"
Then User enters the text in textbox "password" "salesForce1!"
Then User clicks on Button "Login"

Scenario: Create New Account
Given User is on "homepage"
Then User waits
Then User clicks on "Accountstab" 
Then User is on "accountspage"
Then User clicks on Button "New"
Then User enters the text in textbox "AccountName" "George7"
Then User selects "type" "Technology Partner"
Then User selects "customerpriority" "High"
Then User clicks on Button "save"
Then User closes the browser

Scenario: Create New View
Given User is on "homepage"
Then User waits
Then User clicks on "Accountstab" 
Then User is on "accountspage"
Then User clicks on "createnewlink"
Then User enters the text in textbox "viewname" "George12"
Then User clears and enters the text in textbox "viewuniquename" "George12"
Then User clicks on Button "save"
Then User waits
Then User selects "viewnamedropdown" "George12"
Then User closes the browser

Scenario: Edit View
Given User is on "homepage"
Then User waits
Then User clicks on "Accountstab" 
Then User is on "accountspage"
Then User selects "viewnamedropdown" "George9"
Then User clicks on "Editlink"
Then User clears and enters the text in textbox "viewname" "Georg9"
Then User selects "FieldFirstDropDown" "Account Name"
Then User selects "operatorFirstDropDown" "contains"
Then User enters the text in textbox "valueFirstDropDown" "Geor"
Then User moves to and clicks on "AvailableFields"
Then User selects "AvailableFields" "Last Activity"
Then User clicks on "Addbutton"
Then User clicks on Button "save"
Then User closes the browser

Scenario: Merge Accounts
Given User is on "homepage"
Then User waits
Then User clicks on "Accountstab" 
Then User is on "accountspage"
Then User clicks on "MergeAccounts"
Then User enters the text in textbox "mergeaccounttextbox" "George"
Then User clicks on Button "findAccounts"
Then User clicks on "firstcheckbox"
Then User clicks on "secondcheckbox"
Then User clicks on "NextButton"
Then User clicks on "MergeButton"
Then User accepts the alert
Then User closes the browser

Scenario: Create Report
Given User is on "homepage"
Then User waits
Then User clicks on "Accountstab" 
Then User is on "accountspage"
Then User clicks on "Accountswithactivitygreaterthan30"
Then User clicks on "dateField"
Then User clicks on "createdDate"
Then User clicks on "FromDateicon"
Then User clicks on "todayButtonfromdate"
Then User clicks on "toDateicon"
Then User clicks on "todayButtontodate"
Then User clicks on Button "saveButton"
Then User enters the text in textbox "ReportName" "Report3"
Then User enters the text in textbox "ReportUniqueName" "Report3"
Then User clicks on Button "saveandRunReport"
Then User closes the browser
