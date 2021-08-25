package test;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import page.DataHelper;
import page.LoginPage;

public class Tests {

    @BeforeAll
    static void setUpAll() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterAll
    static void tearDownAll() {
        SelenideLogger.removeListener("allure");
    }

    @Test
    void shoudSendCorrectLogin(){
        LoginPage loginPage = new LoginPage();
        loginPage.sendData(DataHelper.getCorrectLogin(), DataHelper.getCorrectPassword());
        loginPage.closePage();
    }

    @Test
    void shoudSendEmptyData(){
        LoginPage loginPage = new LoginPage();
        loginPage.sendData(DataHelper.getEmptyLogin(), DataHelper.getEmptyPassword());
        loginPage.modalWindow();
    }

    @Test
    void shoudSendOnlyLogin(){
        LoginPage loginPage = new LoginPage();
        loginPage.sendData(DataHelper.getCorrectLogin(), DataHelper.getEmptyPassword());
        loginPage.modalWindow();
    }

    @Test
    void shoudSendOnlyPassword(){
        LoginPage loginPage = new LoginPage();
        loginPage.sendData(DataHelper.getEmptyLogin(), DataHelper.getCorrectPassword());
        loginPage.modalWindow();
    }

    @Test
    void shoudGetErrorWindow(){
        LoginPage loginPage = new LoginPage();
        loginPage.sendData(DataHelper.getWrongLogin(), DataHelper.getCorrectPassword());
        loginPage.modalWindow();
    }

    @Test
    void shoudGetForgotPasswordForm(){
        LoginPage loginPage = new LoginPage();
        loginPage.updatePassword();
    }

}
