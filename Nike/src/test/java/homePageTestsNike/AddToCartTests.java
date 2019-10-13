package homePageTestsNike;

import homepageNike.AddToCart;
import org.testng.annotations.Test;

public class AddToCartTests extends AddToCart {
    @Test
    public void testCart(){
    searchForShoesAndAddToCart();
}

}
