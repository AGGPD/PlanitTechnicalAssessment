package com.jupiter.cloud.planittesting.test;

import com.jupiter.cloud.planittesting.base.BaseTest;
import org.testng.annotations.Test;

public class TestCase1 extends BaseTest {

    @Test
    public void test1() {
        //From home to contact page
        var contactPage = homePage.goToContactPage();

        //click submit button
        contactPage.clickSubmitButton();

        //assert
        assert !contactPage.getEmailError().isEmpty();
        assert !contactPage.getForenameError().isEmpty();
        assert !contactPage.getMessageError().isEmpty();

        //populate fields
        contactPage.setForename("Test User");
        contactPage.setEmail("test@example.com");
        contactPage.setMessage("Test Message");

        //click submit button again
        contactPage.clickSubmitButton();

        //assert
        assert contactPage.getEmailError().isEmpty();
        assert contactPage.getForenameError().isEmpty();
        assert contactPage.getMessageError().isEmpty();
    }

}
