package pages;

import utils.TestBase;

public class MasterDataBisnisPartnerPage extends TestBase {
    public void navigateToBisnisPartner()
    {
        page.locator("//html/body/div[2]/div[1]/div/div[1]/div[1]/div/nav/ul[2]/li[4]/ul/li[2]/a").click();
        page.waitForTimeout(1000);
        page.locator("//html/body/div[2]/div[1]/div/div[2]/main/div/div/form[2]/div[3]/button").click();
        page.waitForTimeout(3000);
    }

    public void inputDataBisnis()
    {
        page.locator("//*[@id=\"Value\"]").fill("Par454");
        page.locator("//*[@id=\"Name\"]").fill("Paracetamol");
        page.locator("//*[@id=\"TaxID\"]").fill("GTH74");

    }
}
