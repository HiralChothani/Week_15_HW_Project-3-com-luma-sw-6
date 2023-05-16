package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class WomensPage extends Utility {

    private static final Logger log = LogManager.getLogger(WomensPage.class.getName());

    public WomensPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(css = "#ui-id-4")
    WebElement womenMenu;

    @CacheLookup
    @FindBy(css = "#ui-id-9")
    WebElement topsMenu;

    @CacheLookup
    @FindBy(css = "#ui-id-11")
    WebElement jackets;

    @CacheLookup
    @FindBy(xpath = "//select[@id='sorter']")
    WebElement dropDownList;

    @CacheLookup
    @FindBy(xpath = "//div[@class='product details product-item-details']//div[@class='price-box price-final_price']//span[@class='price']")
    WebElement priceElements;

    public void mouseHoverOnWomenMenu() {
        log.info("mouseHoverOnWomenMenu" );
        mouseHoverToElement(womenMenu);
    }

    public void mouseHoverOnTops() {
        log.info("mouseHoverOnTops" );
        mouseHoverToElement(topsMenu);
    }

    public void clickOnJackets() {
        log.info("clickOnJackets" );
        clickOnElement(jackets);
    }

    public void selectSortByFilter(int index) {
        log.info("Get selection by sorting filter" );
        selectByIndexFromDropDown(dropDownList, index);
    }

    public ArrayList<String> returnActualProductNameArrayList() {
        List<WebElement> listOfElements = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
        ArrayList<String> actualList = new ArrayList<>();
        for (WebElement element : listOfElements) {
            actualList.add(element.getText());
        }
       log.info("Get the product name verification" );
        return actualList;

    }

    public   ArrayList<String> returnActualPriceArrayList() throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> listOfElements = driver.findElements(By.xpath("//div[@class='product details product-item-details']//div[@class='price-box price-final_price']//span[@class='price']"));
        ArrayList<String> actualList = new ArrayList<>();
        for (WebElement element : listOfElements) {
            actualList.add(element.getText());
        }
        log.info("Get the product price verification" );
        return actualList;

    }


}
