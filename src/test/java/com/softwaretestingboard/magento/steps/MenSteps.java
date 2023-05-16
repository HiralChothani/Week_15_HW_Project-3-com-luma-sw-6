package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.MensPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MenSteps {
    @Given("^I am on Pants Page under Mens tab from Homepage$")
    public void iAmOnPantsPageUnderMensTabFromHomepage() {
        new MensPage().mouseHoverOnMenMenu();
        new MensPage().mouseHoverOnBottomMenu();
        new MensPage().clickOnPants();

    }

    @When("^I Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size\"([^\"]*)\"\\.$")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnSize(String arg0)  {
        new MensPage().mouseHoverAndClickOnProductSize();

    }

    @And("^I Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour \"([^\"]*)\"\\.$")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnColour(String arg0)  {
        new MensPage().mouseHoverAndClickOnProductColour();

    }

    @And("^I Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button\\.$")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnAddToCartButton() {
        new MensPage().clickOnAddToCartButton();
    }

    @And("^I Verify the text ‘You added Cronus Yoga Pant to your shopping cart\\.’$")
    public void iVerifyTheTextYouAddedCronusYogaPantToYourShoppingCart() {
        Assert.assertEquals(new MensPage().getTextForVerification(), "You added Cronus Yoga Pant to your shopping cart.", "Error message:texts are not matching");
    }

    @And("^I Click on ‘shopping cart’ Link into message$")
    public void iClickOnShoppingCartLinkIntoMessage() {
        new MensPage().clickOnShoppingCart();
    }

    @Then("^Product is added to shopping cart successfully$")
    public void productIsAddedToShoppingCartSuccessfully() {
    }

    @And("^I Verify the text ‘Shopping Cart\\.’$")
    public void iVerifyTheTextShoppingCart() {
        Assert.assertEquals(new MensPage().getTextFromShoppingCart(), "Shopping Cart", "Error message: ShoppingCart text is not matching");
    }

    @And("^I Verify the product name ‘Cronus Yoga Pant’$")
    public void iVerifyTheProductNameCronusYogaPant() {
        Assert.assertEquals(new MensPage().getTextFromProductName(), "Cronus Yoga Pant", "Error message: productName text is not matching");
    }

    @And("^I Verify the product size ‘(\\d+)’$")
    public void iVerifyTheProductSize(int arg0) {
        Assert.assertEquals(new MensPage().getTextFromProductSize(), "32", "Error message: productSize text is not matching");
    }

    @And("^I Verify the product colour ‘Black’$")
    public void iVerifyTheProductColourBlack() {
        Assert.assertEquals(new MensPage().getTextFromProductColour(), "Black", "Error message: productColour text is not matching");
    }
}
