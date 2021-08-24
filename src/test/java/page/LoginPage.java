package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    private String loginUrl = "https://lmslite47vr.demo.mirapolis.ru/mira";

    private SelenideElement loginField = $("[name=\"user\"]");
    private SelenideElement passwordField = $("[name=\"password\"]");
    private SelenideElement enterButton = $(byText("Войти"));

    public LoginPage() {
        open(loginUrl);
    }

    public void sentData(DataHelper.Login login, DataHelper.Password password) {
        loginField.setValue(login.getLogin());
        passwordField.setValue(password.getPassword());
        enterButton.click();
    }
}
