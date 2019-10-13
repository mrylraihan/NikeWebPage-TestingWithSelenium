package homepageNike;

import base.CommonAPI;

public class Converse extends CommonAPI {
    public void clickConversePage() {
        clickOnElementByXpath("//ul[@class='l-brand-navigation fl-sm-l d-sm-ib']//li[4]//a[1]");
    }
}
