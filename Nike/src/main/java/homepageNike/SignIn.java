package homepageNike;

import base.CommonAPI;

public class SignIn extends CommonAPI {
    public void signInOrCreateButton() {
        isElementDisplayed("//button[@class='nav-btn p0-sm prl3-sm pt2-sm pb2-sm fs12-nav-sm d-sm-b nav-color-grey hover-color-black']");
    }

    public void clickOnSignInEmailArea() {
        clickOnElementByXpath("//button[@class='nav-btn p0-sm prl3-sm pt2-sm pb2-sm fs12-nav-sm d-sm-b nav-color-grey hover-color-black']");
    }
}