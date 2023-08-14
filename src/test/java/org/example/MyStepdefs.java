package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MyStepdefs extends Utils {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    Email_A_Friend email_a_friend = new Email_A_Friend();
    Email_A_Friend_ResultPage emailAFriendResultPage = new Email_A_Friend_ResultPage();
    BuildYourProduct buildYourProduct = new BuildYourProduct();
    BuildYourProductShoppingCart buildYourProductShoppingCart = new BuildYourProductShoppingCart();
    BuildYourProductPayment buildYourProductPayment = new BuildYourProductPayment();
    BuildYourProductResultPage buildYourProductResultPage = new BuildYourProductResultPage();
    private String categoryButton;

    //Registration successfully
    @Given("I am on register Page")
    public void i_am_on_register_page() {
        // Write code here that turns the phrase above into concrete actions
        homePage.clickOnRegisterButton();
    }
    @When("I enter registration details")
    public void i_enter_registration_details() {
        // Write code here that turns the phrase above into concrete actions
        registerPage.enterRegistrationDetails();
    }
    @Then("I should able to register successfully")
    public void i_should_able_to_register_successfully() {
        // Write code here that turns the phrase above into concrete actions
        registerResultPage.verifyUserRegisteredSuccessfully();
    }
    //Product Refers a friend
    @Given("I am on electronics Page")
    public void i_Am_On_Electronics_Page() {
        homePage.clickOnProductButton();
    }
    @When("I enter products detail for email a friend")
    public void iEnterProductsDetailForEmailAFriend() {
        email_a_friend.enterProductsDetailForEmailAFriend();
    }
    @Then("I should able to email a friend successfully")
    public void i_should_able_to_email_a_friend_successfully(){
        emailAFriendResultPage.verifyUserEmailAFriendSuccessfully();
    }
    @When("I click on {string} button")
    public void iClickOnButton(String button_name) {
        clickOnElements(By.xpath("//a[text()='"+button_name+" ']"));
    }
    @Then("I should able to verify I am navigated to related page {string} successfully")
    public void iShouldAbleToVerifyIAmNavigatedToRelatedPageSuccessfully(String page_url) {
        Assert.assertEquals(getCurrentURL(), page_url);
    }
    @And("I should able to verify the page title as {string}")
    public void iShouldAbleToVerifyThePageTitleAs(String page_title) {
        Assert.assertEquals(getTextFromElement(By.tagName("h1")),page_title);
    }
    @Given("i am on DemonopCommerce homepage")
    public void iAmOnDemonopCommerceHomepage() {
    }
    @When("I hover over {string} category link")
    public void iHoverOverCategoryLink(String categoryButton) {
        homePage.hoverOverCategoryButton(categoryButton);
    }

    @Then("I should able to verify after hover color changes")
    public void iShouldAbleToVerifyAfterHoverColorChanges() {

    }
    @When("I click on subcategory {string} link")
    public void iClickOnSubcategoryLink(String subCategoryName) {
        clickOnElements(By.cssSelector(subCategoryName));
    }
    @Then("I should able to related subCategory page navigated to {string} page")
    public void iShouldAbleToRelatedSubCategoryPageNavigatedToPage(String arg0) {
        homePage.hoverOverCategoryButton("Notebooks");
    }


    @When("I enter product details for build your own computer")
    public void iEnterProductDetailsForBuildYourOwnComputer() {
        homePage.clickOnBuildYourOwnComputer();
        buildYourProduct.enterBuildYourProductDetails();
    }
    @When("I enter product shopping cart details")
    public void iEnterProductShoppingCartDetails() {
        buildYourProductShoppingCart.enterShoppingCartDetails();
    }
    @When("I enter product payment details")
    public void iEnterProductPaymentDetails() {
        buildYourProductPayment.enterPaymentDetails();
    }
    @Then("I should able to check out successfully")
    public void iShouldAbleToCheckOutSuccessfully() {
        buildYourProductResultPage.verifyUserBuildYourProductSuccessfully();
    }


}


