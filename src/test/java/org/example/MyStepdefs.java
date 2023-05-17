package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    Email_A_Friend email_a_friend = new Email_A_Friend();
    Email_A_Friend_ResultPage emailAFriendResultPage = new Email_A_Friend_ResultPage();

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


}


