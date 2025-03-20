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

        // Verify error messages for required fields
        verifyErrorMessage("Forename", contactPage.getForenameError(), "Forename is required");
        verifyErrorMessage("Email", contactPage.getEmailError(), "Email is required");
        verifyErrorMessage("Message", contactPage.getMessageError(), "Message is required");

        //populate fields
        contactPage.populateMandatoryFields("Test User", "test@example.com", "Test Message");

        //click submit button again
        contactPage.clickSubmitButton();
    }

    // Helper method for assertions to improve readability
    private void verifyErrorMessage(String fieldName, String actual, String expected) {
        Assert.assertEquals(actual, expected, fieldName + " error message mismatch");
    }

}
