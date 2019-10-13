package homepageNike;

import base.CommonAPI;
import org.testng.Assert;

public class Search extends CommonAPI {
    public void searchFieldIsTypeAble() {
        //for understanding
//        boolean condition = isElementDisplayed("//input[@id='TypeaheadSearchInput']");
//        Assert.assertEquals(condition,true);
        Assert.assertEquals(isElementDisplayed("//input[@id='TypeaheadSearchInput']"), true);
        clickOnElementByXpath("//input[@id='TypeaheadSearchInput']");
        typeOnElementByXpath("//input[@id='TypeaheadSearchInput']", "Nike Air Max 270 React");
    }

    public void clickOnSearchButton() {
        clickOnElementByXpath("//button[@class='btn-search z2 bg-transparent']");
    }

}

//9/25/2019 class time 4:26 only an hour left