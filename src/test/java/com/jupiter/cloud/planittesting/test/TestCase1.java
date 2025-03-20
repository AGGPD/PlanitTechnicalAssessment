package com.jupiter.cloud.planittesting.test;

import com.jupiter.cloud.planittesting.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 extends BaseTest {

    @Test
    public void test1() {
        //From home to contact page
        var contactPage = homePage.goToContactPage();

        //click submit button
        contactPage.clickSubmitButton();

        //assert
        String actualForenameError = contactPage.getForenameError();
        String expectedForenameError = "Forename is required";
        Assert.assertEquals(actualForenameError, expectedForenameError);

        String actualEmailError = contactPage.getEmailError();
        String expectedEmailError = "Email is required";
        Assert.assertEquals(actualEmailError, expectedEmailError);

        String actualMessageError = contactPage.getMessageError();
        String expectedMessageError = "Message is required";
        Assert.assertEquals(actualMessageError, expectedMessageError);

        //populate fields
        contactPage.setForename("Test User");
        contactPage.setEmail("test@example.com");
        contactPage.setMessage("Test Message");

        //click submit button again
        contactPage.clickSubmitButton();
    }

}
