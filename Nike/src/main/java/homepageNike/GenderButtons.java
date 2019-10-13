package homepageNike;

import base.CommonAPI;

public class GenderButtons extends CommonAPI {
    public void clickMaleButton() {
        clickOnElementByXpath("//body/div[@id='gen-nav-commerce-header']/header[@class='l-header using-keyboard n10f8']/nav[@class='ncss-container bg-white']/section[@class='d-sm-b']/div[@class='l-nav ncss-row border-nav-bottom']/div[@class='l-nav-menu d-sm-h d-lg-b']/ul[@class='ta-sm-c']/li[2]/a[1]");
    }
    public void clickFemaleButton() {
        clickOnElementByXpath("//a[@class='nav-brand fs16-nav-sm prl5-sm pt6-sm pb6-sm nav-uppercase d-sm-ib va-sm-m'][contains(text(),'WOMEN')]");
    }

    public void clickKidsButton() {
        clickOnElementByXpath("//a[@class='nav-brand fs16-nav-sm prl5-sm pt6-sm pb6-sm nav-uppercase d-sm-ib va-sm-m'][contains(text(),'KIDS')]");
    }
}
