package page;

import com.github.javafaker.Faker;
import lombok.Value;
import lombok.val;

import java.util.Locale;

public class DataHelper {

    @Value
    public static class Login {
        private String login;
    }

    public static Login getCorrectLogin() {
        return new Login("fominaelena");
    }

    public static Login getWrongLogin() {
        Faker faker = new Faker(new Locale("en"));
        val cardholder = faker.name().firstName();
        return new Login(cardholder);
    }

    @Value
    public static class Password {
        private String password;
    }

    public static Password getCorrectPassword() {
        return new Password("z0K6CTQR");
    }
}
