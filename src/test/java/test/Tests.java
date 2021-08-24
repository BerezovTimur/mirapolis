package test;

import org.junit.jupiter.api.Test;
import page.DataHelper;
import page.LoginPage;

public class Tests {

    @Test
    void shoudSentCorrectLogin(){
        LoginPage loginPage = new LoginPage();
        loginPage.sentData(DataHelper.getCorrectLogin(), DataHelper.getCorrectPassword());
    }

    @Test
    void shoudSentFailLogin(){
        LoginPage loginPage = new LoginPage();
        loginPage.sentData(DataHelper.getWrongLogin(), DataHelper.getCorrectPassword());
    }

}
