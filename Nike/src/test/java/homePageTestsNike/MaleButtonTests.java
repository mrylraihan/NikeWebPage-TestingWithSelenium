package homePageTestsNike;
import homepageNike.GenderButtons;
import org.testng.annotations.Test;

public class MaleButtonTests extends GenderButtons {
    @Test
    public void validateMaleButton(){
        clickMaleButton();
    }
}
