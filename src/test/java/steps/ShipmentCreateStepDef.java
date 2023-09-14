package steps;
import pages.LoginPage;
import pages.WelcomePage;
public class ShipmentCreateStepDef {
    private LoginPage loginPage;
    private WelcomePage welcomePage;

    public ShipmentCreateStepDef()
    {
        loginPage = new LoginPage();
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
//    @Then("login with username and password that filled2")
//    public void login()
//    {
//        loginPage.loginUser();
//    }

//    @Given("navigate to welcome page2")
//    public void navigateWelcomePage()
//    {
//        welcomePage.navigateWelcomePage();
//    }
//
//    @Given("click to shipment section")
//    public void clickShipmentSection(){welcomePage.navigateShipmentSection();}
//
//    @Given("click create shipment")
//    public void clickCreateShipment(){welcomePage.navigateCreateShipment();}
//
//    @Given("input data for shipment section2")
//    public void inputDataShipmentSection2(){welcomePage.inputDataShipment2();}
//
//    @Given("input data for shipment item")
//    public void inputDataShipmentItem(){welcomePage.inputShipmentItem();}
//
//    @Given("click save button2")
//    public void saveData2(){welcomePage.saveData();}
}
