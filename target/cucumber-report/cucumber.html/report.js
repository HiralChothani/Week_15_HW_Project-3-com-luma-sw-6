$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("gear.feature");
formatter.feature({
  "line": 1,
  "name": "Gear Test",
  "description": "As user I want to login into Luma website and want to add item to shopping cart from gear page",
  "id": "gear-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6978937100,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should add product successfully to shopping cart",
  "description": "",
  "id": "gear-test;user-should-add-product-successfully-to-shopping-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@sanity"
    },
    {
      "line": 4,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on Bags Page under gear tab from Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I Click on Product Name ‘Overnight Duffle’",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I Verify the text ‘Overnight Duffle’",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I Change Qty 3",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I Click on ‘Add to Cart’ Button.",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I Verify the text ‘You added Overnight Duffle to your shopping cart.’",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I Click on ‘shopping cart’ Link into message",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Product is added to shopping cart successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Verify the product name ‘Overnight Duffle’",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Verify the Qty is ‘3’",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Verify the product price ‘$135.00’",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I Change Qty to ‘5’",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I Click on ‘Update Shopping Cart’ button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I Verify the product price ‘$225.00’",
  "keyword": "And "
});
formatter.match({
  "location": "GearSteps.iAmOnBagsPageUnderGearTabFromHomepage()"
});
formatter.result({
  "duration": 2570091800,
  "status": "passed"
});
formatter.match({
  "location": "GearSteps.iClickOnProductNameOvernightDuffle()"
});
formatter.result({
  "duration": 1386024200,
  "status": "passed"
});
formatter.match({
  "location": "GearSteps.iVerifyTheTextOvernightDuffle()"
});
formatter.result({
  "duration": 229439200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 13
    }
  ],
  "location": "GearSteps.iChangeQty(int)"
});
formatter.result({
  "duration": 419900700,
  "status": "passed"
});
formatter.match({
  "location": "GearSteps.iClickOnAddToCartButton()"
});
formatter.result({
  "duration": 222726700,
  "status": "passed"
});
formatter.match({
  "location": "GearSteps.iVerifyTheTextYouAddedOvernightDuffleToYourShoppingCart()"
});
formatter.result({
  "duration": 1681107000,
  "status": "passed"
});
formatter.match({
  "location": "MenSteps.iClickOnShoppingCartLinkIntoMessage()"
});
formatter.result({
  "duration": 1705955200,
  "status": "passed"
});
formatter.match({
  "location": "MenSteps.productIsAddedToShoppingCartSuccessfully()"
});
formatter.result({
  "duration": 142700,
  "status": "passed"
});
formatter.match({
  "location": "GearSteps.verifyTheProductNameOvernightDuffle()"
});
formatter.result({
  "duration": 303817000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 19
    }
  ],
  "location": "GearSteps.verifyTheQtyIs(int)"
});
formatter.result({
  "duration": 237756600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "135",
      "offset": 27
    },
    {
      "val": "00",
      "offset": 31
    }
  ],
  "location": "GearSteps.verifyTheProductPrice$(int,int)"
});
formatter.result({
  "duration": 68931800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 17
    }
  ],
  "location": "GearSteps.iChangeQtyTo(int)"
});
formatter.result({
  "duration": 162380800,
  "status": "passed"
});
formatter.match({
  "location": "GearSteps.iClickOnUpdateShoppingCartButton()"
});
formatter.result({
  "duration": 116051300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "225",
      "offset": 29
    },
    {
      "val": "00",
      "offset": 33
    }
  ],
  "location": "GearSteps.iVerifyTheProductPrice$(int,int)"
});
formatter.result({
  "duration": 3849738000,
  "status": "passed"
});
formatter.after({
  "duration": 1184737900,
  "status": "passed"
});
});