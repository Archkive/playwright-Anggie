package pages;

import utils.TestBase;

public class WelcomePage extends TestBase {
    public String listBussinessPartner = "//li[contains(@id,'select2-C_')]";
    public String selectedPartner(int index) { return "(//li[contains(@id,'select2-C_')])["+index+"]";}

    public String listPaymentRule = "//li[contains(@id,'select2-PaymentRule')]";
    public String selectedPaymentRule(int index){return "(//li[contains(@id,'select2-PaymentRule')])["+index+"]";}
    private Dashboard dashboard;
//    private String units = "(//li[contains(@id,'select2-C_UOM_')])";
//    private Stirng = "";
    private String selectedUnit(int index) { return "(//li[contains(@id,'select2-C_UOM_')])["+index+"]";}

    public WelcomePage()
    {

    }

    public void navigateWelcomePage()
    {
        page.navigate("http://pakedus.kinnarastudio.com:8080/web/userview/pakedusid/pakedusid/_/welcome");
        page.waitForTimeout(5000);
    }

    public void navigateSalesSection()
    {
        page.locator("//html/body/div[2]/div[1]/div/div[1]/div[1]/div/nav/ul[2]/li[2]/a").isVisible();
        page.locator("//html/body/div[2]/div[1]/div/div[1]/div[1]/div/nav/ul[2]/li[2]/a").click();
        page.waitForTimeout(3000);
    }

    public void navigateCreateOrderShipment()
    {
        page.locator("//html/body/div[2]/div[1]/div/div[1]/div[1]/div/nav/ul[2]/li[2]/ul/li[1]/a").isVisible();
        page.locator("//html/body/div[2]/div[1]/div/div[1]/div[1]/div/nav/ul[2]/li[2]/ul/li[1]/a").click();
        page.waitForTimeout(3000);
    }

    public void navigateShipmentSection()
    {
        page.locator("//html/body/div[2]/div[1]/div/div[1]/div[1]/div/nav/ul[2]/li[3]/a").isVisible();
        page.locator("//html/body/div[2]/div[1]/div/div[1]/div[1]/div/nav/ul[2]/li[3]/a").click();
        page.waitForTimeout(3000);

    }

    public void navigateCreateShipment()
    {
        page.locator("//html/body/div[2]/div[1]/div/div[1]/div[1]/div/nav/ul[2]/li[3]/ul/li[1]/a").isVisible();
        page.locator("//html/body/div[2]/div[1]/div/div[1]/div[1]/div/nav/ul[2]/li[3]/ul/li[1]/a").click();
        page.waitForTimeout(3000);

    }

    public void inputDataOrder(String bp, String pr)
    {
        System.out.println("BP = " + bp);
        System.out.println("PR = " + pr);
        // Busindess partner
        page.locator("//*[@id=\"CreateOrderShipment\"]").isVisible();
        page.locator("//html/body/div[2]/div[1]/div/div[2]/main/div[1]/fieldset/form/div[1]/div[2]/div[1]/span/span[1]/span").click();

        int jmlBussinessPartner = page.locator(this.listBussinessPartner).count();
        for (int i = 1; i <= jmlBussinessPartner; i++){
            String bussinessPartner = page.locator(this.selectedPartner(i)).textContent();
            if(bussinessPartner.equalsIgnoreCase(bp)){
                page.locator(this.selectedPartner(i)).click();
                break;
            }
        }

        // Payment rule
        page.locator("//html/body/div[2]/div[1]/div/div[2]/main/div[1]/fieldset/form/div[1]/div[2]/div[2]/span/span[1]/span").click();
        boolean isFound = true;
        int i = 1;
        while(isFound) {
            String payment = page.locator(this.selectedPaymentRule(i)).textContent();
            if (payment.equalsIgnoreCase(pr)) {
                page.locator(this.selectedPaymentRule(i)).click();
                isFound = false;
            }
            i++;
        }
        // Product
        System.out.println(page.locator("//html/body/div[2]/div[1]/div/div[2]/main/div[1]/fieldset/form/div[1]/div[2]/div[3]/span/span[1]/span").isVisible());
        page.waitForSelector("//html/body/div[2]/div[1]/div/div[2]/main/div[1]/fieldset/form/div[1]/div[2]/div[3]/span/span[1]/span").isVisible();
        page.locator("//html/body/div[2]/div[1]/div/div[2]/main/div[1]/fieldset/form/div[1]/div[2]/div[3]/span/span[1]/span").click();
        page.locator("(//li[contains(@id,'select2-M_Product_')])[2]").click();
        // Quantity
        page.locator("//input[contains(@id,'QtyEntered')]").fill("20");

        //Unit
        page.locator("//html/body/div[2]/div[1]/div/div[2]/main/div[1]/fieldset/form/div[1]/div[2]/div[5]/span/span[1]/span").click();
        page.locator("(//li[contains(@id,'select2-C_UOM_')])[6]").click();

        //Total Price
        page.locator("//*[@id=\"PriceEntered\"]").fill("20000");
        page.waitForTimeout(1000);

    }

    public void inputDataShipment()
    {

        ////Location
        page.locator("//html/body/div[2]/div[1]/div/div[2]/main/div[1]/fieldset/form/div[2]/div[2]/div[1]/span/span[1]/span").click();
        page.locator("(//li[contains(@id,'select2-C_BPartner_Location')])[2]").click();

        //Courier
        page.locator("//html/body/div[2]/div[1]/div/div[2]/main/div[1]/fieldset/form/div[2]/div[2]/div[2]/span/span[1]/span").click();
        page.locator("(//li[contains(@id,'select2-AD_User_')])[3]").click();

        //Description
        page.locator("(//*[@id=\"Description\"])").fill("Dikirim Secepatnya");
        page.waitForTimeout(1000);

        //location
//        String[] l = {"Bandung City","Bandung City"};
//        for(int i=0;i<l.length)
//        {
//
//        }
//        page.locator("//html/body/div[2]/div[1]/div/div[2]/main/div[1]/fieldset/form/div[2]/div[2]/div[1]/span/span[1]/span").click();
//        page.locator("(//li[contains(@id,'select2-C_BPartner_Location')])[2]").click();
    }

    public void saveData()
    {
        page.locator("//*[@id=\"submit\"]").click();
        page.waitForTimeout(120000);
    }

    public void inputDataShipment2()
    {
        ////Shipment Section
        page.waitForTimeout(2000);
        //Bisnis Partner
        page.locator("//*[@id=\"CompositeShipment\"]").isVisible();
        page.locator("//html/body/div[2]/div[1]/div/div[2]/main/div[1]/fieldset/form/div[1]/div[2]/div[1]/span/span[1]/span").click();
        page.locator("(//li[contains(@id,'select2-C_BPartner_')])[3]").click();

        //Location
        page.locator("//html/body/div[2]/div[1]/div/div[2]/main/div[1]/fieldset/form/div[1]/div[2]/div[2]/span/span[1]/span").click();
        page.locator("(//li[contains(@id,'select2-C_BPartner_')])[1]").click();

        //Courier
        page.locator("//html/body/div[2]/div[1]/div/div[2]/main/div[1]/fieldset/form/div[1]/div[2]/div[3]/span/span[1]/span").click();
        page.locator("(//li[contains(@id,'select2-AD_User_')])[2]").click();

        //Description1
        page.locator("(//*[@id=\"Description\"])[1]").fill("Diisi Secepatnya");

    }

    public void inputShipmentItem()
    {
        ////Shipment Item Section
        //Product
        page.locator("//html/body/div[2]/div[1]/div/div[2]/main/div[1]/fieldset/form/div[2]/div[2]/div[1]/span/span[1]/span").click();
        page.locator("(//li[contains(@id,'select2-M_Product_')])[2]").click();

        //Quantity
        page.locator("//*[@id=\"QtyEntered\"]").fill("20");

        //Unit
        page.locator("//html/body/div[2]/div[1]/div/div[2]/main/div[1]/fieldset/form/div[2]/div[2]/div[3]/span/span[1]/span").click();
        page.locator("(//li[contains(@id,'select2-C_UOM_')])[3]").click();

        //Description2
        page.locator("(//*[@id=\"Description\"])[2]").fill("Barang Agile");
        page.waitForTimeout(2000);
    }

}
