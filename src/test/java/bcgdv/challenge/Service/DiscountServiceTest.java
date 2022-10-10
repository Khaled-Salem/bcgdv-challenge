package bcgdv.challenge.Service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DiscountServiceTest {

    @Autowired
    private DiscountService discountService;

    @Test
    void getDiscountByWatchId() {
        var discount = discountService.getDiscountByWatchId(1);
        assertEquals(3, discount.getQuantity());
    }
}