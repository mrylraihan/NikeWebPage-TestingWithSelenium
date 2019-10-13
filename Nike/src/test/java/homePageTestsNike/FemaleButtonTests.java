package homePageTestsNike;

import homepageNike.GenderButtons;
import org.testng.annotations.Test;

public class FemaleButtonTests extends GenderButtons {
    @Test
    public void validateFemaleButton(){
        clickFemaleButton();
    }
}
