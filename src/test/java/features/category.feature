Feature: Category

  Background:
    Given i am on DemonopCommerce homepage

  @category
  Scenario Outline: Category feature

    When I click on "<button_name>" button
    Then I should able to verify I am navigated to related page "<page_url>" successfully
    And I should able to verify the page title as "<page_title>"

    Examples:
      | button_name       | page_url                                       | page_title        |
      | Computers         | https://demo.nopcommerce.com/computers         | Computers         |
      | Electronics       | https://demo.nopcommerce.com/electronics       | Electronics       |
      | Apparel           | https://demo.nopcommerce.com/apparel           | Apparel           |
      | Digital downloads | https://demo.nopcommerce.com/digital-downloads | Digital downloads |
      | Books             | https://demo.nopcommerce.com/books             | Books             |
      | Jewelry           | https://demo.nopcommerce.com/jewelry           | Jewelry           |
      | Gift Cards        | https://demo.nopcommerce.com/gift-cards        | Gift Cards        |

    @hover
    Scenario: I hover over the category link and verify the change
      When I hover over "Computers" category link
      Then I should able to verify after hover color changes
      When I click on subcategory "Notebooks" link
      Then I should able to related subCategory page navigated to "/notebook" page

  @guestUserCheckOutSuccessfully
  Scenario: I as a guest user should able to check out successfully
    When I enter product details for build your own computer
    When I enter product shopping cart details
    When I enter product payment details
    Then I should able to check out successfully
