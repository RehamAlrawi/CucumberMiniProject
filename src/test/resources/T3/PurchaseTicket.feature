Feature: Purchase Ticket Functionality

  Scenario Outline: Verify Purchase Ticket
    Given User Navigate to URL "https://blazedemo.com/purchase.php"
    When User enter fullName "<name>"
    And User enter Address "<address>"
    And User enter city "<city>"
    And User enter state "<state>"
    And User enter zipcode "<zipCode>"
    And User chosse card type "<cardType>"
    And User enter credit card number "<cardNum>"
    And User enter Month "<month>"
    And User enter year "<year>"
    And User enter name on card "<name>"
    And User click remember me
    And User click purchase flight button
    Then User verify text "Thank you for your purchase today!"

    Examples: 
      | name       | address       | city      | state | zipCode | cardType         | cardNum | month | year | name       |
      | john cena  | 123 google dr | lorton    | VA    |   22079 | Visa             |  555555 |    07 | 2023 | john cena  |
      | Reham R    | 345 abc dr    | reston    | CA    |   95621 | American Express |  666666 |    08 | 2023 | reham r    |
      | mohammad A | 876 xyz dr    | San Ramon | CA    |   94582 | Visa             |  222222 |    10 | 2024 | mohammad a |
      | Jude B     | 980 hello dr  | reston    | NY    |   22034 | American Express |  999999 |    01 | 2024 | jude b     |
      | Tala J     | 678 google dr | sterling  | AZ    |   95632 | Visa             |  777777 |    11 | 2023 | tala j     |
