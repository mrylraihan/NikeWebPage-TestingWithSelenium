package homePageTestsNike;

import homepageNike.Search;
import org.testng.annotations.Test;

public class SearchTests extends Search {
    @Test(enabled = false )
    public void typeAbilityTestForSearchField(){
        searchFieldIsTypeAble();
    }

    @Test
    public void validateSearchButtonWorks(){
        searchFieldIsTypeAble();
        clickOnSearchButton();
    }
}
