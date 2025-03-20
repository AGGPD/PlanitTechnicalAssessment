package com.jupiter.cloud.planittesting.contactform;

import com.jupiter.cloud.planittesting.HomePage;
import org.openqa.selenium.By;

import static utilites.WaitUtility.explicitWaitUntilVisible;

public class ContactPage extends HomePage {
    // Locators for input fields
    private By forenameField = By.id("forename");
    private By emailField = By.id("email");
    private By messageField = By.id("message");

    // Locator for submit button
    private By submitButton = By.xpath("//a[normalize-space()='Submit']");

    // Locators for error messages
    private By forenameError = By.xpath("//span[@id='forename-err']");
    private By emailError = By.xpath("//span[@id='email-err']");
    private By messageError = By.xpath("//span[@id='message-err']");

    // Default wait time (in seconds)
    private final int defaultWait = 5;

    /**
     * Helper method to wait until an element is visible and then retrieve its text.
     */
    private String getErrorMessage(By locator, int waitSeconds) {
        explicitWaitUntilVisible(waitSeconds, locator);
        String errorMessage = find(locator).getText();
        System.out.println("Error message: " + errorMessage);
        return errorMessage;
    }

    /**
     * Clicks the submit button after waiting for it to be visible.
     */
    public void clickSubmitButton() {
        explicitWaitUntilVisible(defaultWait, submitButton);
        click(submitButton);
    }

    /**
     * Helper method to wait and set text in a given field.
     */
    private void setText(By locator, String text) {
        explicitWaitUntilVisible(defaultWait, locator);
        set(locator, text);
    }

    public void setForename(String forename) {
        setText(forenameField, forename);
    }

    public void setEmail(String email) {
        setText(emailField, email);
    }

    public void setMessage(String message) {
        setText(messageField, message);
    }

    public String getForenameError() {
        return getErrorMessage(forenameError, 3);
    }

    public String getEmailError() {
        return getErrorMessage(emailError, 3);
    }

    public String getMessageError() {
        return getErrorMessage(messageError, 3);
    }

    /**
     * Checks if the forename field's value contains an asterisk.
     */
    public boolean textFieldHasAsterisk() {
        explicitWaitUntilVisible(defaultWait, forenameField);
        return find(forenameField).getAttribute("value").contains("*");
    }

    /**
     * Clicks the submit button and returns an instance of AfterSubmitPage.
     */
    public AfterSubmitPage submitAndGoToAfterSubmitPage() {
        clickSubmitButton();
        return new AfterSubmitPage();
    }

    /**
     * Populates all mandatory fields using the provided data.
     */
    public void populateMandatoryFields(String forename, String email, String message) {
        setForename(forename);
        setEmail(email);
        setMessage(message);
    }
}
