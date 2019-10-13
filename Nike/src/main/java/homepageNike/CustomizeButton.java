package homepageNike;

import base.CommonAPI;

public class CustomizeButton extends CommonAPI {
    public void clickOnCustomizeButton(){
        clickOnElementByXpath("//a[contains(text(),'CUSTOMIZE')]");
    }
}
