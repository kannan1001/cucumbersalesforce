Feature: SalesForce usermenu features with scenarios

Background: 
Given User launches the application
Given User is on "loginpage" 
Then User Waits and enters the text in textbox "username" "geethu@company.com"
Then User enters the text in textbox "password" "salesForce1!"
Then User clicks on Button "Login"


Scenario: validate usermenudropdown
Given User is on "homepage"
Then User waits and clicks on Button "usermenubutton"
Then User closes the browser

Scenario: Select "My Profile" option from user menu for username drop down
Given User is on "homepage"
Then User waits and clicks on Button "usermenubutton"
Then User clicks on "My Profile"
Then User is on "profilepage"

Then User clicks on Button "editprofilebutton"
Then User switches to iFrame "contactiframe"
Then User clicks on "abouttab"
Then User clears and enters the text in textbox "lastName" "kanna"
Then User clicks on Button "saveAll"
Then User is on defaultpage

Then User clicks on "post"
Then User switches to iFrame "postiFrame"
Then User Waits and enters the text in textbox "posttextbox" "Today is a wonderful day to learn."
Then User is on defaultpage
Then User clicks on Button "share"

Then User waits and clicks on "FileLink"
Then User clicks on "uploadFromComputer"
Then User clicks on and sends file location "chooseFile" "/Users/geerthanakannan/Documents/smiley.jpeg"
Then User clicks on Button "share"
Then User waits
Then User moves to and clicks on "update"
Then User waits and switches to iFrame "uploadPhotoiFrame"
Then User clicks on and sends file location "choosefileforphoto" "/Users/geerthanakannan/Documents/smiley.jpeg"
Then User waits and clicks on Button "save"
Then User crops the image "img_crop"
Then User clicks on Button "cropsavebutton"

Then User closes the browser

Scenario: Select "My Profile" option from user menu for username drop down
Given User is on "homepage"
Then User waits and clicks on Button "usermenubutton"
Then User clicks on "My Settings"

Then User is on "settingspage"

Then User clicks on "Personallink"
Then User clicks on "LoginHistory"
Then User clicks on "DownloadHistory"

Then User clicks on "DisplayAndLayout"
Then User clicks on "CustomizeMyTabs"
Then User selects "CustomAppDropDown" "Salesforce Chatter" 
Then User selects "AvailableTabs" "Reports"
Then User clicks on Button "Add"
Then User waits and clicks on Button "save"

Then User clicks on "Email"
Then User clicks on "MyEmailSettings"
Then User clears and enters the text in textbox "EmailName" "keerthana"
Then User clears and enters the text in textbox "EmailAddress" "geerthana@gmail.com"
Then User clicks on "AutomaticBCCYes"
Then User clicks on Button "save"

Then User clicks on "CalendarandReminders"
Then User clicks on "ActivityReminders"
Then User clicks on Button "openatestreminder"

Then User closes the browser

Scenario: Select "My Profile" option from user menu for username drop down
Given User is on "homepage"
Then User waits and clicks on Button "usermenubutton"
Then User clicks on "DeveloperConsole"
Then User waits
Then User switches between windows
Then User closes the browser

Scenario: Select "My Profile" option from user menu for username drop down
Given User is on "homepage"
Then User waits and clicks on Button "usermenubutton"
Then User clicks on "Logout"
Then User closes the browser
