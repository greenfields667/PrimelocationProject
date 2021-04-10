Feature: For Sale Property Search
  As a customer
@ignore
  Scenario Outline: Customer can search for properties for sale
    Given I navigate to Primelocation homepage
    When I click on For Sale Tab
    And I enter "<Location>" into the search field
    And I select minimum price "<MinimunPrice>"
    And I select maximum price "<MaximunPrice>"
    And I select "<Property>" for property type
    And I select "<Bedrooms>" bedrooms type
    And I click on search button
    Then the result for "<Property>" for sale in "<Location>" is displayed

    Examples: Test Data
      | Location           | MinimunPrice | MaximunPrice | Property   | Bedrooms |
      | Manchester         | £120,000     | £200,000     | Houses     | 3+       |
    # | M40 2EB            | £120,000     | £200,000     | Houses     | 3+       |
    #  | Piccadilly Station | £120,000     | £200,000     | Houses     | 3+       |
    #  | Manchester         | £120,000     | £200,000     | Flats      | 3+
    #  | Manchester         | £120,000     | £200,000     | Farms/land | 3+       |


  Scenario Outline: Customer can view the details of properties for sale
    Given I navigate to Primelocation homepage
    When I click on For Sale Tab
    And I enter "<Location>" into the search field
    And I select minimum price "<MinimunPrice>"
    And I select maximum price "<MaximunPrice>"
    And I select "<Property>" for property type
    And I select "<Bedrooms>" bedrooms type
    And I click on search button
    And result is displayed for the search above
    And I click on one of the results displayed
    Then the details of the property clicked on is displayed

    Examples: Test Data
      | Location           | MinimunPrice | MaximunPrice | Property   | Bedrooms |
      | Manchester         | £120,000     | £200,000     | Houses     | 3+       |


  @ignore
  Scenario: Customer can not search with space
    Given I navigate to Primelocation homepage
    When I enter " "  into the search field


