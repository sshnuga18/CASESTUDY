Feature: Registration of testme app
Scenario: valid login scenario

Given  url for registration is "http://10.232.237.143:443/TestMeApp/RegisterUser.htm"
When  usr enter username as "Sridevi1897" 
And usr enter firstname as "Sridevi" 
And usr enter lastname as "Shnuga" 
And usr enter password as "Sridevi123" 
And usr enter confirmpassword as "Sridevi123" 
And usr enter gender as "Female" 
And usr enter email as "sri@gmail.com" 
And usr enter mobilenumber as "1234567890"
And usr enter Dob as "07/07/2019"
And usr enter address as "gfdgfhfghjfg" 
And usr enter security question as "What is your Birth Place?" 
And usr enter answer as "OOty" 
Then usr is in login page 

