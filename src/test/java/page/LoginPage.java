package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    private String loginUrl = "https://lmslite47vr.demo.mirapolis.ru/mira";

    private SelenideElement loginField = $("[name=\"user\"]");
    private SelenideElement passwordField = $("[name=\"password\"]");
    private SelenideElement enterButton = $(byText("Войти"));
    private SelenideElement lostPassword = $("[class=\"mira-default-login-page-link\"]");
    private SelenideElement forgotPasswordForm = $("[class=\"mira-page-forgot-password-form\"]");
    private SelenideElement avatarButton = $("[class=\"avatar\"]");
    private SelenideElement exitButton = $("[class=\"mira-user-info-logout\"]");
    private SelenideElement modalWindow = $("[class=\"modal\"]");

    public LoginPage() {
        open(loginUrl);
    }

    public void sendData(DataHelper.Login login, DataHelper.Password password) {
        loginField.setValue(login.getLogin());
        passwordField.setValue(password.getPassword());
        enterButton.click();
    }

    public void closePage() {
        avatarButton.click();
        exitButton.click();
    }

    public void modalWindow() {
        modalWindow.shouldBe(Condition.visible);
    }

    public void updatePassword() {
        lostPassword.click();
        forgotPasswordForm.shouldBe(Condition.visible);
    }
}
