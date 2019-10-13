package homePageTestsNike;

import homepageNike.Converse;
import org.testng.annotations.Test;

public class ConverseTests extends Converse {
    @Test
   public void validateConversePage(){
        clickConversePage();
    }
}
