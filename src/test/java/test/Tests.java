package test;

import org.junit.jupiter.api.Test;
import page.DataHelper;
import page.LoginPage;

public class Tests {

    @Test
    void shoudSendCorrectLogin(){
        LoginPage loginPage = new LoginPage();
        loginPage.sendData(DataHelper.getCorrectLogin(), DataHelper.getCorrectPassword());
        loginPage.closePage();
    }

    @Test
    void shoudSendFailLogin(){
        LoginPage loginPage = new LoginPage();
        loginPage.sendData(DataHelper.getWrongLogin(), DataHelper.getCorrectPassword());
    }

    @Test
    void shoudGetForgotPasswordForm(){
        LoginPage loginPage = new LoginPage();
        loginPage.updatePassword();
    }

}
