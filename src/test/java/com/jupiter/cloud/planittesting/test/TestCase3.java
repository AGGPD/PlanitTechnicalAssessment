package com.jupiter.cloud.planittesting.test;

import com.jupiter.cloud.planittesting.base.BaseTest;
import com.jupiter.cloud.planittesting.shop.CartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 extends BaseTest {

    @Test
    public void test3() {

        var shopPage = homePage.goToShopPage();

        //add products to cart
        shopPage.buyProduct("Stuffed Frog", 2);
        shopPage.buyProduct("Fluffy Bunny", 5);
        shopPage.buyProduct("Valentine Bear", 3);

        //go to cart page
        shopPage.goToCartPage();
        var cartPage = new CartPage();

        // verify prices
        Assert.assertEquals(cartPage.getProductPrice("Stuffed Frog"),
                10.99, "Stuffed Frog price mismatch");
        Assert.assertEquals(cartPage.getProductPrice("Fluffy Bunny"),
                9.99, "Fluffy Bunny price mismatch");
        Assert.assertEquals(cartPage.getProductPrice("Valentine Bear"),
                14.99, "Valentine Bear price mismatch");

        // Verify subtotals
        Assert.assertEquals(cartPage.getProductSubtotal("Stuffed Frog"),
                10.99 * 2,"Stuffed Frog subtotal mismatch");
        Assert.assertEquals(cartPage.getProductSubtotal("Fluffy Bunny"),
                9.99 * 5, "Fluffy Bunny subtotal mismatch");
        Assert.assertEquals(cartPage.getProductSubtotal("Valentine Bear"),
                14.99 * 3, "Valentine Bear subtotal mismatch");

        // Verify total
        double expectedTotal = (10.99 * 2) + (9.99 * 5) + (14.99 * 3);
        Assert.assertEquals(cartPage.getTotal(), expectedTotal,"Total mismatch");
    }
}
