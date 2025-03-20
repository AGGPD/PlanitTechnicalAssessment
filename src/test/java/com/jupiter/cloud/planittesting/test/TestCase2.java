package com.jupiter.cloud.planittesting.test;

import com.jupiter.cloud.planittesting.base.BaseTest;
import com.jupiter.cloud.planittesting.contactform.AfterSubmitPage;
import org.testng.annotations.Test;

public class TestCase2 extends BaseTest {

    @Test(invocationCount = 5) //Run this test 5 times
    public void test2() {
        //From home to contact page
        var contactPage = homePage.goToContactPage();

        //populate mandatory field
        contactPage.setForename("Test User");
        contactPage.setEmail("test@example.com");
        contactPage.setMessage("Test Message");

        //go to after page after clicking submit button
        contactPage.submitAndGoToAfterSubmitPage();

        //page object
        var afterSubmitPage = new AfterSubmitPage();

        //click back button to go back to contactPage
        afterSubmitPage.clickBackButton();

    }

}
