package com.jupiter.cloud.planittesting;

import base.BasePage;
import com.jupiter.cloud.planittesting.contactform.ContactPage;
import com.jupiter.cloud.planittesting.shop.ShopPage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {
    //locators
    private By contactLink = By.linkText("Contact");
    private By shopLink = By.linkText("Start Shopping »");

    //method
    public ContactPage goToContactPage(){
        click(contactLink);
        return new ContactPage();
    }

    public ShopPage goToShopPage(){
        click(shopLink);
        return new ShopPage();
    }
}
