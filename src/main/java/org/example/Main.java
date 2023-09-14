package org.example;
import com.microsoft.playwright.*;

import java.net.URL;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            BrowserType.LaunchOptions headless = new BrowserType.LaunchOptions().setHeadless(false);
            Browser browser = playwright.firefox().launch(headless);
            Page page = browser.newPage();
            page.setDefaultTimeout(180000);
            //home page
            String urlHome="http://pakedus.kinnarastudio.com:8080/web/login";
            page.navigate(urlHome);
            page.locator("//*[@id=\"loginForm\"]").isVisible();
            page.locator("//*[@id=\"j_username\"]").fill("anggie.rinovka");
            page.locator("//*[@id=\"j_password\"]").fill("anggie.rinovka");
            page.locator("//html/body/div[2]/div[2]/div/div/main/form/table/tbody/tr[3]/td[2]/i/input").click();
            page.waitForTimeout(5000);

            //welcome page
            String url = "http://pakedus.kinnarastudio.com:8080/web/userview/pakedusid/pakedusid/_/welcome";
            page.navigate(url);
            page.waitForTimeout(5000);
            page.locator("//html/body/div[2]/div[1]/div/div[1]/div[1]/div/nav/ul[2]/li[2]/a").isVisible();
            page.locator("//html/body/div[2]/div[1]/div/div[1]/div[1]/div/nav/ul[2]/li[2]/a").click();
            page.waitForTimeout(3000);
            page.locator("//html/body/div[2]/div[1]/div/div[1]/div[1]/div/nav/ul[2]/li[2]/ul/li[1]/a").isVisible();
            page.locator("//html/body/div[2]/div[1]/div/div[1]/div[1]/div/nav/ul[2]/li[2]/ul/li[1]/a").click();
            page.waitForTimeout(3000);

            ////Order Section
            // Busindess partner
            page.locator("//*[@id=\"CreateOrderShipment\"]").isVisible();
            page.locator("//html/body/div[2]/div[1]/div/div[2]/main/div[1]/fieldset/form/div[1]/div[2]/div[1]/span/span[1]/span").click();
            page.locator("(//li[contains(@id,'select2-C_')])[2]").click();
            // Payment rule
            page.locator("//html/body/div[2]/div[1]/div/div[2]/main/div[1]/fieldset/form/div[1]/div[2]/div[2]/span/span[1]/span").click();
            page.locator("(//li[contains(@id,'select2-PaymentRule')])[3]").click();
            // Product
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

            ////Shipment Section

            ////Location
            page.locator("//html/body/div[2]/div[1]/div/div[2]/main/div[1]/fieldset/form/div[2]/div[2]/div[1]/span/span[1]/span").click();
            page.locator("(//li[contains(@id,'select2-C_BPartner_Location')])[2]").click();

            //Courier
            page.locator("//html/body/div[2]/div[1]/div/div[2]/main/div[1]/fieldset/form/div[2]/div[2]/div[2]/span/span[1]/span").click();
            page.locator("(//li[contains(@id,'select2-AD_User_')])[3]").click();

            //Description
            page.locator("(//*[@id=\"Description\"])[1]").fill("Dikirim Secepatnya");
            page.waitForTimeout(1000);



            //Shipment item
            page.locator("(//*[@id=\"Description\"])[2]").fill("Mousepad");
            page.locator("//*[@id=\"submit\"]").click();
            page.waitForTimeout(10000);
//            page.navigate("http://pakedus.kinnarastudio.com:8080/web/userview/pakedusid/pakedusid/_/welcome");
//            page.waitForTimeout(40000);
        }
    }
}