@runAll
Feature: LoginPage Module
Background:
 Given Login to the Application "https://adactinhotelapp.com/"

  @test1_aiite @smoke
  Scenario: Validate the correct username and password
    When Enter the Username "Aiite132"
    And Enter the Password "Aiuefrijwef"
    And CLick the login button
    Then Validate the Home page

  @test2_aiite
  Scenario: Validate the incorrect username and password 
    When Enter the Username "Aiite142343232"
    And Enter the Password "Aiue2r323rfrijwef"
    And CLick the login button
    Then Validate the Home page

   @test3_aiite
  Scenario Outline: Validate the Login Page
    When Enter the User "<username>"
    And Enter the Pass "<password>"
    And CLick the login button
    Then Validate the Home page

    Examples: 
      | username | password |
      | Aiite1   | Yuvaraj1 |
      | Aiite2   | Yuvaraj2 |
