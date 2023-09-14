package steps;

import io.cucumber.java8.En;
import pages.WelcomePage;

public class CreateShipmentStepDef implements En {
    private WelcomePage welcomePage;

    public CreateShipmentStepDef(){
        welcomePage = new WelcomePage();

        Given("navigate to welcome page",()->welcomePage.navigateWelcomePage());
        Given("click sales section",()->welcomePage.navigateSalesSection());
        Given("click create order shipment",()->welcomePage.navigateCreateOrderShipment());
        Given("input data {string} and {string} in order section",(String bp,String pr)->welcomePage.inputDataOrder(bp,pr));
        Given("input data for shipment section",()->welcomePage.inputDataShipment());
        Given("click save button",()->welcomePage.saveData());
    }


//    @Given("navigate to welcome page")
//    public void navigateWelcomePage()
//    {
//        welcomePage.navigateWelcomePage();
//    }
//
//    @Given("click sales section")
//    public void navigateSalesSection()
//    {
//        welcomePage.navigateSalesSection();
//    }
//
//    @Given("click create order shipment")
//    public void navigateOrderShipment()
//    {
//        welcomePage.navigateCreateOrderShipment();
//    }
//
//    @Given("input data for order section")
//    public void inputDataOrderSection(){
//        welcomePage.inputDataOrder();
//    }
//
//    @Given("input data for shipment section")
//    public void inputDataShipmentSection()
//    {
//        welcomePage.inputDataShipment();
//    }
//
//    @Given("click save button")
//    public void saveData()
//    {
//        welcomePage.saveData();
//    }



}
