Feature: Login

  Scenario: Successfull login with valid credentials
    Given User navigates to url "https://thinking-tester-contact-list.herokuapp.com/"
    Then Page Title as "Contact List App"
    Then element "Contact List App" should be present
    When User enters Email as "troberts@yaho.com"
      And Password as "1234567"
      And User clicks on "Submit" button
    Then Page Title as "My Contacts"
     And close browser

