package homePageTestsNike;

import homepageNike.CustomizeButton;
import org.testng.annotations.Test;

public class CustomizePageTests extends CustomizeButton {
    @Test
    public void ValidateCuztomizePage(){
        clickOnCustomizeButton();
    }
}
