package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.GearPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class GearSteps {
    @Given("^I am on Bags Page under gear tab from Homepage$")
    public void iAmOnBagsPageUnderGearTabFromHomepage() {
        new GearPage().mouseHoverOnGearMenu();
        new GearPage().clickOnBags();
    }

    @When("^I Click on Product Name ‘Overnight Duffle’$")
    public void iClickOnProductNameOvernightDuffle() {
        new GearPage().clickOnProductName();
    }

    @And("^I Verify the text ‘Overnight Duffle’$")
    public void iVerifyTheTextOvernightDuffle() {
        Assert.assertEquals(new GearPage().getTextFromProductName(), "Overnight Duffle", "Error message: Product name is not matching");
    }

    @And("^I Change Qty (\\d+)$")
    public void iChangeQty(int arg0) {
        new GearPage().clearAnElement();
        new GearPage().changeQuantity("3");

    }

    @And("^I Click on ‘Add to Cart’ Button\\.$")
    public void iClickOnAddToCartButton() {
        new GearPage().clickOnAddToCart();
    }

    @And("^I Verify the text ‘You added Overnight Duffle to your shopping cart\\.’$")
    public void iVerifyTheTextYouAddedOvernightDuffleToYourShoppingCart() {
        Assert.assertEquals(new GearPage().getTextFromAfterAddToCart(), "You added Overnight Duffle to your shopping cart.", "Error message: message is not matching");
    }

    @And("^Verify the product name ‘Overnight Duffle’$")
    public void verifyTheProductNameOvernightDuffle() {
        Assert.assertEquals(new GearPage().getTextFromOverNightDuffleBag(),  "Overnight Duffle", "Error message: message is not matching");
    }

    @And("^Verify the Qty is ‘(\\d+)’$")
    public void verifyTheQtyIs(int arg0) {
        Assert.assertEquals(new GearPage().getTextFromTheEnteredQuantity(), "3", "Error message: Quantity is not matching");
    }

    @And("^Verify the product price ‘\\$(\\d+)\\.(\\d+)’$")
    public void verifyTheProductPrice$(int arg0, int arg1) {
        Assert.assertEquals(new GearPage().getTextFromProductPrice(), "$135.00", "Error message: Price is not matching");
    }

    @And("^I Change Qty to ‘(\\d+)’$")
    public void iChangeQtyTo(int arg0) {
        new GearPage().clearAnElementFromUpdatedShoppingCart();
        new GearPage().updateTheQuantity("5");
    }

    @And("^I Click on ‘Update Shopping Cart’ button$")
    public void iClickOnUpdateShoppingCartButton() {
        new GearPage().updateShoppingCart();
    }

    @And("^I Verify the product price ‘\\$(\\d+)\\.(\\d+)’$")
    public void iVerifyTheProductPrice$(int arg0, int arg1) {
        Assert.assertEquals(new GearPage().getTextFromUpdatedProductPrice(), "$225.00", "Error message: Price is not matching");
    }


}
