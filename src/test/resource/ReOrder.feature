Feature: ReOrder Test

  Scenario: To verify that user is able to change or reorder previously added products
    Given user is on Home Page
    And user verify Home Page title
    And user click on My Account link
    And user log in with previous created credentials
    And I click on Reorder link button
    And I change the quantity and click on update
    And I verify GRAND TOTAL IS changed
    And user user clicks on proceed To Checkout
    Then user clicks on continue in billing page
    Then user click continue button on shipping page
    And user selects mode of payment
    And user log into order page
    Then user click on Place Order
    And user confirm that order is placed
