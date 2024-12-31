Feature: SalesForce contacts features with scenarios

Background: 
Given User launches the application
Given User is on "loginpage" 
Then User Waits and enters the text in textbox "username" "geethu@company.com"
Then User enters the text in textbox "password" "salesForce1!"
Then User clicks on Button "Login"

Scenario: Create new contact
Given User is on "homepage"
Then User waits
Then User clicks on "contactsTab"
Then User is on "contactspage"
Then User clicks on Button "NewButton"
Then User enters the text in textbox "LastName" "Newyork"
Then User enters the text in textbox "AccountName" "George"
Then User clicks on Button "saveButton"
Then User closes the browser

Scenario: Create new view in the Contact Page
Given User is on "homepage"
Then User waits
Then User clicks on "contactsTab"
Then User is on "contactspage"
Then User clicks on "createnewview"
Then User enters the text in textbox "viewname" "MyView2"
Then User enters the text in textbox "viewuniquename" "MyView2"
Then User clicks on Button "saveButton"
Then User closes the browser


Scenario: Check recently created contact in the Contact Page
Given User is on "homepage"
Then User waits
Then User clicks on "contactsTab"
Then User is on "contactspage"
Then User selects "RecentlyCreatedDropdown" "Recently Created"
Then User closes the browser

Scenario: Check 'My contacts' view in the Contact Page
Given User is on "homepage"
Then User waits
Then User clicks on "contactsTab"
Then User is on "contactspage"
Then User selects "contactdropdown" "My Contacts"
Then User closes the browser

Scenario: View a contact in the contact Page
Given User is on "homepage"
Then User waits
Then User clicks on "contactsTab"
Then User is on "contactspage"
Then User clicks on "firstcontact"
Then User closes the browser

Scenario: Check the Error message if, the required information is not entered while creating a New view in Contacts
Given User is on "homepage"
Then User waits
Then User clicks on "contactsTab"
Then User is on "contactspage"
Then User clicks on "createnewview"
Then User enters the text in textbox "viewuniquename" "EFGH"
Then User clicks on Button "saveButton"
Then User closes the browser


Scenario: Check the Cancel button works fine in Create New View
Given User is on "homepage"
Then User waits
Then User clicks on "contactsTab"
Then User is on "contactspage"
Then User clicks on "createnewview"
Then User enters the text in textbox "viewname" "Myview3"
Then User enters the text in textbox "viewuniquename" "Myview3"
Then User clicks on Button "cancelButton"
Then User closes the browser


Scenario: Check the Save and New button works in New Contact page
Given User is on "homepage"
Then User waits
Then User clicks on "contactsTab"
Then User is on "contactspage"
Then User clicks on Button "NewButton"
Then User enters the text in textbox "LastName" "Indian_2"
Then User enters the text in textbox "AccountName" "Global Media"
Then User clicks on Button "saveandNewButton"
Then User closes the browser













