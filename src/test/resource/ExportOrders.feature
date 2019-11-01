Feature:  Export All Orders App Test

Scenario: To verify that user is able to export all orders in csv file and send it to another email is as attachment

 
  Given user is on live.demoguru99.com/index.php/backendlogin Home Page
    When user login with the credentials provided
    And user verify seeing a pop up window
   And user mouses hover to Order menu
   Then user select CSV to dropdown and click  Export 
   
   