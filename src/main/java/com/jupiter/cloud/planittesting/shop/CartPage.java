package com.jupiter.cloud.planittesting.shop;

import base.BasePage;
import org.openqa.selenium.By;
import static utilites.WaitUtility.explicitWaitUntilVisible;

public class CartPage extends BasePage {

    public double getProductPrice(String productName) {
        By priceLocator = By.xpath("//td[normalize-space()='" + productName + "']/../td[2]");
        explicitWaitUntilVisible(5, priceLocator);
        String priceText = find(priceLocator).getText();
        return parseCurrency(priceText);
    }

    public double getProductSubtotal(String productName) {
        By subtotalLocator = By.xpath("//td[normalize-space()='" + productName + "']/../td[4]");
        explicitWaitUntilVisible(5, subtotalLocator);
        String subtotalText = find(subtotalLocator).getText();
        return parseCurrency(subtotalText);
    }

    public double getTotal() {
        By totalLocator = By.className("total");
        explicitWaitUntilVisible(5, totalLocator);
        String totalText = find(totalLocator).getText();
        String totalValue = totalText.split(":")[1].trim();
        return parseCurrency(totalValue);
    }

    private double parseCurrency(String text) {
        return Double.parseDouble(text.replace("$", ""));
    }
}