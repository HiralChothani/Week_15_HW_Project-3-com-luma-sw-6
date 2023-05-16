package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MensPage extends Utility {
    private static final Logger log = LogManager.getLogger(MensPage.class.getName());

    public MensPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(css = "#ui-id-5")
    WebElement menMenu;

    @CacheLookup
    @FindBy(css = "#ui-id-18")
    WebElement bottomMenu;

    @CacheLookup
    @FindBy(css = "#ui-id-23")
    WebElement pants;

    @CacheLookup
    @FindBy(css = "img[alt='Cronus Yoga Pant ']")
    WebElement cronusYogaPant;

    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']")
    WebElement size32;

    @CacheLookup
    @FindBy(css = "#option-label-color-93-item-49")
    WebElement colourBlack;

    @CacheLookup
    @FindBy(xpath = "//div[@class='actions-primary']//span[text()='Add to Cart'][1]")
    WebElement addToCart;

    @CacheLookup
    @FindBy(css = "div[data-bind='html: $parent.prepareMessageForHtml(message.text)']" )
    WebElement verifyText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCartLink;

    @CacheLookup
    @FindBy(xpath = "//span[@class='base' and text()='Shopping Cart']")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement productNameText;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement productSizeText;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement productColorText;

    public void mouseHoverOnMenMenu() {
        log.info("MouseHover on menMenu ");
        mouseHoverToElement(menMenu);
    }

    public void mouseHoverOnBottomMenu() {
        log.info("MouseHover on bottomMenu " );
        mouseHoverToElement(bottomMenu);
    }

    public void clickOnPants() {
        log.info("Clicking on Pants" );
        clickOnElement(pants);
    }


    public void mouseHoverAndClickOnProductSize() {
        log.info("MouseHover and click on cronusYogaPant " );
        mouseHoverToElementAndClick(size32);
    }

    public void mouseHoverAndClickOnProductColour() {
        log.info("MouseHover and click on colourBlack " );
        mouseHoverToElementAndClick(colourBlack);
    }

    public void clickOnAddToCartButton() {
        log.info("Clicking on addToCart" );
        clickOnElement(addToCart);
    }

    public void clickOnShoppingCart() {
        log.info("Clicking on shoppingCartLink" );
        clickOnElement(shoppingCartLink);
    }
    public String getTextForVerification() {
        log.info("Get text from the ‘You added Cronus Yoga Pant to your shopping cart.’ ");
        return getTextFromElement(verifyText);
    }

    public String getTextFromShoppingCart() {
        log.info("Get text from shoppingCart ‘Shopping Cart.’");
        return getTextFromElement(shoppingCartText);
    }

    public String getTextFromProductName() {
        log.info("Get text from productName ‘Cronus Yoga Pant’");
        return getTextFromElement(productNameText);

    }

    public String getTextFromProductSize() {
        log.info("Get text from productSize ‘32’");
        return getTextFromElement(productSizeText);
    }

    public String getTextFromProductColour() {
       log.info("Get text from productColour ‘Black’ ");
        return getTextFromElement(productColorText);

    }

}
