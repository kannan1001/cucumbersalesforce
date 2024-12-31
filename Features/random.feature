Feature: SalesForce random features with scenarios

Background: 
Given User launches the application
Given User is on "loginpage" 
Then User Waits and enters the text in textbox "username" "geethu@company.com"
Then User enters the text in textbox "password" "salesForce1!"
Then User clicks on Button "Login"

Scenario: Verify if the firstname and lastname of the loggedin user is displayed
Given User is on "homepage"
Then User waits
Then User clicks on "Hometab"
Then User clicks on "FirstLastName"
Then User gets page title
Given User is on "homepage"
Then User clicks on "usermenubutton"
Then User clicks on "My Profile"
Then User verifies whether this page title and previous page title are same
Then User closes the browser

Scenario: Verify the edited lastname is updated at various places
Given User is on "homepage"
Then User waits
Then User clicks on "Hometab"
Then User clicks on "FirstLastName"
Then User is on "profilepage"
Then User clicks on "editprofilebutton"
Then User switches to iFrame "contactiframe"
Then User clicks on "abouttab"
Then User clears and enters the text in textbox "lastName" "Abcd"
Then User clicks on Button "saveAll"
Then User is on defaultpage
Then User gets text from "usernameintopleft"
Given User is on "homepage"
Then User waits
Then User verifies whether this text and previous text are same "usermenubutton"
Then User closes the browser

Scenario: Verify the tab customization
Given User is on "homepage"
Then User waits
Then User clicks on "plusicon"
Then User is on "alltabspage"
Then User clicks on "customizemytab"
Then User selects "selectedtabs" "Business Brands"
Then User clicks on "RemoveButton"
Then User clicks on Button "saveButton"
Given User is on "homepage"
Then User clicks on "usermenubutton"
Then User clicks on "Logout"
Then User waits
Given User launches the application
Given User is on "loginpage" 
Then User Waits and enters the text in textbox "username" "geethu@company.com"
Then User enters the text in textbox "password" "salesForce1!"
Then User clicks on Button "Login"
Then User closes the browser

Scenario: Blocking an event in the calender
Given User is on "homepage"
Then User waits
Then User clicks on "Hometab"
Then User waits and clicks on "currentdatelink"
Then User clicks on "8.00p.mlink"
Then User is on "eventpage"
Then User waits
Then User enters the text in textbox "subject" "other"
Then User clicks on "Endtime"
Then User clicks on "9.00p.mEndtime"
Then User clicks on Button "saveButton"
Then User closes the browser

Scenario: Blocking an event in the calender with weekly recurrance
Given User is on "homepage"
Then User waits
Then User clicks on "Hometab"
Then User waits and clicks on "currentdatelink"
Then User clicks on "4.00p.mlink"
Then User is on "eventpage"
Then User waits
Then User enters the text in textbox "subject" "other"
Then User clicks on "Endtime"
Then User clicks on "7.00p.mEndtime"
Then User clicks on "RecurrenceCheckBox"
Then User clicks on "WeeklyRadioButton"
Then User clicks on "RecurrenceEndDate"
Then User clicks on "RecurrenceEndDateToday"
Then User clicks on "body"
Then User clicks on Button "saveButton"
Then User clicks on "monthviewicon"
Then User closes the browser
