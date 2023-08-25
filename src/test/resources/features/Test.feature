Feature: Demo QA Site Tests

Background:
  Given User Navigates to "https://demoqa.com"
@Test
  Scenario: Element Panel Tests
    Given User Clicks on "Elements"
    And User Clicks on "TextBox"
    And User Enters "Akhil" in "Name"
    And User Enters "demo@gmail.com" in "Email"
    And User Enters "Gurgaon" in "Address"
    Then User Clicks on "Submit"


  Scenario: Check Join Now Tab Opening
      Given User Clicks on Banner
      Then Verify that New Window is opened correctly

