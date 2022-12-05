package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By signinButton = By.xpath("//li[@class='header__nav-item header__nav-sign-in']//a");
    By welcomeText = By.xpath("//div[@class='sign-in__wrapper']//h1[contains(text(),'Welcome')]");
    By userNameField = By.id("user[email]");
    By passwordField = By.id("user[password]");
    By signInLink = By.xpath("//input[@value='Sign in']");
    By errorMessage = By.xpath("//li[text() = 'Invalid email or password.']");


    public void clickOnSigninButton() {
        clickOnElement(signinButton);
    }

    public String getWelcomeText() {
        return getTextFormElement(welcomeText);
    }
    public void enterEmailToEmailField(String username){
        sendTextToElement(userNameField,username);
    }
    public void enterPasswordToPasswordField(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnSignInLink(){
        clickOnElement(signInLink);
    }
    public String getErrorMessage(){
        return getTextFormElement(errorMessage);

    }
}
