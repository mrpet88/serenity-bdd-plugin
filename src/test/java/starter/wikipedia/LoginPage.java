package starter.wikipedia;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    By usernameInput = By.id("username");
    By passwordInput = By.id("password");
    By submitButton = By.cssSelector("button[name=action]");
    By errorMessage = By.id("error-element-password");

    public void loginAs() {
        clickOn($(usernameInput));
        clickOn($(passwordInput));
        clickOn($(submitButton));
        clickOn($(errorMessage));
    }
}
