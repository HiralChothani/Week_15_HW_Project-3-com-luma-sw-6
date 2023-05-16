package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GearPage extends Utility {
    private static final Logger log = LogManager.getLogger(GearPage.class.getName());

    public GearPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(css = "#ui-id-6")
    WebElement gearMenu;

    @CacheLookup
    @FindBy(css = "#ui-id-25")
    WebElement bags;

    @CacheLookup
    @FindBy(xpath = "//img[@alt='Overnight Duffle']")
    WebElement overNightDuffle;

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement VerifyProductNameText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement enterQuantity;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Add to Cart']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(css = "div[data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement verifyTextAddToCartText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement VerifyOverNightDuffleText;

    @CacheLookup
    @FindBy(css = ".input-text.qty")
    WebElement actualQtyText;

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']")
    WebElement productPriceText;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement updateShoppingCart;

    @CacheLookup
    @FindBy(css = ".input-text.qty")
    WebElement qtyInShoppingCart;

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']")
    WebElement updatedPriceElementText;


    public void mouseHoverOnGearMenu() {
       log.info("MouseHover on gearMenu ");
        mouseHoverToElement(gearMenu);
    }

    public void clickOnBags() {
        log.info("Click on Bags ");
        clickOnElement(bags);
    }

    public void clickOnProductName() {
        log.info("Click on Product Name ‘Overnight Duffle’ ");
        clickOnElement(overNightDuffle);
    }

    public String getTextFromProductName() {
        log.info("Get text from the Product Name ‘Overnight Duffle’ ");
        return getTextFromElement(VerifyProductNameText);
    }

    public void changeQuantity(String qty) {
        log.info("Change Qty 3 ");
        sendTextToElement(enterQuantity, qty);
    }

    public void clearAnElement() {
        log.info("Clear an element ");
        clearValue(enterQuantity);
    }

    public void clickOnAddToCart() {
        log.info("Click on ‘Add to Cart’ Button. ");
        clickOnElement(addToCart);

    }

    public String getTextFromAfterAddToCart() {
        log.info("Get text from the ‘You added Overnight Duffle to your shopping cart.’ ");
        return getTextFromElement(verifyTextAddToCartText);
    }

    public void clickOnShoppingCart() {
        log.info("Click on ‘shopping cart’");
        clickOnElement(shoppingCart);
    }

    public String getTextFromOverNightDuffleBag() {
        log.info("Get text from the product name ‘Overnight Duffle’ ");
        return getTextFromElement(VerifyOverNightDuffleText);
    }

    public String getTextFromTheEnteredQuantity() {
        log.info("Get text from the Qty '3' ");
        return getAnAttributesFromTheElement(actualQtyText);
    }

    public String getTextFromProductPrice() {
        log.info("Get text from the product price ‘$135.00’ ");
        return getTextFromElement(productPriceText);
    }

    public void updateShoppingCart() {
        log.info("update the ShoppingCart ");
        clickOnElement(updateShoppingCart);
    }

    public void updateTheQuantity(String qty) {
        log.info("update the Quantity to '5' ");
        sendTextToElement(qtyInShoppingCart, qty);
    }

    public void clearAnElementFromUpdatedShoppingCart() {
        log.info("clearAnElementFromUpdatedShoppingCart");
        clearValue(qtyInShoppingCart);
    }

    public String getTextFromUpdatedProductPrice() {
        log.info("Get text from the product price '$225.00’  ");
        return getTextFromElement(updatedPriceElementText);
    }
}
