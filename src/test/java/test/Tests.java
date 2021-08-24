package test;

import org.junit.jupiter.api.Test;
import page.DataHelper;
import page.LoginPage;

public class Tests {

    @Test
    void shoudSendCorrectLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.sendData(DataHelper.getCorrectLogin(), DataHelper.getCorrectPassword());
    }

    @Test
    void shoudSendFailLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.sendData(DataHelper.getWrongLogin(), DataHelper.getCorrectPassword());
    }

}
