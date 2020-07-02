Feature: Application Login
 
 
 Scenario Outline: Home page default login
 Given launch browser and navigate to url
 When user login into application with <username> and password <password>
 Then get the titile of page loaded
 Then close the browser


Examples:
|username      |password   |
|user1         |1111       |
|user2         |2222       |