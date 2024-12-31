Feature: SalesForce login features with scenarios

Scenario Outline: Launch the application and login 
Given User launches the application
Given User is on "loginpage" 
Then User Waits and enters the text in textbox "username" "<usernamevalue>"
Then User enters the text in textbox "password" "<passwordvalue>"
Then User clicks on Button "Login"
Then User closes the browser

Examples:
|usernamevalue|passwordvalue|
|geethu@company.com||
|geethu@company.com|salesForce1!|
|123|22131|

Scenario: Launch the application and login and check Remember Me Checkbox

Given User launches the application
Given User is on "loginpage" 
Then User Waits and enters the text in textbox "username" "geethu@company.com"
Then User enters the text in textbox "password" "salesForce1!"
Then User clicks on Button "RememberMeCheckbox"
Then User clicks on Button "Login"
Given User is on "homepage"
Then User waits and clicks on Button "usermenubutton"
Then User clicks on "Logout"
Then User closes the browser

Scenario: Launch the application and click on Forgot password

Given User launches the application
Given User is on "loginpage" 
Then User clicks on "forgotpassword"
Then User is on "forgotpasswordpage"
Then User Waits and enters the text in textbox "username" "geeth@company.com"
Then User clicks on Button "continue"
Then User closes the browser

