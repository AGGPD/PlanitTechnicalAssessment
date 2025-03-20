package com.jupiter.cloud.planittesting.contactform;

import org.openqa.selenium.By;

import static utilites.WaitUtility.fluentWaitUntilVisible;

public class AfterSubmitPage extends ContactPage {
    // locate backButton
    private By backButton = By.xpath("//a[normalize-space()='« Back']");
    // click backButton
    public ContactPage clickBackButton(){
        fluentWaitUntilVisible(30,backButton);
        click(backButton);
        return new ContactPage();
    }
}
