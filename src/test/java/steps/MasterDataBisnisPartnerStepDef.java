package steps;


import pages.MasterDataBisnisPartnerPage;
import pages.MasterDataPage;
import pages.WelcomePage;

public class MasterDataBisnisPartnerStepDef
{
    private WelcomePage welcomePage;

    private MasterDataPage masterDataPage;


    private MasterDataBisnisPartnerPage masterDataBisnisPartnerPage;


    public MasterDataBisnisPartnerStepDef()
    {
        welcomePage = new WelcomePage();
        masterDataPage = new MasterDataPage();
        masterDataBisnisPartnerPage = new MasterDataBisnisPartnerPage();
    }

//    @Given("navigate to welcome page4")
//    public void navigateWelcomePage()
//    {
//        welcomePage.navigateWelcomePage();
//    }
//
//    @Given("click to master data section2")
//    public void navigateMasterData()
//    {
//        masterDataPage.navigateMasterData();
//    }
//
//    @Given("Click bisnisPartner")
//    public void navigateToBisnisPartner()
//    {
//        masterDataBisnisPartnerPage.navigateToBisnisPartner();
//    }
//
//    @Given("input data for bisnisPartner")
//    public void inputDataBisnis()
//    {
//        masterDataBisnisPartnerPage.inputDataBisnis();
//    }
//
//    @Given("click save button4")
//    public void saveData()
//    {
//        welcomePage.saveData();
//    }
}
