package com.jupiter.cloud.planittesting.contactform;

import com.jupiter.cloud.planittesting.HomePage;
import org.openqa.selenium.By;

import static utilites.WaitUtility.explicitWaitUntilVisible;

public class ContactPage extends HomePage {
    //locators
    private By forenameField = By.id("forename");
    private By emailField = By.id("email");
    private By messageField = By.id("message");

    private By submitButton = By.xpath("//a[normalize-space()='Submit']");

    // Error locators
    private By nameError = By.xpath("//span[@id='forename-err']");
    private By emailError = By.xpath("//span[@id='email-err']");
    private By messageError = By.xpath("//span[@id='message-err']");

    // click submit button action
    public void clickSubmitButton(){
        explicitWaitUntilVisible(5,submitButton);
        click(submitButton);
    }

    //enter text into field
    public void setForename(String forename){
        explicitWaitUntilVisible(5,forenameField);
        set(forenameField,forename);
    }
    public void setEmail(String email){
        explicitWaitUntilVisible(5,emailField);
        set(emailField,email);
    }
    public void setMessage(String message){
        explicitWaitUntilVisible(5,messageField);
        set(messageField,message);
    }

    // get error message
    public String getForenameError(){
        explicitWaitUntilVisible(3,nameError);
        String forenameErrorMessage = find(nameError).getText();
        System.out.println("Forename error message is: " + forenameErrorMessage);
        return forenameErrorMessage;
    }

    public String getEmailError(){
        explicitWaitUntilVisible(3,emailError);
        String emailErrorMessage = find(emailError).getText();
        System.out.println("Email error message is: " + emailErrorMessage);
        return emailErrorMessage;
    }

    public String getMessageError(){
        explicitWaitUntilVisible(3,messageError);
        String messageErrorMessage = find(messageError).getText();
        System.out.println("Message error message is: " + messageErrorMessage);
        return messageErrorMessage;
    }

    //check if field text contains "*"
    public boolean textFieldHasAsterisk(){
        return find(forenameField).getAttribute("value").contains("*");
    }

    //submit and go to AfterSubmitPage
    public AfterSubmitPage submitAndGoToAfterSubmitPage(){
        explicitWaitUntilVisible(5,submitButton);
        clickSubmitButton();
        return new AfterSubmitPage();
    }




}
