@laptopAll
Feature: Laptops & NoteBooks

  Background: 
    Given User is on Retail website
    When User click on Laptops & NoteBooks tab
    And User click on Show all Laptops & NoteBooks

  @laptopOne
  Scenario: Add and Remove a MacBook from Cart
    And User click on MacBook item
    And User click add to Cart button
    Then User should get a message1 'Success: You have added MacBook to your shopping cart!'
    And User should see ' 1 item(s) - $602.00' showed to the cart
    And User click on cart option
    And User click on red X button to remove the item from cart
    Then item should be removed and cart should show '0 item(s) - $0.00'

  @laptopTwo
  Scenario: Product Comparison
    And user click on product comparison icon on MacBook
    And User click on product comparison icon on MacBookAir
    Then User should get a message2 'Success: You have added MacBook Air to your product comparison!'
    And User click on Product comparison link
    Then User should see Product Comparison Chart

  @laptopThree
  Scenario: Adding an item to Wish list
    And User click on heart icon to add Sony VAIO laptop to wish list
    Then User should get a message3 'You must login or create an account to save Sony VAIO to your wish list!'

  @laptopFour
  Scenario: Validate the price of MacBook Pro is 2000
    And User click on MacBook Pro item
    Then User should see '$2,000.00' price tag is present on UI
