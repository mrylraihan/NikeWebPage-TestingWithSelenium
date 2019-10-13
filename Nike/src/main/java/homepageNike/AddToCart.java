package homepageNike;

import base.CommonAPI;
import org.openqa.selenium.By;

public class AddToCart extends CommonAPI {

    public void searchForShoesAndAddToCart() {
        driver.findElement(By.xpath("//input[@id='TypeaheadSearchInput']")).sendKeys("Nike Air Max 270 React");
        driver.findElement(By.xpath("//button[@class='btn-search z2 bg-transparent']")).click();
        sleepFor(2);
        driver.findElement(By.xpath("//a[contains(text(),'Nike Air Max 270 React (Mid-Century Art)')]")).click();
        sleepFor(2);
        driver.findElement(By.xpath("//form[@id='buyTools']//div[@role='radiogroup']/label[.='10']")).click();
        sleepFor(2);
        driver.findElement(By.xpath("//button[@class='ncss-btn-primary-dark btn-lg css-y0myut addToCartBtn']")).click();
        sleepFor(2);
        driver.findElement(By.xpath("//button[@class='ncss-btn-secondary-dark btn-lg mr3-sm css-1n4ymyz']")).click();
        sleepFor(2);
    }
}
