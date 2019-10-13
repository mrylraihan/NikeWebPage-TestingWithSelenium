package homePageTestsNike;

import homepageNike.GenderButtons;
import org.testng.annotations.Test;

public class KidsButtonTests extends GenderButtons {
    @Test
    public void validateKidsButton(){
        clickKidsButton();
    }
}
