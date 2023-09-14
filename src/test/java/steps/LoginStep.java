package steps;

import io.cucumber.java8.En;
import pages.LoginPage;
import utils.TestBase;

public class LoginStep implements En {
    private LoginPage loginPage;

    public LoginStep()

    {
        loginPage = new LoginPage();

        Before(() -> {
            _Hooks hooks = new _Hooks();
            hooks.before();
        });

        Given("input {string} in username", (String username) -> {
            // Write code here that turns the phrase above into concrete actions
            loginPage.inputUsername(username);
        });

        Given("input {string} in password",(String pasword) -> loginPage.inputPassword(pasword));

        Then("login with username and password that filled",()-> loginPage.loginUser());

    }

//    @Then("login with username and password that filled")
//    public void login()
//    {
//        loginPage.loginUser();
//    }
}
