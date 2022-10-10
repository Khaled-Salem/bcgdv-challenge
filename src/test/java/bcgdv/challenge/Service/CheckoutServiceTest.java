package bcgdv.challenge.Service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CheckoutServiceTest {
    @Autowired
    private CheckoutService checkoutService;

    @Test
    void calculatePriceNoDiscount() {
        Integer[] cart = {1, 1, 2, 3};
        int price = checkoutService.calculatePrice(cart);
        assertEquals(330, price);
    }

    @Test
    void calculatePriceWithDiscount() {
        Integer[] cart = {1, 1, 1, 3};
        int price = checkoutService.calculatePrice(cart);
        assertEquals(250, price);
    }

    @Test
    void calculateEmptyCart() {
        Integer[] cart = {};
        int price = checkoutService.calculatePrice(cart);
        assertEquals(0, price);
    }

    @Test
    void calculateZeroDiscount() {
        int discount = checkoutService.calculateDiscount(1, 1);
        assertEquals(0, discount);
    }

    @Test
    void calculateOnceDiscount() {
        int discount = checkoutService.calculateDiscount(1, 3);
        assertEquals(100, discount);
    }

    @Test
    void calculateMultipleDiscount() {
        int discount = checkoutService.calculateDiscount(1, 9);
        assertEquals(300, discount);
    }


}