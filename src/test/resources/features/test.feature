Feature: test

  Scenario:test amazon functionality
    When I open amazon
    Then I shoud see pages

  Scenario:Check login functionality
    When I click on Hello,Signin option
    Then It should go on to login page
    And Enter the E-mail and Password and click on the Sign in button

  Scenario:Verifly YourAccount functionality
    When I mouseoverto go onto YourAccount and click on it
    #Then It should go onto YourAccount page