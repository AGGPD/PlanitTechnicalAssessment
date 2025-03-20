package com.jupiter.cloud.planittesting;

import base.BasePage;
import com.jupiter.cloud.planittesting.contactform.ContactPage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {
    private By contactLink = By.linkText("Contact");

    public ContactPage goToContactPage(){
        click(contactLink);
        return new ContactPage();
    }
}
