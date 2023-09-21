package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java8.En;
import pages.LoginPage;

public class LoginStep implements En {
    private LoginPage loginPage;

    public LoginStep()
    {
        loginPage = new LoginPage();
    }

    @Given("input username {string}")
    public void inputUsername(String username)
    {
        loginPage.inputUsername(username);
    }

    @Given("input password {string}")
    public void inputPassword(String password)
    {
        loginPage.inputPassword(password);
    }


    @Then("login with username and password that filled")
    public void login()
    {
        loginPage.loginUser();
    }
}
