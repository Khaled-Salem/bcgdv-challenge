package bcgdv.challenge.Controller;

import bcgdv.challenge.Service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class CheckoutController {
    @Autowired
    private CheckoutService checkoutService;

    @PostMapping("/checkout")
    public Integer checkout(@RequestBody Integer[] ids){
        int finalPrice = checkoutService.calculatePrice(ids);

        return 1;
    }
}
