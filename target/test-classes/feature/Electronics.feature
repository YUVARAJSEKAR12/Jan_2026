Feature: Adactin Hotel

  Background: 
    Given Login to the Adactin Application

  @test1_map
  Scenario: Enter the details for Adactin Hotel page
    When Enter the Search Hotel fields
      | Location | Sydney      |
      | Hotels   | Hotel Creek |
      | RoomType | Double      |

  @test1_list
  Scenario: Enter the details for Adactin Hotel page
    When Enter the Search Hotel fields using list
      | Sydney      |
      | Hotel Creek |
      | Double      |
