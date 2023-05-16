package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.WomensPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Collections;

public class WomenSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I Mouse Hover on Women Menu$")
    public void iMouseHoverOnWomenMenu() {
        new WomensPage().mouseHoverOnWomenMenu();

    }

    @And("^I Mouse Hover on Tops$")
    public void iMouseHoverOnTops() {
        new WomensPage().mouseHoverOnTops();
    }

    @And("^I Click on Jackets$")
    public void iClickOnJackets() {
        new WomensPage().clickOnJackets();
    }

    @Then("^I am directed on Jackets Page$")
    public void iAmDirectedOnJacketsPage() {
    }

    @And("^I  Select Sort By filter “Product Name”$")
    public void iSelectSortByFilterProductName() {
        new WomensPage().selectSortByFilter(1);
    }

    @And("^I Verify the products name displays in alphabetical order$")
    public void iVerifyTheProductsNameDisplaysInAlphabeticalOrder() {
        ArrayList<String> expectedList = new WomensPage().returnActualProductNameArrayList();
        Collections.sort(expectedList);
        Assert.assertEquals(new WomensPage().returnActualProductNameArrayList(), expectedList);
    }

    @And("^I  Select Sort By filter “Price”$")
    public void iSelectSortByFilterPrice() {
        new WomensPage().selectSortByFilter(2);
    }

    @And("^I Verify the products price display in Low to High$")
    public void iVerifyTheProductsPriceDisplayInLowToHigh() throws InterruptedException {
        ArrayList<String> returnedActualList = new WomensPage().returnActualPriceArrayList();
        ArrayList<String> actualList = new ArrayList<>();
        for (String str : returnedActualList) {
            String s = str;
            s = s.replaceAll("\\$", "");
            actualList.add(s);
        }

        ArrayList<String> returnedExpectedList = new WomensPage().returnActualPriceArrayList();
        ArrayList<String> expectedList = new ArrayList<>();
        for (String str : returnedExpectedList) {
            String s = str;
            s = s.replaceAll("\\$", "");
            expectedList.add(s);
        }

        Collections.sort(expectedList);
        org.testng.Assert.assertEquals(actualList, expectedList, "Error message:products price is not display in Low to High");
    }
}
