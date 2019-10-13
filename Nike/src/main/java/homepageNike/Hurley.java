package homepageNike;

import base.CommonAPI;

public class Hurley extends CommonAPI {
    public void clickHurleyPage() {
        clickOnElementByXpath("//ul[@class='l-brand-navigation fl-sm-l d-sm-ib']//li[3]//a[1]");
    }
}


