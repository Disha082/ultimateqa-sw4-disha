package com.ultimateqa.courses.testsuite;


import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        loginPage.clickOnSigninButton();
        loginPage.getWelcomeText();
        String expectedMessage = "Welcome Back!";
        Assert.assertEquals(loginPage.getWelcomeText(),expectedMessage,"Error message not dispalyed");
    }
    @Test
    public void  verifyTheErrorMessage(){
        loginPage.clickOnSigninButton();
        loginPage.enterEmailToEmailField("abc123@gmail.com");
        loginPage.enterPasswordToPasswordField("juhg123");
        loginPage.clickOnSignInLink();
        String expectedErrorMessage = "Invalid email or password.";
        Assert.assertEquals(loginPage.getErrorMessage(),expectedErrorMessage,"Not matched");

    }

    }




