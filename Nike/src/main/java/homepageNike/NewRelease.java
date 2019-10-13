package homepageNike;

import base.CommonAPI;
import org.testng.Assert;

public class NewRelease extends CommonAPI {
    public void newReleasesPage() {
        String value = getValueByXpath("//a[@class='nav-brand fs16-nav-sm prl5-sm pt6-sm pb6-sm nav-uppercase d-sm-ib va-sm-m'][contains(text(),'NEW RELEASES')]");
        System.out.println(value);
        //Assert.assertEquals(actual,expected);
        //  Assert.assertEquals(value, "New Releases");

        boolean flag = isElementDisplayed("//a[@class='nav-brand fs16-nav-sm prl5-sm pt6-sm pb6-sm nav-uppercase d-sm-ib va-sm-m'][contains(text(),'NEW RELEASES')]");

        Assert.assertEquals(flag, true);
    }
}
