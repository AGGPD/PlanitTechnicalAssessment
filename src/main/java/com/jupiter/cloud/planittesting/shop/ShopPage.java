package com.jupiter.cloud.planittesting.shop;

import com.jupiter.cloud.planittesting.HomePage;
import org.openqa.selenium.By;
import utilites.WaitUtility;

import static utilites.WaitUtility.*;

public class ShopPage extends HomePage {
    //locators
    private By buyFrogButton = By.cssSelector("li[id='product-2'] a[class='btn btn-success']");
    private By buyBunnyButton = By.cssSelector("li[id='product-4'] a[class='btn btn-success']");
    private By buyBearButton = By.cssSelector("li[id='product-7'] a[class='btn btn-success']");
    //cart link
    private By cartLink = By.xpath("//a[@href='#/cart']");

    //buy method
    public void buyProduct(String product, int quantity){
        By locator = switch (product.toLowerCase()) {
            case "stuffed frog" -> buyFrogButton;
            case "fluffy bunny" -> buyBunnyButton;
            case "valentine bear" -> buyBearButton;
            default -> throw new IllegalArgumentException("Invalid product name");
        };

        for (int i = 0; i < quantity; i++) {
            explicitWaitUntilVisible(5, locator);
            click(locator);
            // WaitUtility.explicitWaitUntilVisible(1, cartLink); // Ensure cart updates
        }
    }
    //method to go to cart
    public CartPage goToCartPage(){
        explicitWaitUntilVisible(10,cartLink);
        click(cartLink);
        return new CartPage();
    }

    /*

    // method to buy
    public void clickBuyFrogButton(){
        explicitWaitUntilVisible(5,buyFrogButton);
        click(buyFrogButton);
    }
    public void clickBuyBunnyButton(){
        explicitWaitUntilVisible(5,buyBunnyButton);
        click(buyBunnyButton);
    }
    public void clickBuyBearButton(){
        explicitWaitUntilVisible(5,buyBearButton);
        click(buyBearButton);
    }
     */
}
