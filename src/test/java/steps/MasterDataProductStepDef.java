package steps;

import pages.LoginPage;
import pages.MasterDataPage;
import pages.WelcomePage;
public class MasterDataProductStepDef {
    private WelcomePage welcomePage;


    private MasterDataPage masterDataPage;

    public MasterDataProductStepDef()
    {
        welcomePage = new WelcomePage();
        masterDataPage = new MasterDataPage();
    }

//    @Given("input username3 {string}")
//    public void inputUsername(String username)
//    {
//        loginPage.inputUsername(username);
//    }
//
//    @Given("input password3 {string}")
//    public void inputPassword(String password)
//    {
//        loginPage.inputPassword(password);
//    }
//
//    @Then("login with username and password that filled3")
//    public void login ()
//    {
//        loginPage.loginUser();
//    }

//    @Given("navigate to welcome page3")
//    public void navigateWelcomePage()
//    {
//        welcomePage.navigateWelcomePage();
//    }
//
//    @Given("click to master data section")
//    public void navigateMasterData()
//    {
//        masterDataPage.navigateMasterData();
//    }
//
//    @Given("click product")
//    public void navigateProduct()
//    {
//        masterDataPage.navigateProduct();
//    }
//
//    @Given("input data for product")
//    public void inputDataProduct()
//    {
//        masterDataPage.inputData();
//    }
//
//    @Given("click save button3")
//    public void saveData()
//    {
//        welcomePage.saveData();
//    }
}
