package homePageTestsNike;

import homepageNike.SignIn;
import org.testng.annotations.Test;

public class SignInTest extends SignIn {
    @Test
        public void validateSignInButton () {
        signInOrCreateButton();
        clickOnSignInEmailArea();
        }
    }