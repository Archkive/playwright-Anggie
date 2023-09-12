package steps;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.WelcomePage;

public class CreateShipmentStepDef {
    private WelcomePage welcomePage;

    public CreateShipmentStepDef(){
        welcomePage = new WelcomePage();
    }

//    @Given("input username {string}")
//    public void inputUsername(String username)
//    {
////        loginPage.loginPage();
//        loginPage.inputUsername(username);
//    }
//
//    @Given("input password {string}")
//    public void inputPassword(String password)
//    {
//        loginPage.inputPassword(password);
//    }
//
//    @Then("login with username and password that filled")
//    public void login()
//    {
//        loginPage.loginUser();
//    }

    @Given("navigate to welcome page")
    public void navigateWelcomePage()
    {
        welcomePage.navigateWelcomePage();
    }

    @Given("click sales section")
    public void navigateSalesSection()
    {
        welcomePage.navigateSalesSection();
    }

    @Given("click create order shipment")
    public void navigateOrderShipment()
    {
        welcomePage.navigateCreateOrderShipment();
    }

    @Given("input data for order section")
    public void inputDataOrderSection(){
        welcomePage.inputDataOrder();
    }

    @Given("input data for shipment section")
    public void inputDataShipmentSection()
    {
        welcomePage.inputDataShipment();
    }

    @Given("click save button")
    public void saveData()
    {
        welcomePage.saveData();
    }



}
