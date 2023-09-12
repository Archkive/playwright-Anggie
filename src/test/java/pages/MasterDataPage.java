package pages;
import org.junit.Test;
import utils.TestBase;
public class MasterDataPage extends TestBase {
    public MasterDataPage(){}

    public void navigateMasterData()
    {
        page.locator("//html/body/div[2]/div[1]/div/div[1]/div[1]/div/nav/ul[2]/li[4]/a").click();
        page.waitForTimeout(1000);
    }

    public void navigateProduct()
    {
        page.locator("//html/body/div[2]/div[1]/div/div[1]/div[1]/div/nav/ul[2]/li[4]/ul/li[1]/a").click();
        page.waitForTimeout(1000);
        page.locator("//html/body/div[2]/div[1]/div/div[2]/main/div/div/form[2]/div[3]/button").click();
    }

    public void inputData()
    {
        page.waitForSelector("//*[@id=\"CreateProduct\"]").isVisible();
        page.locator("//*[@id=\"Value\"]").fill("323412");
        page.locator("//*[@id=\"Name\"]").fill("Storm");
        page.locator("//html/body/div[2]/div[1]/div/div[2]/main/div[1]/fieldset/form/div[1]/div[2]/div[3]/span/span[1]/span").click();
        page.locator("(//li[contains(@id,'select2-C_')])[3]").click();
        page.locator("//html/body/div[2]/div[1]/div/div[2]/main/div[1]/fieldset/form/div[1]/div[2]/div[4]/span/span[1]/span").click();
        page.locator("(//li[contains(@id,'select2-M_Product_Category')])[1]").click();
        page.locator("//html/body/div[2]/div[1]/div/div[2]/main/div[1]/fieldset/form/div[1]/div[2]/div[5]/span/span[1]/span").click();
        page.locator("(//li[contains(@id,'select2-C_TaxCategory_')])[1]").click();
        page.waitForTimeout(1000);
    }


}
