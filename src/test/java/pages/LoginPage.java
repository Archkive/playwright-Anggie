package pages;

import utils.TestBase;

public class LoginPage extends TestBase {

//    Login
//    Register
//    Input password
    private Dashboard dashboard;

    public LoginPage()
    {
        dashboard = new Dashboard();
    }

    public void loginPage()
    {
        page.navigate("http://pakedus.kinnarastudio.com:8080/web/login");
    }

    public void inputUsername(String username)
    {
        page.waitForTimeout(2000);
        page.waitForSelector("//*[@id=\"loginForm\"]").isVisible();
        //page.locator("//*[@id=\"loginForm\"]").isVisible();
        page.locator("//*[@id=\"j_username\"]").fill(username);
    }

    public void inputPassword(String password)
    {
        page.locator("//*[@id=\"j_password\"]").fill(password);
    }

    public void loginUser()
    {
        page.locator("//html/body/div[2]/div[2]/div/div/main/form/table/tbody/tr[3]/td[2]/i/input").click();
        page.waitForTimeout(5000);
    }
}
